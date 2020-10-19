package com.example.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
@Order(1)
public class CacheableAspect {

	@Around("@annotation(Cacheable)")
	public Object getFromCache(ProceedingJoinPoint joinPoint) throws Throwable {
		Object[] args = joinPoint.getArgs();
		MethodSignature signature = (MethodSignature) joinPoint.getSignature();
		Method method = signature.getMethod();
		Cacheable cacheable = method.getAnnotation(Cacheable.class);
		ExpressionParser elParser = new SpelExpressionParser();
		Expression expression = elParser.parseExpression(cacheable.record());
		Integer recordId = (Integer) expression.getValue(args);

		// fetch from cache in case record missing in cache then return from service method
		//for testing not including cachingframework call , for even number it will return caching result otherwise it will call method function.
		if(recordId % 2 == 0) {
			return "Return from cache";
		}
		return joinPoint.proceed();
	}


}

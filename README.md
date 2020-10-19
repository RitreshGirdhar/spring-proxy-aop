# Spring Boot Aop Demo - Proxy Pattern implementation

Created this application for a friend who was looking for some way to introduce caching layer as a proxy in his application. He had multiple caching source and he wanted to abstract that logic from the existing application

#### Pre-requisite
* Knowledge of Spring Boot + AOP concept. Structural Proxy Design pattern knowledge will also help.

## How to build Application 
```
cd spring-proxy-aop
docker build -t spring-proxy-demo .
```

## How to run it
```
docker run -p8080:8080 spring-proxy-demo -d
```

## Proxy Pattern

As described here https://refactoring.guru/design-patterns/proxy .

**__Proxy Pattern is a structural design pattern that lets you provide a substitute or placeholder for another object__**

Here we are using Proxy Pattern for getting cached result on the bases of the record id in case of cache miss it will invoke the actual function. In real world application we require to save the hits on the resource that we could do by adding proxy layer of caching. There are various caching framework and libraries here we are using spring cache.

Thanks for reading, Happy Learning !!!!

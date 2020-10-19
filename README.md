# Spring boot starter - Proxy Pattern implementation via AOP

Created this application for a friend who was looking for some way to introduce caching layer as a proxy in his application. He had multiple caching source and he want to abstract that logic from the existing application

Pre-requisite
* Knowledge of Spring Boot, Boot Starter concept + AOP

## Build Application
```
cd spring-proxy-aop
docker build -t spring-proxy-demo .
```

## How to run it
```
docker run -p8080:8080 spring-proxy-demo -d
```

## Proxy Pattern

As described here https://refactoring.guru/design-patterns/proxy "Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object"

Here we are using proxy pattern for getting cached result rather than receiving the original value. In real world application we require to save the hits on the resource that we could do by adding proxy layer of caching. There are various caching framework and libraries here we are using spring cache.

Happy reading !!!!

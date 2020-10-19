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

## Proxy Pattern - AOP 


Happy reading !!!!

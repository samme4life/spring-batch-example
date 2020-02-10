FROM openjdk:8-jre-alpine
WORKDIR /usr/src/app
EXPOSE 8080
CMD [ "java","-jar","spring-batch-example.jar" ]
COPY target/*.jar spring-batch-example.jar
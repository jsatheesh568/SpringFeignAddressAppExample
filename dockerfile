FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} address-service.jar
ENTRYPOINT ["java","-jar","/address-service.jar"]

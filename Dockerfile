FROM openjdk:11
EXPOSE 8080
ADD target/spring-boot-docker.jar spring-boot-jenkins.jar
ENTRYPOINT ["java","-jar","/spring-boot-jenkins.jar"]
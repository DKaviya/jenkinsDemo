FROM openjdk:8
EXPOSE 2020
COPY target/service2-0.0.1-SNAPSHOT.jar service2-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/service2-0.0.1-SNAPSHOT.jar"]
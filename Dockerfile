FROM openjdk:8
EXPOSE 2020
ADD target/service2-0.0.1-SNAPSHOT.war service2-0.0.1-SNAPSHOT.war
ENTRYPOINT ["java","-jar","/service2-0.0.1-SNAPSHOT.war"]
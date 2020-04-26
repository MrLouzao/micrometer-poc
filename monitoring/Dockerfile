FROM openjdk:8-jdk-alpine

WORKDIR /home/app

COPY target/monitoring-0.0.1-SNAPSHOT.jar /home/app/

ENTRYPOINT ["java", "-jar", "/home/app/monitoring-0.0.1-SNAPSHOT.jar"]
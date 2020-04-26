# micrometer-poc
Proof of concept with Micrometer over Java Microservices. Monitors a Spring Boot application with the Prometheus and Micrometer.


Used technologies:
- Spring Boot
- Java 8
- Docker
- Micrometer
- Prometheus
- Grafana


## Run the environment

1. Create the JAR file on micrometer backend service:

```
$ mvn install
$ ./build-dockerfile.sh
```

2. Run docker compose

```
$ docker-compose up
```

Try the Prometheus dashboard: http://localhost:9090/metrics


3. Access to Grafana:

http://localhost:3000



## Dashboard for Micrometer JVM

First we must configure our data source pointing to prometheus server. After that, import the dashboard with the ID 4701 to visualize the JVM parameters.

More info: https://grafana.com/grafana/dashboards/4701


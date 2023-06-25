FROM maven:3.8.4-openjdk-17 AS build
MAINTAINER Jacek Ciesielski

COPY pom.xml /build/
COPY src /build/src/
WORKDIR /build
RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/pz-concert-office-0.0.1-SNAPSHOT.jar"]


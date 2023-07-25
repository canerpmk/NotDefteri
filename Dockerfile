
FROM adoptopenjdk:17-jdk-hotspot as builder


RUN apt-get update && apt-get install -y maven


WORKDIR /app


COPY pom.xml .
RUN mvn -B dependency:resolve dependency:resolve-plugins


COPY src ./src
RUN mvn -B clean package -DskipTests


FROM adoptopenjdk:11-jre-hotspot


WORKDIR /app


COPY --from=builder /app/target/NotDefteri.jar ./NotDefteri.jar


CMD ["java", "-jar", "NotDefteri.jar"]

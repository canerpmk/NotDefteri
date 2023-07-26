FROM openjdk:20-ea-1-bullseye
MAINTAINER experto.com
VOLUME /tmp
EXPOSE 8080
ADD target/NotDefteri-0.0.1-SNAPSHOT.jar NotDefteri.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/NotDefteri.jar"]
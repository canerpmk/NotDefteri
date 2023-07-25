FROM openjdk:8-jdk-alpine
MAINTAINER experto.com
VOLUME /tmp
EXPOSE 8080
ADD build/libs/NotDefteri-0.0.1-SNAPSHOT.jar NotDefteri.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/NotDefteri.jar"]
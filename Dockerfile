# escape=\ (backslash)
ARG JDK_VERSION=8-jdk-alpine
FROM openjdk:${JDK_VERSION}
LABEL label1="label1"

ADD target/hello-world-0.0.1-SNAPSHOT.jar hello-world-0.0.1-SNAPSHOT.jar

EXPOSE 8080
EXPOSE 80/tcp
EXPOSE 80/udp
# Starting the app
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/hello-world-0.0.1-SNAPSHOT.jar"]
FROM openjdk:8-jre-alpine
VOLUME /tmp

COPY build/libs/server-1.0-SNAPSHOT.jar app.jar

# urandom makes tomcat start up much faster
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-XX:+UnlockExperimentalVMOptions","-XX:+UseCGroupMemoryLimitForHeap","-jar","app.jar"]

EXPOSE 8080

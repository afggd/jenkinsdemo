FROM openjdk:8
ENV PROFILE  dev
WORKDIR /opt
ADD mavendockerplugindemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
EXPOSE 9002
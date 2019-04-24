FROM openjdk:8
ENV PROFILE  dev
WORKDIR /opt
ADD mavendockerplugindemo-0.0.1-SNAPSHOT.jar /opt/
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILE}","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9002", "./mavendockerplugindemo-0.0.1-SNAPSHOT.jar"]
EXPOSE 9002
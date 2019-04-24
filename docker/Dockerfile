FROM openjdk:8
ENV PROFILE  dev
WORKDIR /var/lib/docker/volumes/jenkins/_data/workspace/test001/target
ADD mavendockerplugindemo-0.0.1-SNAPSHOT.jar /var/lib/docker/volumes/jenkins/_data/workspace/test001/target/
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILE}","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9002", "./mavendockerplugindemo-0.0.1-SNAPSHOT.jar"]
EXPOSE 9002
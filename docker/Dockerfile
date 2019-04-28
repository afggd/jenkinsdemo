FROM openjdk:8
ENV PROFILE  dev
WORKDIR /opt
ADD mavendockerplugindemo-0.0.1-SNAPSHOT.jar /opt/
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime && cp /etc/timezone /etc/timezone
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILE}","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9002", "./mavendockerplugindemo-0.0.1-SNAPSHOT.jar"]
EXPOSE 9002
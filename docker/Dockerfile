FROM openjdk:8
ENV PROFILE  dev
WORKDIR /opt
ADD dtc-raffle.jar /opt/
RUN cp /usr/share/zoneinfo/Asia/Shanghai /etc/localtime
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=${PROFILE}","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=9902", "./dtc-raffle.jar"]
EXPOSE 9902
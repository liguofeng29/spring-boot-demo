FROM java:8

ADD spring-boot-demo.jar /opt/spring-boot-demo/
EXPOSE 8080
WORKDIR /opt/spring-boot-demo/
CMD ["java", "-Xms128m", "-Xmx256g", "-jar", "spring-boot-demo.jar"]
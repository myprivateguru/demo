FROM openjdk:8
EXPOSE 8081
ADD target/demo.jar demo.jar
ENTRYPOINT ["java","-jar","/demo.jar" ]
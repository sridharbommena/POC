#Alpine Linux with OpenJDK JRE
FROM openjdk:8-jre-alpine

#copy JAR into the image
COPY target/*.jar app.jar

#run application
ENTRYPOINT ["java","-jar","/app.jar"]
FROM eclipse-temurin:17
COPY target/myWebApp.jar myWebApp.jar
CMD [ "java","-jar","myWebApp.jar"]
FROM openjdk:8
EXPOSE 8080
ADD target/mypkgassignment.Calculator.jar mypkgassignment.Calculator.jar
ENTRYPOINT [ "java", "-jar","/mypkgassignment.Calculator.jar" ]
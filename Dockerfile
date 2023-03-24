FROM openjdk:8
EXPOSE 8080
ADD target/assingnment1.b1.h.jar assignment1.b1.h.jar
ENTRYPOINT [ "java", "-jar","/assignment1.b1.h.jar" ]
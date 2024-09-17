FROM openjdk:17
EXPOSE 9090
ADD target/bootdocker.jar bootdocker.jar
ENTRYPOINT [ "java","-jar","bootdocker.jar" ]
FROM eclipse-temurin:17

WORKDIR /u/myapp

COPY build/libs/*[^ecs].jar ./

CMD java -Dserver.port=8080 -jar *.jar

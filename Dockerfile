FROM eclipse-temurin:21

LABEL mentainer = "sujaishanmugam.net@gmail.com"

WORKDIR /app

COPY /target/bookStore-0.0.1-SNAPSHOT.jar /app/bookStore.jar

ENTRYPOINT ["java" , "-jar" , "bookStore.jar"]
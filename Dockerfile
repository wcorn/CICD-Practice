FROM openjdk:11
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} Pureum-0.0.1-SNAPSHOT.jar
EXPOSE 9000
ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar /app.jar"]
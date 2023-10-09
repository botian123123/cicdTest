FROM  openjdk:11-jre-slim
LABEL app="cicdtest" version="0.0.1"
ENV DYNAMIC_JAR_NAME=cicd-test-$timestamp
COPY ./target/${DYNAMIC_JAR_NAME}.jar cicdtest.jar
CMD java -jar cicdtest.jar
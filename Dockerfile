FROM  openjdk:11-jre-slim
LABEL app="cicdtest" version="0.0.1"
COPY ./mainmod/target/cicd-test.jar cicdtest.jar
CMD java -jar cicdtest.jar
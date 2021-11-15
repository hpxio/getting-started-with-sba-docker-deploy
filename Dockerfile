FROM openjdk:8
ADD target/sba-deploy-0.0.1.jar sba-deploy-0.0.1.jar
EXPOSE 8089

ENTRYPOINT ["java", "-jar", "sba-deploy-0.0.1.jar"]
FROM openjdk:11.0.11-jre

# Copy war file
COPY devhub-developers-social-0.0.1-SNAPSHOT.jar /devhub-developers-social.war

# run the app
CMD ["java","-Djava.security.egd=file:/dev/./urandom", "-jar", "/devhub-developers-social.war"]
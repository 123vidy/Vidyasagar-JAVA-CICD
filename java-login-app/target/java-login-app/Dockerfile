# Use Tomcat base image with Java 11
FROM tomcat:9-jdk11

# Copy the WAR file into Tomcat webapps directory
COPY target/java-login-app.war /usr/local/tomcat/webapps/

# Expose port 8080 (Tomcat default)
EXPOSE 8080

# Start Tomcat
CMD ["catalina.sh", "run"]

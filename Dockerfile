FROM openjdk:17-jdk-slim

#COPIAR una serie de archivos de mi maquina host al sistema de archivos DOCKER
#--> 1. para correr la aplicacion necesito el ejecutable que es .JAR
# SOLO se tiene el target --> para obtener el JAR usar Maven con: mvn clean package
# eso me genera el JAR que es el ejecutable de la aplicacion JAVA
#   ENTONCES se generara un SNAPSHOT.jar en target

#ENV DATABASE_URL jdbc:mariadb://localhost:3312/mydb777
#ENV DATABASE_USERNAME root
#ENV DATABASE_PASSWORD Password123!
##ENV DATABASE_PLATFORM org.hibernate.dialect.MySQLDialect
#ENV DATABASE_DRIVER org.mariadb.jdbc.Driver

COPY target/places-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
#ejecutar jar
ENTRYPOINT ["java", "-jar","app.jar"]
FROM mcr.microsoft.com/openjdk/jdk:21-ubuntu
#VOLUME /tmp
ARG JAVA_OPTS
ENV JAVA_OPTS=$JAVA_OPTS
COPY target/usuarios-0.0.1-SNAPSHOT.jar usuarios.jar
EXPOSE 8080
#ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -jar usuarios.jar"]
# For Spring-Boot project, use the entrypoint below to reduce Tomcat startup time.
ENTRYPOINT ["sh", "-c", "exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar usuarios.jar"]

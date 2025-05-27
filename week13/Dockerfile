FROM eclipse-temurin:17-alpine

# Setting Timezone to UTC
RUN apk add tzdata
RUN ln -s /usr/share/zoneinfo/Etc/UTC /etc/localtime
RUN echo "Etc/UTC" > /etc/timezone

# Install curl for HealthCheck
RUN apk --no-cache add curl

# Extract Server Jar
ARG JAR_FILE=build/libs/week13-*.jar
COPY ${JAR_FILE} week13-server.jar

ENTRYPOINT ["java", "-Djava.security.egd=file:/dev/./urandom", "-server", "-jar", "/week13-server.jar"]
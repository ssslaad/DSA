# Use Ubuntu as base image
FROM mcr.microsoft.com/devcontainers/base:ubuntu

# Install OpenJDK 21
RUN apt-get update && \
    apt-get install -y wget gnupg && \
    wget -qO - https://packages.adoptium.net/artifactory/api/gpg/key/public | apt-key add - && \
    echo "deb https://packages.adoptium.net/artifactory/deb focal main" | tee /etc/apt/sources.list.d/adoptium.list && \
    apt-get update && \
    apt-get install -y temurin-21-jdk
RUN apt-get update && apt-get install -y maven
RUN mvn -v

# Set JAVA_HOME
ENV JAVA_HOME=/usr/lib/jvm/temurin-21-jdk
ENV PATH="$JAVA_HOME/bin:$PATH"
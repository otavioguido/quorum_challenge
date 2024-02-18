# Quorum challenge

## Table of Contents

- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Repository](#repository)

## Prerequisites

- Java 17
  - [windows](https://docs.oracle.com/en/java/javase/17/install/installation-jdk-microsoft-windows-platforms.html#GUID-A7E27B90-A28D-4237-9383-A58B416071CA)
  - [mac](https://docs.oracle.com/en/java/javase/17/install/installation-jdk-macos.html#GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE)
  - [linux](https://www.rosehosting.com/blog/how-to-install-java-17-lts-on-ubuntu-20-04/)
- Maven 3.9.6
  - [windows](https://phoenixnap.com/kb/install-maven-windows)
  - [mac](https://www.digitalocean.com/community/tutorials/install-maven-mac-os)
  - [linux](https://www.digitalocean.com/community/tutorials/install-maven-linux-ubuntu)
- Node 20.11.1
  - [linux](https://github.com/nodesource/distributions)
  - [windows](https://nodejs.org/en/download/package-manager#windows-1)
  - [mac](https://nodejs.org/en/download/package-manager#macos)

## Usage

### Backend

On the backend folder, run in the command line

```
mvn clean install
java -jar target/backend-0.0.1-SNAPSHOT.jar
```

### Frontend

On the frontend folder, run in the command line

```
npm i
npm start
```

## Repository

https://github.com/otavioguido/quorum_challenge

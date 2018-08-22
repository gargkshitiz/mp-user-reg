# Simple market-place customer application 

## Tech stack
- Java
- Spring Boot
- Thymyleaf
- Swagger (for REST API documentation)
- Jackson
- Maven
- Junit
- Spring test

## Prerequisites
- JDK 1.8+
- Maven 3+

## Steps to Setup

**1. Clone the application**

```bash
git clone https://github.com/gargkshitiz/mp-user-reg.git
```

**2. Build and run the app using maven**

```bash
mvn package
java -jar target/mp-user-reg-0.0.1-SNAPSHOT.jar (Go inside project folder and run it. Make sure that java is pointing to Java 8 on the desired machine.)

```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080/mp/>.

## User Registration Link
http://localhost:8080/mp/registration

## Swagger URI for APIs

<http://localhost:8080/mp/swagger-ui.html>

## Swagger snapshot
![image](https://user-images.githubusercontent.com/5894094/44460553-29ce7180-a62b-11e8-84f6-07c3e00ddc68.png)

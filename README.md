# Simple market-place customer application 

## Tech stack
- Java
- Spring Boot
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

**2. Create Mysql database**
```bash
create database mp_app
```

**3. Change mysql username and password as per your installation**

+ open `src/main/resources/application.properties`

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**4. Build and run the app using maven**

```bash
mvn package
java -jar target/mp-user-reg-0.0.1-SNAPSHOT.jar (Go inside project folder and run it. Make sure that java is pointing to Java 8 on the desired machine.)

```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080/mp/>.

## Swagger URI

<http://localhost:8080/mp/swagger-ui.html>

## Swagger snapshot
![image](https://user-images.githubusercontent.com/5894094/43763486-7a344bac-9a48-11e8-9cc1-d0f3b8fda5bc.png)

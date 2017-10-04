### build
mvn clean package

### run
java -jar target/xx.jar

or 

mvn spring-boot:run

### check
* http://localhost:8080/
* http://localhost:8080/now
* http://localhost:8080/json
* http://localhost:8080/path/something

### NOTE
spring.main.web-environment=true
* It is often desirable to call setWebEnvironment(false) when using SpringApplication within a JUnit test.

@SpringBootApplication
* same as @Configuration @EnableAutoConfiguration @ComponentScan
### about
* Banner
* Web environment
* Application events and listeners
* ApplicatoinRunner
    * use the org.springframework.core.annotation.Order annotation if several CommandLineRunner 
    or ApplicationRunner beans are defined that must be called in a specific order.
* Application exit
* Admin features : spring.application.admin.enabled 

### build
mvn clean package

### run
java -jar target/spring-boot-demo-spring-application.jar

or 

mvn spring-boot:run

### check

* SpringApplication argument injection
    * run  
java -jar target/spring-boot-demo-spring-application.jar --debug logfile.txt debug=true
    * url  
http://localhost:8080/




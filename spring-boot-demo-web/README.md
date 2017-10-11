### about 

#### error handler
1. implements ErrorController
2. custom error page
    * resources/public/error/404.html  
    or  
    templates/error/5xx.html  
    
    templetes is higher than public
    
3. @ControllerAdvice

#### Register servlet,filter,listener
 
1. use @Controller and @RequestMapping
2. use RegistrationBean
    * ServletRegistrationBean
    * ServletListenerRegistrationBean
    * FilterRegistrationBean
3. use @WebServlet

#### upload file



### build
mvn clean package

### run
java -jar target/spring-boot-demo-web.jar

or 

mvn spring-boot:run

### check
#### error handler
* http://localhost:8081/error
* http://localhost:8081/error/runtime-exception

#### registered
http://localhost:8081/servlet1
http://localhost:8081/servlet2


#### file upload
http://localhost:8081/file/index

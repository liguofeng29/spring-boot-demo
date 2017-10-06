### about
Spring boot`s externalized configuration

```
###############################
# properties関連まとめ
###############################
0. 読み込み優先順位
     file:./config/
     file:./
     classpath:/config/
     classpath:/
      
1. デフォルトで、application, application-defaultの順で読み込まれる
2. spring.profiles.active=p1,p2の場合、application,p1,p2の順で読み込まれる
3. spring.profiles.includeで別ファイル読み込みする
4. spring.config.nameでデフォルト(application)名変更できる
5. spring.config.locationで読み込み場所を追加できる
6. SnakeYAMLがデフォルトで使える
      
      @PropertySourceで読めない

7. @Value、@ConfigurationPropertiesで取得する
8. @ValidationProperties,Properties conversionが存在する

###############################
# profile (複数環境)
###############################
★ command lineで渡すのが望ましい
spring.profiles.active=higher

or 

### command line properties

java -java xxx.jar --spring.profiles.active=xxx

```

### build
mvn clean package

### run
java -jar target/spring-boot-demo-externalized-configuration.jar

or 

mvn spring-boot:run

### check
* priority
http://localhost:9090/demo-context/priority

* placeHolder
http://localhost:9090/demo-context/placeholder

* random value
http://localhost:9090/demo-context/random

* jackson 
http://localhost:9090/demo-context/jackson

* type-safe configuration
http://localhost:9090/demo-context/typesafe








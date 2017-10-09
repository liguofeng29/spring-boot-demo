### build
mvn clean package

### run
java -jar target/spring-boot-demo-web-jsp.jar

or 

mvn spring-boot:run

### note
spring bootでのjspは幾つかの制限がある。

1. warのみサポートする。
2. 組み込みjettyはJSPをサポートしない
3. UndertowはJSPをサポートしない
4. jspのカスタムエラーページはspring bootのデフォルトエラーページを上書きできない

### check

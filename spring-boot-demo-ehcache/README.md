## about 
ezcache

## explain

### setting
- add dependency
```xml
<dependency>
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-cache</artifactId>
    </dependency>
    <dependency>
        <groupId>net.sf.ehcache</groupId>
        <artifactId>ehcache</artifactId>
    </dependency>
</dependency>
```

- add config
```yaml
spring:
  cache:
    type: ehcache
    ehcache:
      config: classpath:config/ehcache.xml
```

- ehcache.xml

#### usage
@EnableCaching   キャッシュ有効
@CacheConfig     クラス単位でキャッシュ
@Cacheable       結果をキャッシュ 
@CachePut        キャッシュ更新

### build
mvn clean package

### run
java -jar target/spring-boot-demo-ehcache.jar

or 

mvn spring-boot:run

### check
insert record to db
- http://localhost:8081/user/create/user1

cache user entity
- http://localhost:8081/user/read/{id}

update cache 
- http://localhost:8081/user/update/{id}/{name}

delete cache
- http://localhost:8081/user/delete/{id}



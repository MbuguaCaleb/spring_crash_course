**Parent in POM XML**


```aidl

It manages all of my related dependencies


<parent>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-parent</artifactId>
    <version>3.0.1</version>
    <relativePath/> <!-- lookup parent from repository -->
</parent>
    
All my dependencies under springboot starter parent
will have version 3.0.1

I do not need to specify my dependencies
  <dependencies>
        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-test</artifactId>
            <scope>test</scope>
        </dependency>
    </dependencies>
    
```

**Apache TomCat**

```aidl

It is a free implementation of the Jarkata Servelet,Jarkata expression Language and Web-Socket
technologies

It provides a pure java HTTP WebServer enviroment in which Java Code can also run

It is a Java Web Application server...


As i develop my application it receives requests and responses,and thus must run inside
a server...

Our Java Spring Boot Application runs inside this Server

My application runs as an apache TomCat Servelet and that is why
it is able to server requests

```


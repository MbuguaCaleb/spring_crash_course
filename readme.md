**Spring Boot**


```aidl

First of all it is an improvement of the spring framework

```

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

**Github Personal Account Details**

```aidl

 git config user.email "mbuguacaleb30@gmail.com"
 1082  git config user.name "MbuguaCaleb"
 
git remote add origin git@github-personal:MbuguaCaleb/spring_master_class.git


```

**Syntatic Sugar**

```aidl

Important Spring annotations,

@Bean
@Component
@ComponentScan
@Configuration
@Service
@Repository
@Autowired
@Qualifier
@ProperySource


@SpringBootApplication

Is Spring Syntantic Sugar for three Spring annotations,

@ComponentScan(basePackages = "com.codewithcaleb")
@EnableAutoConfiguration
@Configuration

@Configuration 
Configuration classes are used to create beans,conventionally
called AppConfig

@Service
Unlike other components,it offers no special functionality
over component and is instead used to show the intent of 
the class

@Repository
Used on classes that directly access the database

@Autowired
It is used for automatic injection of beans

@Qualifier
It is used in conjuction with autowired when we have
two or more similar beans

@EnableAutoConfiguration
It is even better.It makes Spring guess the configuation
based on the JAR Files available on the classpath

It can figure out what liblaries you use and pre-configure
their components without you lifting a finger

@ComponentScan
It is responsible for telling Spring where to look for components
 

```
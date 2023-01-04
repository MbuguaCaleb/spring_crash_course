**Spring Boot**


```aidl

First of all it is an improvement of the spring framework


When i use starter-web there are some dependencides it
comes with i.e tomcat that help me bootstrap an application
very fast

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


A servelet is a process that handles a Http Request and also
gets a Http Response

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

**Spring MVC**

```aidl
It abstracts all the messy details from a barebone application
when writing my apps...

It has annotations as well,

It is very complex to write custom servelets

@Controller
Marks the class as a web controller

A specialization of the @component annotation,which allows spring to autodetect implementation 
classes/beans by scanning the class path

@RestController

@Rest controller is a convenience syntax for @Controller and @ResponseBody
together

This indicates that the class is a controller and all methods in it will
return a JSON Response

@ResponseBody
It is a utilitity annotation that tells spring to automatically serialize 
return values of the classes into http responses


```

**Jackson Library**

```aidl

JSON for Java

JSON serilization and deserialization lib for Java

Eish jackson==json
```

**Java Records**

```aidl
As developers and software engineers, our aim is to always design ways to obtain maximum efficiency and if we need to write less code for it, then that’s a blessing. 

In Java, a record is a special type of class declaration aimed at reducing the boilerplate code.
 
Java records were introduced with the intention to be used as a fast way to create data carrier classes,
```

**N-Tier Application structure**

```aidl

N-tier architecture is also called multi-tier architecture because the software 
is engineered to have the processing, data management, and presentation functions physically and logically separated.  That means that these different functions are hosted on several machines or clusters, ensuring that services are provided without resources being shared and, as such, these services are delivered at top capacity.  

The “N” in the name n-tier architecture refers to any number from 1.

Not only does your software gain from being able to get services at the best possible rate, but it’s also easier to manage.  This is because when you work on one section, the changes you make will not affect the other functions.  And if there is a problem, you can easily pinpoint where it originates

```


**JPA**

```aidl

Jakata Persistence

We are able to take our classes in java and map them into database tables
without ever having to write SQL Code


We use JPA to Map our entities to our database


```


**Docker shortcuts**

```aidl

See list of running containers

(a)docker ps 

Running a docker container eg getting into a postgres terminal,

This is how i execute a container,

(b)docker exec -it {container name/id} bash

Once in the container terminal i can get into postgres

(c)psql -U {username}


POSTGRES SHORTCUTS

(a)List Dbs
\l -->list dbs

(b)Exit terminal
\q -exit

(c)connect into a specific database

\c customer

(d)viewing relations
\dt

(e)\d all relations

(f) Viewing columns in a specific table

\d customer

```

**JPA**


```aidl


Gives me the ability to log the queries that i am writing


jpa:
hibernate:
  ddl-auto: create-drop
properties:
  hibernate:
    dialect: org.hibernate.dialect.PostgreSQLDialect
    format_sql: true
show-sql: true

```

**Assignment**

```aidl

Java Optionals
```
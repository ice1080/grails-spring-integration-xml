Simple project to show issue with grails 6 and spring integration gateways defined in xml.

The same xml definition works in a spring boot 2 project with spring integration 5.5.20.


## Reproduction:

```shell
grails create-app grails-spring-integration-xml
# add spring integration dependency and xml configuration
./gradlew bootRun
```

### Spring Integration Dependency

```groovy
implementation 'org.springframework.boot:spring-boot-starter-integration'
```

### Spring Integration Definition:

* resources.xml
* TestInterface.groovy

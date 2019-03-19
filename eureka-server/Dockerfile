FROM openjdk:11

RUN mkdir /src

WORKDIR /src

ADD target/eureka-server-0.0.1-SNAPSHOT.jar /src/eureka.jar

EXPOSE 8741

RUN sh -c 'touch /src/eureka.jar'

ENTRYPOINT ["java","-jar","/src/eureka.jar"]
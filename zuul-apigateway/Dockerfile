

FROM openjdk:11

RUN mkdir /src

WORKDIR /src

ADD target/zuul-gateaway-api-0.0.1-SNAPSHOT.jar /src/zuul.jar

EXPOSE 8080

RUN sh -c 'touch /src/zuul.jar'

ENTRYPOINT ["java","-jar","/src/zuul.jar"]
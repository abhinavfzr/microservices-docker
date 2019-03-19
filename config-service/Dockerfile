
FROM openjdk:11

RUN mkdir /src

WORKDIR /src

ADD target/config-server-0.0.1-SNAPSHOT.jar /src/config.jar

EXPOSE 8888

RUN sh -c 'touch /src/config.jar'

ENTRYPOINT ["java","-jar","/src/config.jar"]
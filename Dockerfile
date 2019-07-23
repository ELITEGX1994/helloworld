FROM java:8
MAINTAINER gx<1065979893@qq.com>
WORKDIR /demo
COPY target/demo-0.0.1-SNAPSHOT.jar /demo/
EXPOSE 8080
ENTRYPOINT ["java","-jar","/demo/demo-0.0.1-SNAPSHOT.jar"]
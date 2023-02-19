FROM ubuntu:23.04

ENV JAVA_HOME=/u01/middleware/jdk-11.0.2
ENV TOMCAT_HOME=/u01/middleware/apache-tomcat-10.1.5
ENV PATH=$PATH:$JAVA_HOME/bin:$TOMCAT_HOME/bin

ADD https://download.java.net/java/GA/jdk11/9/GPL/openjdk-11.0.2_linux-x64_bin.tar.gz .
RUN tar -xzvf openjdk-11.0.2_linux-x64_bin.tar.gz
RUN rm openjdk-11.0.2_linux-x64_bin.tar.gz

ADD https://dlcdn.apache.org/tomcat/tomcat-10/v10.1.5/bin/apache-tomcat-10.1.5.tar.gz .
RUN tar -xzvf apache-tomcat-10.1.5.tar.gz
RUN rm apache-tomcat-10.1.5.tar.gz

COPY target/*.war apache-tomcat-10.1.5/webapps/
COPY run.sh /tmp/run.sh
RUN  chmod u+x /tmp/run.sh

ENTRYPOINT ["/tmp/run.sh"]

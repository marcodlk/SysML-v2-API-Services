from sbtscala/scala-sbt:openjdk-11.0.16_1.8.1_3.2.1

COPY . .

# Replace localhost with "db" as used in the docker-compose deployment
RUN sed -i 's/postgresql:\/\/localhost:5432/postgresql:\/\/db:5432/g' conf/META-INF/persistence.xml

RUN sbt clean && sbt compile

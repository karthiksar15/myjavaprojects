# myjavaprojects

kafka:

java workspace
https://www.sourcecodeexamples.net/2024/05/spring-boot-microservices-with-apache-kafka-example.html

docker commands:
docker network create kafka-net

docker run -d --net=kafka-net --name=zookeeper -e ZOOKEEPER_CLIENT_PORT=2181 confluentinc/cp-zookeeper

docker run -d --net=kafka-net --name=kafka -p 9092:9092 KAFKA_ZOOKEEPER_CONNECT=zookeeper:2181 KAFKA_LISTENER_SECURITY_PROTOCOL_MAP=PLAINTEXT:PLAINTEXT,PLAINTEXT_HOST:PLAINTEXT \
  -e KAFKA_ADVERTISED_LISTENERS=PLAINTEXT://kafka:29092,PLAINTEXT_HOST://localhost:9092 \
  -e KAFKA_LISTENERS=PLAINTEXT://0.0.0.0:29092,PLAINTEXT_HOST://0.0.0.0:9092 \
  -e KAFKA_INTER_BROKER_LISTENER_NAME=PLAINTEXT \
  -e KAFKA_OFFSETS_TOPIC_REPLICATION_FACTOR=1 \
  confluentinc/cp-kafka
  
  for UI metrics:
 docker run -d --net=kafka-net -p 9000:9000 --name kafdrop -e KAFKA_BROKERCONNECT=kafka:29092 -e JVM_OPTS="-Xms32M -Xmx64M" obsidiandynamics/kafdrop


rabbitmq:
https://rameshfadatare.medium.com/spring-boot-microservices-with-rabbitmq-example-92a38cbe08fc

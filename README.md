
### STREAMING APPLICATION USING KAFKA WITH GRADLE BUILD TOOL


This is a simple POC that has a Kafka producer, consumer application with a unit and integration test

This project is a java application using Apache Kafka with Gradle build tool.

#### Requirements
Install Kafka-confluence
Create a kafka topic called demo_java with 3 partitions for a start.

kafka-topics.sh --bootstrap-server localhost:29092 --topic demo_java --create --partitions 3 --replication-factor 1

To observe the output of our Java producer application, open the Kafka consumer CLI, kafka-console-consumer using the command:

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test-topic

<img width="1380" alt="Screenshot 2023-12-27 at 4 04 05 PM" src="https://github.com/Mamiololo01/kafka_Java_Gradle_POC/assets/67044030/d59e90b7-7897-4002-9ea7-a7738d032863">

run gradle clean test

<img width="1118" alt="Screenshot 2023-12-27 at 4 04 30 PM" src="https://github.com/Mamiololo01/kafka_Java_Gradle_POC/assets/67044030/ee42dc3d-468d-47c8-9b0d-caf8a16eba2c">


Build time was 6sec



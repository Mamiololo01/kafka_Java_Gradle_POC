
#STREAMING APPLICATION USING KAFKA WITH GRADLE BUILD TOOL**


This is a basic Kafka producer/consumer application with a unit and integration test


This project is a simple java application using Apache Kafka with Gradle build tool.

Create a kafka topic demo_java with 3 partitions:

kafka-topics.sh --bootstrap-server localhost:9092 --topic demo_java --create --partitions 3 --replication-factor 1

To observe the output of our Java producer application, open the Kafka consumer CLI, kafka-console-consumer using the command:

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic test-topic

run gradle clean test

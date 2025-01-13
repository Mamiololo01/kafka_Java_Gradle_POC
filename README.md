
# Streaming Application Using Kafka with Gradle Build Tool

This is a simple Proof of Concept (POC) that demonstrates a Kafka producer and consumer application with unit and integration tests. This project is a Java application using Apache Kafka with the Gradle build tool.

## Table of Contents
- [Requirements](#requirements)
- [Setup](#setup)
- [Running the Application](#running-the-application)
- [Testing](#testing)
- [Contributing](#contributing)
- [License](#license)

## Requirements
- [Kafka](https://kafka.apache.org/quickstart)
- [Java 8+](https://www.oracle.com/java/technologies/javase-downloads.html)
- [Gradle](https://gradle.org/install/)

## Setup
1. **Install Kafka**: Follow the [Kafka quickstart](https://kafka.apache.org/quickstart) guide to set up Kafka on your machine.
2. **Create Kafka Topic**: Create a Kafka topic called `demo_java` with 3 partitions:
   ```sh
   kafka-topics.sh --bootstrap-server localhost:9092 --topic demo_java --create --partitions 3 --replication-factor 1

Running the Application
To observe the output of the Java producer application, open the Kafka consumer CLI using the command:

kafka-console-consumer.sh --bootstrap-server localhost:9092 --topic demo_java

To run the application:

Testing
Run the unit and integration tests using Gradle:

./gradlew clean test

<img width="1380" alt="Screenshot 2023-12-27 at 4 04 05 PM" src="https://github.com/Mamiololo01/kafka_Java_Gradle_POC/assets/67044030/d59e90b7-7897-4002-9ea7-a7738d032863">

<img width="1118" alt="Screenshot 2023-12-27 at 4 04 30 PM" src="https://github.com/Mamiololo01/kafka_Java_Gradle_POC/assets/67044030/ee42dc3d-468d-47c8-9b0d-caf8a16eba2c">


Build time was 6sec


Contributing
We welcome contributions to the Kafka Java Gradle POC project. Here are the steps to get started:
1. Fork the Repository:
    * Navigate to the repository kafka_Java_Gradle_POC and click on the "Fork" button in the top-right corner to create a copy of the repository in your GitHub account.
2. Clone the Forked Repository:shgit clone https://github.com/your-username/kafka_Java_Gradle_POC.git
3. cd kafka_Java_Gradle_POCgit checkout -b my-feature
4. Make Your Changes:
    * Implement your changes or additions to the repository code. Ensure your code follows the existing code style and includes necessary documentation.
5. Commit and Push Your Changes:git add .
6. git commit -m "Description of the changes"
7. git push origin my-feature
8. Create a Pull Request:
    * Go to your forked repository on GitHub, and you should see a "Compare & pull request" button. Click on it to create a pull request to the original repository.
9. Address Review Comments:
    * Engage with the maintainers, address any review comments, and make necessary changes until your pull request is approved and merged.






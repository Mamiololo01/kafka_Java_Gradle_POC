//import kafka_demos_java.Main;
//import static.org.junit.Test;
//import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KafkaMessageIntegrationTest {


    @Test
    public void testSendMessageAndConsumeFromKafka() {

        KafkaMessageConsumer consumer = new KafkaMessageConsumer();


        int initialCounter = consumer.getCounter();

        // Given
        KafkaMessageProducer producer = new KafkaMessageProducer();

        // When
        String message = "Hello, Kafka!";
        producer.sendMessageToKafka(message);

        // When
        String topic = "test-topic";
        consumer.subscribeToMessage(topic);

        // Then
        int finalCounter = consumer.getCounter();
        assertEquals(initialCounter + 1, finalCounter);
    }
}
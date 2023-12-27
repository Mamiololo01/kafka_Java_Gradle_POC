import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;
import org.apache.kafka.common.serialization.StringDeserializer;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;

public class KafkaMessageConsumer {
    private static final String TOPIC_NAME = "test-topic";
    private static final String BOOTSTRAP_SERVERS = "localhost:29092";
    private static final String GROUP_ID = "test-group";
//    private final Consumer<String> consumer;
    private int counter = 0;
    private final KafkaConsumer consumer;

    public static void main(String[] args) {
        // Set up Kafka consumer properties
        KafkaMessageConsumer consumer = new KafkaMessageConsumer();
        consumer.subscribeToMessage(TOPIC_NAME);
    }
    public KafkaMessageConsumer() {
        Properties consumerProps = new Properties();
        consumerProps.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,
                BOOTSTRAP_SERVERS);
        consumerProps.put(ConsumerConfig.GROUP_ID_CONFIG, GROUP_ID);
        consumerProps.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG,
                StringDeserializer.class.getName());
        consumerProps.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        // Create Kafka consumer
        consumer = new KafkaConsumer<>(consumerProps);
    }
    public void subscribeToMessage(String topic) {
        // Subscribe to the Kafka topic
        consumer.subscribe(Collections.singletonList(topic));
        // Poll for new messages
        while (counter==0) {
            ConsumerRecords<String, String> records =
                    consumer.poll(Duration.ofMillis(1000));
            records.forEach(record -> {
                // Process the received message
                counter++;
                System.out.println("Received message: " + record.value());
            });
        }
    }
    public int getCounter(){
        return counter;
    }
}
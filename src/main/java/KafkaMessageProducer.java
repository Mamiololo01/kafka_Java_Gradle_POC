import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
import java.util.Properties;


public class KafkaMessageProducer {
    private static final String TOPIC_NAME = "test-topic";
    private static final String BOOTSTRAP_SERVERS = "localhost:29092";
    private final Producer<String, String> producer;
    public void sendMessageToKafka(String message) {
        ProducerRecord<String, String> record = new
                ProducerRecord<>(TOPIC_NAME, message);
        producer.send(record);
    }
    public KafkaMessageProducer() {
        Properties producerProps = new Properties();
        producerProps.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG,
                BOOTSTRAP_SERVERS);
        producerProps.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName());
        producerProps.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                StringSerializer.class.getName());

        // Create Kafka producer
        producer = new
                KafkaProducer<>(producerProps);
    }
    public static void main(String[] args) {
        // Set up Kafka producer properties
        KafkaMessageProducer producer = new KafkaMessageProducer();
        producer.sendMessageToKafka("Hello World");
    }
}
package pl.capgemini.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ApplicationProperties {

    @Value("${subscriber.kafka.consumer.url}")
    private String kafkaUrlForConsumer;

    @Value("${subscriber.kafka.consumer.port}")
    private String kafkaPortForConsumer;

    @Value("${subscriber.kafka.consumer.topics}")
    private String kafkaTopicsForConsumer;

    @Value("${subscriber.hbase.url}")
    private String hbaseUrl;

    @Value("${subscriber.hbase.port}")
    private String hbasePort;

    public String getKafkaUrlForConsumer() {
        return kafkaUrlForConsumer;
    }

    public void setKafkaUrlForConsumer(String kafkaUrlForConsumer) {
        this.kafkaUrlForConsumer = kafkaUrlForConsumer;
    }

    public String getKafkaPortForConsumer() {
        return kafkaPortForConsumer;
    }

    public void setKafkaPortForConsumer(String kafkaPortForConsumer) {
        this.kafkaPortForConsumer = kafkaPortForConsumer;
    }

    public String getHbaseUrl() {
        return hbaseUrl;
    }

    public void setHbaseUrl(String hbaseUrl) {
        this.hbaseUrl = hbaseUrl;
    }

    public String getHbasePort() {
        return hbasePort;
    }

    public void setHbasePort(String hbasePort) {
        this.hbasePort = hbasePort;
    }

    public String getKafkaTopicsForConsumer() {
        return kafkaTopicsForConsumer;
    }

    public void setKafkaTopicsForConsumer(String kafkaTopicsForConsumer) {
        this.kafkaTopicsForConsumer = kafkaTopicsForConsumer;
    }
}

package pl.capgemini;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import pl.capgemini.consumer.KafkaListenerImpl;

@SpringBootApplication
public class Application {

    public static Logger logger = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(Application.class, args);
        KafkaListenerImpl kafkaListener = ctx.getBean(KafkaListenerImpl.class);
        kafkaListener.start();
    }
}

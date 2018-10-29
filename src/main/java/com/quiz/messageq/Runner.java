package com.quiz.messageq;
import java.util.concurrent.TimeUnit;

import com.quiz.krishna.KrishnaApplication;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements CommandLineRunner {

    private final RabbitTemplate rabbitTemplate;
    private final StudentMessageReceiver receiver;

    public Runner(StudentMessageReceiver receiver, RabbitTemplate rabbitTemplate) {
        this.receiver = receiver;
        this.rabbitTemplate = rabbitTemplate;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Sending message...");
        rabbitTemplate.convertAndSend(KrishnaApplication.topicExchangeName, "grade.10.A", "Announcement");
        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
    }

}

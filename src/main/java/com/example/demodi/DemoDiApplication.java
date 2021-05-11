package com.example.demodi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DemoDiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(DemoDiApplication.class);
        MessageRenderer messageRenderer = applicationContext.getBean(MessageRenderer.class);
        messageRenderer.render();

    }

    @Bean
    public MessageProvider messageProvider() {
        return new MyMessageProvider();
    }

    @Bean
    public MessageRenderer messageRenderer() {
        return new MyMessageRenderer(messageProvider());
    }

}


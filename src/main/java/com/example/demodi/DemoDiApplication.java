package com.example.demodi;

import com.example.config.MessageConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class DemoDiApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext applicationContext = SpringApplication.run(MessageConfig.class);

        MessageRenderer messageRenderer = applicationContext.getBean(MessageRenderer.class);
        messageRenderer.render();

    }

}


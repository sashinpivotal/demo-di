package com.example.demodi;

import com.example.config.MessageConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class MyMessageProviderTest {

    private MessageProvider messageProvider;

    @BeforeEach
    void setUp() {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(MessageConfig.class);
        messageProvider = applicationContext.getBean(MessageProvider.class);
    }

    @Test
    void getMessage_should_return_My_hello_given_xxx() {

        String message = messageProvider.getMessage();
        Assertions.assertThat(message).isEqualTo("My hello!");
    }
}
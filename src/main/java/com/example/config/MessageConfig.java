package com.example.config;

import com.example.demodi.*;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.example.demodi", "com.example.internal"})
public class MessageConfig {

    @Bean
    public MessageRenderer messageRenderer(@Qualifier("mine") MessageProvider messageProvider) {

        return new MyMessageRenderer(messageProvider);
    }

}

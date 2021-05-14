package com.example.demodi;

import com.example.customAnnotations.MySpecialService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("mine")
@Profile("myProfile")
@PropertySource("classpath:/my.properties")
public class MyMessageProvider implements MessageProvider {

    @Value("${message}")
    private String message;

    @Override
    public String getMessage() {
        return message;
    }

}

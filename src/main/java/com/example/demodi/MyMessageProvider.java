package com.example.demodi;

import com.example.customAnnotations.MySpecialService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component("mine")
@Profile("myProfile")
public class MyMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "My hello!";
    }

}

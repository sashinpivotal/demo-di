package com.example.demodi;

import com.example.customAnnotations.MySpecialService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("mine")
public class MyMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "My hello!";
    }

}

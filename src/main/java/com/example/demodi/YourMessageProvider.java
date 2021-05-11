package com.example.demodi;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service("yours")
public class YourMessageProvider implements MessageProvider {

    @Override
    public String getMessage() {
        return "Your hello!";
    }
}

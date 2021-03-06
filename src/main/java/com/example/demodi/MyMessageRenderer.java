package com.example.demodi;


import com.example.customAnnotations.MySpecialService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class MyMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public MyMessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    @MySpecialService
    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}

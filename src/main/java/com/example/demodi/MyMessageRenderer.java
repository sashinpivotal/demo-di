package com.example.demodi;


import org.springframework.beans.factory.annotation.Qualifier;

public class MyMessageRenderer implements MessageRenderer {

    private MessageProvider messageProvider;

    public MyMessageRenderer(MessageProvider messageProvider) {
        this.messageProvider = messageProvider;
    }

    @Override
    public void render() {
        System.out.println(messageProvider.getMessage());
    }
}

package com.example.demodi;

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

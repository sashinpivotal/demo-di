package com.example.demodi;

import com.example.config.MessageConfig;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = MessageConfig.class)
@ActiveProfiles(profiles={"myProfile"})
class MyMessageProviderTest {

    @Autowired
    private MessageProvider messageProvider;

    @Test
    void getMessage_should_return_My_hello_given_xxx() {

        String message = messageProvider.getMessage();
        Assertions.assertThat(message).isEqualTo("My hello!");
    }

}
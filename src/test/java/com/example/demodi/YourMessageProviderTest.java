package com.example.demodi;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class YourMessageProviderTest {

    @Test
    void getMessage_should_return_Your_hello() {

        YourMessageProvider yourMessageProvider = new YourMessageProvider();
        Assertions.assertThat(yourMessageProvider.getMessage()).isEqualTo("Your hello!");
    }
}

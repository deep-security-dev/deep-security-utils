package com.deepsecurity;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UtilsTests {

    @Test
    public void testGreet() {
        String name = "Deep Security";
        String expectedGreeting = "Hello, Deep Security!";
        String actualGreeting = Utils.greet(name);

        assertEquals(expectedGreeting, actualGreeting, "Greeting message should match the expected format.");
    }
}

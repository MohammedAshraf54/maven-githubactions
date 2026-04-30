package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    void testMain() {
        String result = "Hello from Maven + GitHub Actions!";
        assertEquals("Hello from Maven + GitHub Actions!", result);
    }

    @Test
    void testAddition() {
        int sum = 2 + 3;
        assertEquals(5, sum);
    }
}

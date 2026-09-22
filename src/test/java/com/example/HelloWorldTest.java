package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloWorldTest {
    
    @Test
    public void testGetGreeting() {
        HelloWorld hw = new HelloWorld();
        assertEquals("Hello World", hw.getGreeting());
    }

    @Test
    public void testGreetingNotNull() {
        HelloWorld hw = new HelloWorld();
        assertNotNull(hw.getGreeting());
    }
}

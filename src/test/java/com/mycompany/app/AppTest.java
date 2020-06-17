package com.mycompany.app;

import org.junit.Test;

import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testAppMain() {
        App app = new App();
        assertEquals("Hell World!", app.getMessage());
    }

}

package com.example.unitteststrial4.controllers;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloControllerTest {

    @Test
    void hello(){
        HelloContoller contoller = new HelloContoller();
        String response = contoller.hello("Kennedy");
        assertEquals("Hello Kennedy", response);
    }
}

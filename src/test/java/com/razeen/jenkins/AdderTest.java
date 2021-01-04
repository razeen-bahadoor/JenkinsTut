package com.razeen.jenkins;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AdderTest {

    @Test
    public void add() {
        final int EXPECTED =4;
        int result = Adder.add(2,2);
        assertEquals(EXPECTED, result);
    }
}
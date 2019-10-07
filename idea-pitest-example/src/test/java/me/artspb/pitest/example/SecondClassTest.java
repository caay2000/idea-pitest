package me.artspb.pitest.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SecondClassTest {

    private SecondClass secondClass;

    @BeforeEach
    public void setUp() throws Exception {
        secondClass = new SecondClass();
    }

    @Test
    public void testUncoveredMethod() throws Exception {
        secondClass.uncoveredMethod();
    }

    @Test
    public void testPartiallyCoveredMethod() throws Exception {
        int output = secondClass.partiallyCoveredMethod(-2);
        assertEquals(output, 42);
    }
}
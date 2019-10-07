package me.artspb.pitest.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SimplePojoTest {

    private SimplePojo pojo;

    @BeforeEach
    public void setUp() throws Exception {
        pojo = new SimplePojo();
    }

    @Test
    public void testGetField() throws Exception {
        pojo.getField();
    }

    @Test
    public void testSetField() throws Exception {
        pojo.setField("field");
    }
}
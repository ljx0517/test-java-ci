package com.test.ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SchemaItemTest {
    @Test
    public void should_get_bool_value() {
        SchemaItem schemaItem = new SchemaItem("l:bool");
        assertEquals(schemaItem.getDescription(), "l:bool");
        assertEquals(schemaItem.getName(), "l");
        assertEquals(schemaItem.getValue(), "bool");
    }

    @Test
    public void should_get_int_value() {
        SchemaItem schemaItem = new SchemaItem("p:int");
        assertEquals(schemaItem.getDescription(), "p:int");
        assertEquals(schemaItem.getName(), "p");
        assertEquals(schemaItem.getValue(), "int");
    }
}

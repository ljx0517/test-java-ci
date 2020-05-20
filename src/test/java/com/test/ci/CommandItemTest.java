package com.test.ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandItemTest {
    @Test
    public void should_get_info_from_commandline() {
        CommandItem commandItem = new CommandItem("l", "true");
        assertEquals(commandItem.getName(), "l");
        assertEquals(commandItem.getValue(), "true");
    }
}
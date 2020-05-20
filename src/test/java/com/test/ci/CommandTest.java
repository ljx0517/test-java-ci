package com.test.ci;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CommandTest {
    @Test
    public void should_has_value() {
        Command command = new Command("-l true -d /usr/local -p 80");
        assertEquals(command.getValue("l"), "true");
    }

    @Test
    public void should_get_minus_value() {
        Command command = new Command("-l true -d /usr/local -p -80");
        assertEquals(command.getValue("p"), "-80");
    }
}

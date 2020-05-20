package com.test.ci;

import java.util.Arrays;

public class AppRunner {

    public static void main(String[] args) {
        String value = "1 ,2 ,3 ";
        String[] aa = Arrays.stream(value.split(","))
                .map((String s) -> {
                    return s.trim(); })
                .toArray(String[]::new);
        System.out.println(aa);
    }
}

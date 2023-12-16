package com.example.kochevnikmob;

import java.util.UUID;

public class UniqueCodeGenerator {
    public static String generateCode() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }
}

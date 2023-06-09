/*
 * ByteRegistry - A utility class for registering and retrieving byte array representations of strings.
 * Exalon Technologies (c) 2023-2023. All rights reserved.
 * Author: ghast#9999
 */

import java.nio.charset.StandardCharsets;

public class Example {
    public static void main(String[] args) {
        // Register a string as a byte array
        byte[] byteArray = ByteRegistry.register("Hello, world!");

        // Retrieve the string value from the byte array
        String stringValue = ByteRegistry.getString(byteArray, StandardCharsets.UTF_8);
        System.out.println(stringValue); // Output: Hello, world!
    }
}

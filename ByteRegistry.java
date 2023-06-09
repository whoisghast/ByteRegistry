/*
 * ByteRegistry - A utility class for registering and retrieving byte array representations of strings.
 * Exalon Technologies (c) 2023-2023. All rights reserved.
 * Author: ghast#9999
 */

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * The ByteRegistry class provides methods to register and retrieve byte array representations of strings.
 */
public class ByteRegistry {

    private static Map<String, byte[]> registry = new HashMap<>();

    /**
     * Registers the specified string value and returns its byte array representation
     * using the specified character encoding.
     *
     * @param value   the string value to register
     * @param charset the character encoding to use
     * @return the byte array representation of the registered string value
     */
    public static byte[] register(String value, Charset charset) {
        ByteBuffer buffer = charset.encode(value);
        byte[] byteArray = new byte[buffer.remaining()];
        buffer.get(byteArray);
        registry.put(value, byteArray);
        return byteArray;
    }

    /**
     * Registers the specified string value and returns its byte array representation
     * using the UTF-8 character encoding.
     *
     * @param value the string value to register
     * @return the byte array representation of the registered string value
     */
    public static byte[] register(String value) {
        return register(value, StandardCharsets.UTF_8);
    }

    /**
     * Retrieves the byte array representation of the specified registered string value.
     *
     * @param value the registered string value
     * @return the byte array representation of the registered string value,
     *         or null if the string value is not found in the registry
     */
    public static byte[] getByteArray(String value) {
        return registry.get(value);
    }
}

/*
 * ByteRegistry - A utility class for registering and retrieving byte array representations of strings.
 * Exalon Technologies (c) 2023-2023. All rights reserved.
 * Author: ghast#9999
 */

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/**
 * The ByteRegistry class provides methods to register and retrieve byte array representations of strings.
 * The byte arrays are converted back to strings when accessed.
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
        byte[] byteArray = value.getBytes(charset);
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
     * Retrieves the string value associated with the specified byte array representation.
     *
     * @param byteArray the byte array representation of the string value
     * @param charset   the character encoding used for decoding the byte array
     * @return the string value associated with the byte array, or null if not found
     */
    public static String getString(byte[] byteArray, Charset charset) {
        for (Map.Entry<String, byte[]> entry : registry.entrySet()) {
            if (entry.getValue() == byteArray) {
                return new String(byteArray, charset);
            }
        }
        return null;
    }
}

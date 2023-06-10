## ByteRegistry
ByteRegistry is a utility class that provides methods for registering and retrieving byte array representations of strings. It allows for efficient storage and retrieval of string values in a byte array format.

## Usage Example
```
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
```


## Features

- Register a string and obtain its byte array representation using a specified character encoding.
- Register a string and obtain its byte array representation using the UTF-8 character encoding (default).
- Retrieve the original string value associated with a given byte array representation.

## Methods

### `register(String value, Charset charset): byte[]`

Registers the specified string value and returns its byte array representation using the specified character encoding.

- `value`: The string value to register.
- `charset`: The character encoding to use.

Returns the byte array representation of the registered string value.

### `register(String value): byte[]`

Registers the specified string value and returns its byte array representation using the UTF-8 character encoding (default).

- `value`: The string value to register.

Returns the byte array representation of the registered string value.

### `getString(byte[] byteArray, Charset charset): String`

Retrieves the string value associated with the specified byte array representation.

- `byteArray`: The byte array representation of the string value.
- `charset`: The character encoding used for decoding the byte array.

Returns the string value associated with the byte array, or `null` if not found.


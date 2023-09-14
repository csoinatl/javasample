package org.so.sample;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppTest {

    private static Stream<Arguments> getTestArguments() {
        return Stream.of(
                Arguments.of(null, ""),
                Arguments.of("", ""),
                Arguments.of(" ", "%20"),
                Arguments.of("a b c", "a%20b%20c"),
                Arguments.of("%20", "%20"),
                Arguments.of("This is a test string.", "This%20is%20a%20test%20string.")
        );
    }

    @ParameterizedTest
    @MethodSource("getTestArguments")
    void testReplaceSpaceUsingReplaceAll(String input, String expected){
        assertEquals(expected, App.replaceSpaceUsingReplaceAll(input));
    }

    @ParameterizedTest
    @MethodSource("getTestArguments")
    void testReplaceUsingCharArray(String input, String expected){
        assertEquals(expected, App.replaceSpaceUsingCharArray(input));
    }
}

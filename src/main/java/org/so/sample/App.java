package org.so.sample;

import java.util.Objects;

/**
 * Write a method to replace all spaces in a string with '%20' in language of your choice,
 * verify your code by adding at least 5 test cases (suppliers to verify)
 */
public class App {

    private static final String REPLACEMENT_STRING = "%20";

    public static String replaceSpaceUsingReplaceAll(String stringToReplace) {
        if (Objects.isNull(stringToReplace))
            return "";

        return stringToReplace.replaceAll("\\s", REPLACEMENT_STRING);
    }

    public static String replaceSpaceUsingCharArray(String stringToReplace) {
        StringBuilder stringBuilder = new StringBuilder();
        if (Objects.isNull(stringToReplace))
            return "";

        for (char curChar : stringToReplace.toCharArray()) {
            if (curChar == ' ') {
                stringBuilder.append(REPLACEMENT_STRING);
            } else {
                stringBuilder.append(curChar);
            }
        }

        return stringBuilder.toString();
    }
}

package com.codedifferently.day02Wednesday;

public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        // will first convert string to array using Java split method.
        String[] strArray = str.split(" ");
        //made a reference upperCase of type String and made it an empty string.
        String upperCaseValue = "";
        // for loop designed to make the first letter in the array upper case
        for(int i = 0; i < strArray.length; i++) {
          upperCaseValue += Character.toUpperCase(strArray[i].charAt(0))+strArray[i].substring(1) + " ";
        }
        //".trim" removed all leading and trailing spaces in string
        return upperCaseValue.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        return null;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        return null;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        return null;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        return null;
    }
}

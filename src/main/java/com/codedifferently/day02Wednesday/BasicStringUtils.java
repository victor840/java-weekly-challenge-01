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
        for (int i = 0; i < strArray.length; i++) {
            upperCaseValue += Character.toUpperCase(strArray[i].charAt(0)) + strArray[i].substring(1) + " ";
        }
        //".trim" removed all leading and trailing spaces in string
        return upperCaseValue.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {

        String reverse = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse += str.charAt(i);
        }
        return reverse;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, with each word individually in reverse order
     */
    public static String reverseWords(String str) {
        // convert string to array using Java split method.
        String strArray[] = str.split(" ");
        //made a reference reverseWords of type String and made it an empty string.
        String reverseWords = "";
        for (int i = 0; i < strArray.length; i++) {
            reverseWords += BasicStringUtils.reverse(strArray[i]) + " ";
        }
        return reverseWords.trim();
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
    /*    String reversedString = BasicStringUtils.reverse(str);
        String strArray[] = reversedString.split(" " );
        String reverseThenCamelCase = "";

        for(int i = 0; i < strArray.length; i++) {
            reverseThenCamelCase += BasicStringUtils.camelCase(strArray[i]) + " ";
        } */
        String reversedString = BasicStringUtils.reverse(str);
        String strArray[] = reversedString.split(" ");
        String reverseThenCamelCase = "";
        for (int i = 0; i < strArray.length; i++) {
            reverseThenCamelCase += BasicStringUtils.camelCase(strArray[i]) + " ";
        }
        return reverseThenCamelCase.trim();
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String noFirstandlastLetter = str.substring(1, str.length() - 1);
        return noFirstandlastLetter;
    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {
        char[] inverseCasingArray = str.toCharArray();
        for (int i = 0; i < inverseCasingArray.length; i++){
            if (Character.isUpperCase(inverseCasingArray[i])){
                inverseCasingArray[i] = Character.toLowerCase(inverseCasingArray[i]);
            }else if(Character.isLowerCase(inverseCasingArray[i]))
                    inverseCasingArray[i] = Character.toUpperCase(inverseCasingArray[i]);
        }
        str = new String(inverseCasingArray);

        return str;
    }
}


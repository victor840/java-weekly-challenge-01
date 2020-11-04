package com.codedifferently.day01Tuesday;

public class BasicArrayUtils {
    /**
     * @param stringArray an array of String objects
     * @return the first element in the array
     */
    public static String getFirstElement(String[] stringArray) {

        return stringArray[0];
    }

    /**
     * @param stringArray an array of String objects
     * @return the second element in the array
     */
    public static String getSecondElement(String[] stringArray) {

        return stringArray[1];
    }

    /**
     * @param stringArray an array of String objects
     * @return stringArray with the elements in reverse order
     */
    public static String[] reverse(String[] stringArray) {
        int counter = 0;
        String[] reverseString = new String[stringArray.length];
        for(int i = stringArray.length -1; i>=0;  i--){
            reverseString[counter] =  stringArray[i];
            counter++;
        }
        return reverseString;
    }

    /**
     * @param stringArray an array of String objects
     * @return String made up of the first character in each element of stringArray
     */
    public static String getFirstLetterOfEachElement(String[] stringArray) {
        StringBuilder stringBuilder = new StringBuilder();
        for(int i =0; i < stringArray.length;i++){
            char firstLetter = stringArray[i].charAt(0);
            stringBuilder.append(firstLetter);
        }
        return stringBuilder.toString();
    }
}

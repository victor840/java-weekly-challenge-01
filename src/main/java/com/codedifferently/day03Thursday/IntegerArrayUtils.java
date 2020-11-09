package com.codedifferently.day03Thursday;

public class IntegerArrayUtils {
    /**
     * @param intArray an array of integers
     * @return the sum of `intArray`
     */
    public static Integer getSum(Integer[] intArray) {
        int sum = 0;
        for(int i = 0; i < intArray.length; i++){
            sum += intArray[i];
        }

        return sum;
    }

    /**
     * @param intArray an array of integers
     * @return the product of `intArray`
     */
    public static Integer getProduct(Integer[] intArray) {
        int product = 1;
        for(int i = 0; i < intArray.length; i++){
            product = product * intArray[i];
        }

        return product;
    }

    /**
     * @param intArray an array of integers
     * @return the sum of `intArray` divided by number of elements in `intArray`
     */
    public static Double getAverage(Integer[] intArray) {
        // created a reference called "sumOfValues" of type Double and set it to 0.0
        Double sumOfValues = 0.0;
        // created a reference called "average" of type Double and set it to 0.0
        Double average = 0.0;
        for(int i = 0; i < intArray.length; i++){
            //sumOfValues = total sum of values in array
            sumOfValues += intArray[i];
        }
        //average = (total sum of values)/(number of values in array)
        average += sumOfValues/ intArray.length;

        return average;
    }

    /**
     * @param intArray an array of integers
     * @return the largest integer in intArray
     */
    public static Integer getLargest(Integer[] intArray) {
        Integer largest = 0;
        for (int i =0; i < intArray.length; i++){
            if (intArray[i] > largest){
                largest = intArray[i];
            }
        }
        return largest;
    }
}

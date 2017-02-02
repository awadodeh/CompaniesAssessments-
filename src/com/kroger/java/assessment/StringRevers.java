package com.kroger.java.assessment;

/**
 * Created by Awad on 1/30/17.
 */
public class StringRevers {

    /**
     * 1.       Given a string, write a function or method that takes in that string, and returns the same string in reverse order.

     ·        Example: Given the string “Hello”, your program would return “olleH”
     ·        Do not assume that “Hello” is the only string it will handle
     */

    public static void main(String[] args){
        String hello = null;

        String reversedString = reverseString(hello);

        System.out.println(reversedString);
    }

    /**
     * Method to revers a string
     * @param stringToReverse
     * @return
     */
    public static String reverseString(String stringToReverse){

        char[] temp = null;

        for (int i = 0; i < stringToReverse.length(); i++) {

            int left =0;
            int right = stringToReverse.length() -1;

            if(stringToReverse.isEmpty()){
                return stringToReverse;
            }else
            {
                temp = stringToReverse.toCharArray();

                while(left < right){
                    swap(temp, left, right);
                    left++;
                    right--;
                }
            }


        }

        return new String(temp);
    }

    /**
     * Method used to swap the characters based on the indexes given
     * @param temp
     * @param left
     * @param right
     */
    private static void swap(char[] temp, int left, int right) {

        char swapedChar = temp[left];
        temp[left] = temp[right];
        temp[right] = swapedChar;
    }


}

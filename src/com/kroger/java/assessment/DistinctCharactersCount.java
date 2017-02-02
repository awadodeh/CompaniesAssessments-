package com.kroger.java.assessment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Awad on 1/30/17.
 *
 *  Given a string, return the character count for each distinct character in the string.

 ·        Example: "abacca" -> a: 3, b: 1, c: 2
 ·        Once again, do not assume that “abacca” is the only string it will handle
 */
public class DistinctCharactersCount {




    public static void main(String[] args){
        String input = "abacca";

        Map occurenceCountMap = countDistinctCharacters(input);

        printOccurenceMap(input, occurenceCountMap);

    }



    public static Map countDistinctCharacters(String input){

        if(input.isEmpty()){
            throw new NullPointerException("The input argument is empty");
        }


        Map<Character, Integer> occurenceCountMap = new HashMap<>();

        char[] charactersArray = input.toLowerCase().toCharArray();


        for (char currentChar: charactersArray){


            if(occurenceCountMap.get(currentChar) != null){

                int currentValue =  occurenceCountMap.get(currentChar);
                occurenceCountMap.put(currentChar, ++currentValue);

            }else{
                occurenceCountMap.put(currentChar, 1);
            }
        }

        return occurenceCountMap;
    }


    private static void printOccurenceMap(String inpput, Map occurenceCountMap){
        System.out.print("\"" + inpput + "\" -> ");
        occurenceCountMap.entrySet().forEach(entry -> System.out.print(entry + ", "));

    }


}

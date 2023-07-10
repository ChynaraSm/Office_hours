package week8_officeHours.evening;

import java.util.Arrays;

public class T3ReverseEach {
    public static void main(String[] args) {
        /*
        T3ReverseEach [array, loop, String]
    Create a program that will define a String array with some words. Reverse each given element and assign them to a new array for all the reverse words
    Ex:
        {can, you, join, the, team} -> [nac, uoy, nioj, eht, meat]
    Note: We will use reverse logic in the next task too, so make a reusable method that can help with that part
         */
    String[] array={"can", "you", "join", "the", "team"};// if you know elements we use this way


    String[] reverseWords=new String[array.length]; // gere we know only size
        int index=0;
        for (String each :array){
            String reversedWord=reverse(each);
            reverseWords[index++]=reversedWord;
        }

        System.out.println(Arrays.toString(reverseWords));

    }
    public static String reverse(String each){

        String reversedWord="";
        for (int i = each.length()-1; i >=0 ; i--) {
            reversedWord+=each.charAt(i);
        }
        return reversedWord;
    }


}

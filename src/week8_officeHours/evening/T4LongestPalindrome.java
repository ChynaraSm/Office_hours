package week8_officeHours.evening;

public class T4LongestPalindrome {
    public static void main(String[] args) {
        /*
        T4LongestPalindrome [array, loop, String]
    Create a program that will define a String array of words. Find the longest palindrome String from that array. If no palindrome is found print: No Palindrome Found
    Ex:
        {""java, long word, civic, apple, racecar, mom, anna, really long word}
        longest palindrome is: racecar
        {abc, hello, world, java}
        No Palindrome Found
         */

        String []array2={"abc", "hello", "world", "java"};
        //create an array
        String [] array={"java", "long word", "civic", "apple", "racecar", "mom", "anna", "really long word"};
        //we will get each element
        String longest="";

        for (String each: array){

            //we will compare that word is palindrome or not if it palindrome we will check is the longest or not

            if(isPalindrome(each) && each.length()>longest.length()){
            longest =each;
            }
        }

        System.out.println(longest);



    }

    public static boolean isPalindrome(String word) {

        //civic
        /*
        c-c
        i-i
         */
        boolean result=true;
        for (int i = 0; i < word.length()/2; i++) {
            char fromBeginning=word.charAt(i);// start from i=0
            char fromLast=word.charAt(word.length()-1-i);// moving backward
            if (fromBeginning!=fromLast){
                result=false;
            }

        }
        return result;

    }
}

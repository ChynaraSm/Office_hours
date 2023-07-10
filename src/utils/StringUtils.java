package utils;

public class StringUtils {

    public static boolean isFirstAndLastLetterSame(String each){
        each=each.toLowerCase();
        char firstLetter=each.charAt(0);
        char lastLetter=each.charAt(each.length()-1);
        return firstLetter==lastLetter;
    }
    public static String reverse(String str){
        String reverse = "";
        for(int i = str.length() - 1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String word) {
        //01234
        //civic

       /*
       c - c
       i- i
        */
        boolean result = true;
        for (int i = 0; i < word.length() / 2; i++) {
            char fromBeginning = word.charAt(i); //0
            char fromEnding = word.charAt(word.length() - 1 - i);

            if (fromBeginning != fromEnding){
                result=false;
                break;
            }
        }
        return result;
    }


}

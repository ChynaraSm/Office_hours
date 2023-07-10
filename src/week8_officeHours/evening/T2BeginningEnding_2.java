package week8_officeHours.evening;

import utils.StringUtils;

public class T2BeginningEnding_2 {
    public static void main(String[] args) {
        /*
        T2BeginningEnd [array, loop, String]
    Create a program that will define a String array with some name values. Determine how many of the names begin with and end with the same character.
    Ex:
        {Anna, Mike, Aliya, Remus, Gina, Hannah, Nathan, Otto, Kevin, Kelly}
        -> 5
    Bonus challenge: Collect all the names that start and end with the same character into an array
         */
        String [] array={"Anna", "Mike", "Aliya","Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
    int counter=0;
   for (String each:array){
       //i need to check my word's first and last letter
       if (StringUtils.isFirstAndLastLetterSame(each)){
           counter++;
       }
   }

        System.out.println(counter);
    }

   /* public static boolean isFirstAndLastLetterSame(String each){
        each=each.toLowerCase();
        char firstLetter=each.charAt(0);
        char lastLetter=each.charAt(each.length()-1);
        return firstLetter==lastLetter;
    }*/

}

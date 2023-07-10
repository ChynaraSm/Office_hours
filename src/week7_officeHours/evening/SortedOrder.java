package week7_officeHours.evening;

public class SortedOrder {
    public static void main(String[] args) {
        /*
        T3SortedOrder [loop, String]

    Create a method that accepts a String and returns a boolean.
        return true if the given String is sorted meaning the characters are in alphabetically order
        return false if the given String is not sorted

    Ex:
        input: "abcd"
        output: true

        input: "abzy"
        output: false
         */
        String word="abcd";


        boolean result=isSorted(word);
        System.out.println("result= "+result);

    }

    public static boolean isSorted(String word){

        boolean result=true;
        for (int i = 0; i < word.length()-1; i++) {
            char current=word.charAt(i);
            char next=word.charAt(i+1);
            if (current>next){
                result=false;
                break;
            }
        }
        return false;
    }
}

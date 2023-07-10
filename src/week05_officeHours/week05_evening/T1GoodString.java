package week05_officeHours.week05_evening;

public class T1GoodString {
    /*
       T1GoodString [String, indexes]
        Create a program that will check a given String. If the word "good" starts at index 1 or 2 print true otherwise print false
    ex:
        goodday --> false
        agoodmovie --> true
        nogoodtoday -> true
        notgoodfornow -> false
     */
    public static void main(String[] args) {
        String name="Adam";
        String word1="agoodmovie";
        System.out.println(word1.indexOf("good"));
        String word="nogoodtoday";
        String mySearchedWord="good";
        System.out.println();
        if (word.indexOf("good")==1 || mySearchedWord.indexOf("good")==2){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }



}

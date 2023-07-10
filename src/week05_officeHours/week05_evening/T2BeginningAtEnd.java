package week05_officeHours.week05_evening;

public class T2BeginningAtEnd {
    /*
    2BeginningAtEnd [String, indexes]

    Create a program that will check if the first two characters of a given String are also the last two characters of the String. Print true if they are the same and false if they are not the same
    ex:
        educated -> true
        java -> false
        eraser for the computer -> true
        panda giftwrap -> false
     */
    public static void main(String[] args) {
        String word="educated";
        //check if the first two characters of a given String
        //get the first char
        char firstChar=word.charAt(0);
        char secondChar=word.charAt(1);

        char lastChar=word.charAt(word.length()-1);
        char secondFromLastChar=word.charAt(word.length()-2);
        String firstTwoChar=""+firstChar+secondChar;
        String lastTwoChar=""+secondFromLastChar+lastChar;
        System.out.println(firstTwoChar+ " "+lastTwoChar);
        if (firstTwoChar.equals(lastTwoChar)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
}
}

package week10_officeHours.evening;

public class IntQuestion {
    public static void main(String[] args) {

        boolean res=sameLetter("dede");
        System.out.println(res);
    }
    public static boolean sameLetter(String word){
        return word.charAt(0)==word.charAt(word.length()-1);
    }
}

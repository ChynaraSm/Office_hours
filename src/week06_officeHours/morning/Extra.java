package week06_officeHours.morning;

public class Extra {
    /*
    swap two characters first and second first or other in the middle

    example: hello, swapChars("hamburger", 3, 6)--> hamgurbec
     */

    public static String swapChars(String str, int firstIndex, int secondIndex){
        if (firstIndex>secondIndex || firstIndex==secondIndex ||secondIndex>str.length()){
            return str;
        }

        String result="";
        char firstChar=str.charAt(firstIndex);
        char secondChar=str.charAt(secondIndex);

        result+=str.substring(0, firstIndex)+secondChar+str.substring(firstIndex+1, secondIndex)+firstChar+ str.substring(secondIndex+1);
        return result;

    }

    public static void main(String[] args) {
        System.out.println(swapChars("hamburger", 3,6));
        System.out.println(swapChars("hamburger", 3,8));
        System.out.println(swapChars("hamburger", 3, 100));
        System.out.println(swapChars("java", 0,3));
    }




}

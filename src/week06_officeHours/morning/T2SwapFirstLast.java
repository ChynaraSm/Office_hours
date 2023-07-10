package week06_officeHours.morning;

public class T2SwapFirstLast {



    public static String swapFirstLastChar(String str){
        int lastIndex=str.length()-1;
        char first=str.charAt(0);
        char last=str.charAt(lastIndex);
        return last+str.substring(1,lastIndex)+first;


    }

    public static void main(String[] args) {
        swapFirstLastChar("java");
        System.out.println(swapFirstLastChar("bread"));
        System.out.println(swapFirstLastChar("az"));//still works
        System.out.println(swapFirstLastChar("hello World"));
    }


}

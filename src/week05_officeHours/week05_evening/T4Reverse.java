package week05_officeHours.week05_evening;

import java.util.Scanner;

public class T4Reverse {
    /*
    T4Reverse [String, index]
    Create a program that will have a String that is always 5 characters long. Reverse that given String and print the reverse version

    ex:
        input: hello
        output: olleh
        input: javaa
        output: aavaj
     */

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();


        //String name="Zehra";
        // digits 01234
        System.out.println(name.charAt(4));
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(0));

        String reverse=""+name.charAt(4)+name.charAt(3)+name.charAt(2)+name.charAt(1)+name.charAt(0);
        System.out.println("reverse= "+reverse);

        String reverse2="";
        System.out.println(name.charAt(name.length()-5));
        System.out.println(name.charAt(name.length()-4));
        System.out.println(name.charAt(name.length()-3));
        System.out.println(name.charAt(name.length()-2));
        System.out.println(name.charAt(name.length()-1));


scanner.close();
    }

}

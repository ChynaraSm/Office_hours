package week05_officeHours.week05_evening;

import java.util.Scanner;

public class T5Angles {
    /*
    T5Angles [Scanner, conditional]

    Create a program that will ask the user to enter 3 angles. Add to sum of the angles and print what type of shape is made from the angles.
        If the angles add up to 180 print triangle.
        If the angles add up to 360 print circle
        For any other angle print: Cannot determine
     */
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        //we will get the first angle
        System.out.println("Please enter the first angle");
        int first=scanner.nextInt();
        //we will get the second one
        System.out.println("Please enter the second angle");
        int second=scanner.nextInt();
        System.out.println("Please enter the third one");
        //we will get thrid one
        int third=scanner.nextInt();
        //i will try to find one sum of these angles
        int sum=first+second+third;

        if (sum==180){
            System.out.println("triangle");
        } else if (sum==360){
            System.out.println("circle");
        } else{
            System.out.println("cannot determine");
        }

        scanner.close();

    }
}

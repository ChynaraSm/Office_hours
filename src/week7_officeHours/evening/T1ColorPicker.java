package week7_officeHours.evening;

import java.util.Scanner;

public class T1ColorPicker {
    public static void main(String[] args) {
        pickColor();
    }
  /*
   1ColorPicker [loop, Scanner, String]

    Create a program that will allow the user to select three unique colors.
    Ask the user to enter their colors one at a time. Verify the color hasn't been selected already. If the color is unique add it to the final selection otherwise tell the user the colors should be unique and allow them to reenter a different color. The number of iterations is not fixed

    Ex flow:
        Enter color 1:
            > red
        red added
        Enter color 2:
            > red
        red is already selected
        Enter color 2:
            > green
        green added
        Enter color 3:
            > red
        red is already selected
        Enter color 3:
            > green
        green is already selected
        Enter color 3:
            > orange
        orange added

        Here are the colors you picked: red, green, orange
     */


    public static void pickColor(){
        Scanner scanner=new Scanner(System.in);
        boolean flag=true;
        int times=1;
        String answers="";
        while (flag) {
            System.out.println("Enter color: "+times);
            String answer=scanner.next();
            /*
            eneter color 1:
            >red
            red added
             */
            if (!answers.contains(answer)){
                answers+=answer+", ";
                System.out.println(answer+ " added");
                times++;

            } else{
                System.out.println(answer+" is already selected");
            }
            if (times==4){
                flag=false;
                //means break
            }
        }

        System.out.println("Here are the colors you picked: "+answers.substring(0,answers.length()-2));

    }
}

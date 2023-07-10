package week06_officeHours.morning;

import javax.imageio.stream.ImageInputStream;

public class T1Army {
    public static void eligibleForArmy(int age, boolean hasDiploma, boolean isCitizen){
        if (age >=18 && age <=35 && hasDiploma && isCitizen){
            System.out.println("You are qualified to join the Army!");
        }else{
            System.err.println("You are not eligible to join");
            //invalid data
            if (age< 18 ){
                System.out.println(age + " is less than our minimum age");

            }else if (age>35){
                System.out.println(age+ " more than our maximum age");
            }

            if(!hasDiploma){
                System.out.println("You must have a high school diploma");
            }

            if (!isCitizen){
                System.out.println("You must be a citizen");
            }

        }

    }

    public static void main(String[] args) {
        eligibleForArmy(45, false, false);
    }
}

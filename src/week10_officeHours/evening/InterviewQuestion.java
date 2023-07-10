package week10_officeHours.evening;

public class InterviewQuestion {

    public static void main(String[] args) {
        /*
        shirts=6$
        tshirts=8$
         */
        boolean result=change(34, 3, 2);// if have change we will return false if not return trude
        System.out.println(result);



    }

    private static boolean change(int money, int numberOfShirt, int numberOfTshirt){
        return(money-(numberOfShirt*6+numberOfTshirt*8))==0;
    }
}

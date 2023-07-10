package week8_officeHours.evening;

public class T2BeginningEnding {
    public static void main(String[] args) {
        String[] array = {"Anna", "Mike", "Aliya", "Remus", "Gina", "Hannah", "Nathan", "Otto", "Kevin", "Kelly"};
         int counter=0;

         for (String each: array){

             each=each.toLowerCase();
             char firstLetter=each.charAt(0);
             char lastLetter=each.charAt(each.length()-1);

             if(firstLetter==lastLetter){
                 counter++;
             }

         }

        System.out.println(counter);

    }

}

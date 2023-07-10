package week7_officeHours.evening.Task4;

import week7_officeHours.evening.Task4.Recipe;

public class SomeRecipes {
    public static void main(String[] args) {

        Recipe r1=new Recipe();
        r1.setInfo("Egg with cheese", "Eggs, cheese, salt, butter",4,4);
        System.out.println(r1);


        System.out.println(r1.costPerPerson());

        Recipe r2=new Recipe();
        r2.setInfo("Recipe A", "A, B, C, D", 2, 20);

        System.out.println(r2);

        System.out.println(r2.costPerPerson());

    }

}

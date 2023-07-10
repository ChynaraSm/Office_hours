package week11_officeHours.evening.staticPac;

public class Cake {
    public static int numberOfSlices = 10;


    public void eatCake(int numberOfEaten) {
        numberOfSlices -= numberOfEaten;
    }
}
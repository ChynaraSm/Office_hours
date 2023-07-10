package week12_officeHours.evening.candies;

public class Candy {
    String brand;
    int quantity;
    boolean containsPeanut;
    static int totalNumberOfCandies=500_000;
    static String largestCandyConsumptionCountry="USA";

    public Candy(int quantity, boolean containsPeanut) {
        this.brand = getClass().getSimpleName();
        this.quantity = quantity;
        this.containsPeanut = containsPeanut;
    }

    @Override
    public String toString() {
        return "My Candy has " +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", containsPeanut=" + containsPeanut;
    }
}

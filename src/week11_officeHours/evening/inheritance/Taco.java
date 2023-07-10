package week11_officeHours.evening.inheritance;

public class Taco extends Entree{
    @Override
    public String toString() {
        return "Taco{" +
                "specialForEntry='" + specialForEntry + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
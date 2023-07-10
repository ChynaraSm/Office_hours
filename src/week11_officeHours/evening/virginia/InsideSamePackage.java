package week11_officeHours.evening.virginia;

public class InsideSamePackage {
    public static void main(String[] args) {
        House house=new House();
        System.out.println(house.address);
        System.out.println(house.neighborhoodName);
        System.out.println(house.price);
        // house.ownerName private area

    }
}

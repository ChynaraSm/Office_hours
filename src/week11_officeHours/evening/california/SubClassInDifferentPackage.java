package week11_officeHours.evening.california;

import week11_officeHours.evening.virginia.House;

public class SubClassInDifferentPackage extends House {
    public void testAccessModifiers() {
        System.out.println(address);
        System.out.println(price);
    }
}

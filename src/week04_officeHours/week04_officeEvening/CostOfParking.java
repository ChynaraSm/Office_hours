package week04_officeHours.week04_officeEvening;

public class CostOfParking {
    public static void main(String[] args) {
        byte time=23;
        double fee=0.0;

        String result=(time<13 && time>=6)? "Fee is 7.50":
                ((time>=13 && time<=24) || (time>=0 && time<6))? "Fee is 15": "Invalid time entry";
        System.out.println(result);

    }
}

package week12_officeHours.evening.season;

public class TestSeason {
    public static void main(String[] args) {
        Winter winter=new Winter(12, -2);
        winter.activity("skiing");


        Summer summer=new Summer(40, 18);
        summer.activity("swimming");
        System.out.println(summer);

        Spring spring=new Spring(25,5);
        spring.activity();
        System.out.println(spring);

        Fall fall=new Fall(25,5);
        fall.activity("camping");
        System.out.println(fall);

    }


}

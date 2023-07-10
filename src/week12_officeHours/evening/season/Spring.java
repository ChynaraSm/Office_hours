package week12_officeHours.evening.season;

public class Spring extends Season {

    public Spring(double highestAverageTemperature, double lowestAverageTemperature) {
        super("Spring", highestAverageTemperature, lowestAverageTemperature);
    }

    @Override
    public void activity() {
        System.out.println("In the spring we usually hike" );
    }
}

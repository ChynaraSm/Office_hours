package week12_officeHours.evening.season;

public class Season {
    String name;
    double highestAverageTemperature; //highest_average_temperature snake case
    double lowestAverageTemperature;

    public Season(String name, double highestAverageTemperature, double lowestAverageTemperature) {
        this.name = name;
        this.highestAverageTemperature = highestAverageTemperature;
        this.lowestAverageTemperature = lowestAverageTemperature;
    }

    public void activity(){
        System.out.println("You can do some activities in specific season");
    }

    public void activity(String activity){
        System.out.println("This "+getClass().getSimpleName()+", we do "+activity);
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", highestAverageTemperature=" + highestAverageTemperature +
                ", lowestAverageTemperature=" + lowestAverageTemperature +
                '}';
    }
}

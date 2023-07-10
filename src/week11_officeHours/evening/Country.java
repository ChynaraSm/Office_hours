package week11_officeHours.evening;

public class Country {
    public static String planet;
    public static double worldPopulation;
    public static double co2Level;

    public String name;
    public double population;
    public String continent;

    public Country(String name, double population, String continent) {
        this.name = name;
        this.population = population;
        this.continent = continent;
    }

    static{
        // yes you could have just initialized the variables when you declared them, but we are just practicing using static block
        planet = "Earth";
        worldPopulation = 7.88;
        co2Level = 417.83;
    }

    @Override
    public String toString() {
        return "Country{" +
                "name='" + name + '\'' +
                ", population=" + population +
                ", continent='" + continent + '\'' +
                '}' + "is in " +planet;
    }
}

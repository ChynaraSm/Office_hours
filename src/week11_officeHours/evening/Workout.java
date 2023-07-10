package week11_officeHours.evening;

public class Workout {
    private String name;
    private double duration;
    private double burnedCalories;

    public Workout(String name, double duration, double burnedCalories) {
        setName(name);
        setDuration(duration);
        setBurnedCalories(burnedCalories);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()){
            System.err.println("You can not use empty name");
            return;
        }

        boolean isValid=true;

        for (char c : name.toCharArray()) {
            if (!Character.isLetter(c) && c!=' ')
                isValid=false;
        }
        if (!isValid){
            System.err.println("Your name is not valid");
            return;
        }
        this.name = name;


    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        if (duration<=0){
            System.out.println("You can't use negative numbers");
            System.exit(0);
        }
        this.duration = duration;
    }

    public double getBurnedCalories() {
        return burnedCalories;
    }

    public void setBurnedCalories(double burnedCalories) {
        if (burnedCalories>0 && burnedCalories<1000){
            this.burnedCalories = burnedCalories;
        }else{
            System.err.println("You can't use this value");
        }

    }

    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", duration=" + duration +
                ", burnedCalories=" + burnedCalories +
                '}';
    }
}
/*
Workout [Encapsulation, access modifiers, classes, objects, methods]

    Create a class Workout
    define and encapsulate these instance variables:
        name, duration, calories burned

    create a constructor to initialize the variables. Call the setters in the constructor

    in the setters only set the values if they are valid data based on these requirements:
        name: should have only letters and spaces, no other characters type. The name cannot be empty either

        duration: should be more than 0

        calories burned: should be more than 0 and less than 1000

    create another class to test the Workout objects
 */
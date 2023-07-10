package week04_officeHours.week04_officeEvening;

public class Habitat {
    public static void main(String[] args) {
        String habitat="grasslands";
        String animals="";

        switch (habitat){
            case "grasslands":
                animals="goats, bisons, badgers, coyotes";
                System.out.println("In the "+habitat+" you will able to find: "+animals);
                break;
            case "jungle":
                animals="snakes, tigers, gorillas, rhinos, toucans";
                System.out.println("In the "+habitat+" you will able to find: "+animals);
                break;
            case "city":
                animals="dogs, cats, gulls, squirrels";
                System.out.println("In the "+habitat+" you will able to find: "+animals);
                break;
            case "safari":
                animals="lions, hippos, giraffes, zebras, elephants";
                System.out.println("In the "+habitat+" you will able to find: "+animals);
                break;
            default:
                System.out.println("Unknown habitat");
                break;
        }
    }
}

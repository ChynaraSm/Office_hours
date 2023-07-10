package week12_officeHours.evening.heroes;

import java.util.ArrayList;
import java.util.Arrays;

public class CheckHeroes {
    public static void main(String[] args) {
        Marvel  spiderman=new Marvel("Spider man", "Peter Parker", new ArrayList<>(Arrays.asList("Enhanced strength, agility, and spider-sense")));
        System.out.println(spiderman);
        spiderman.protect();

        ArrayList<String> powers=new ArrayList<>(Arrays.asList("master detective, martial arts, technical tools"));
        DC batman=new DC("Batman", "Bruce Wayne", powers,"Gotham");
        System.out.println(batman);
        batman.protect();








    }
}

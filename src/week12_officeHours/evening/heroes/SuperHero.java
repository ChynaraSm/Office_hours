package week12_officeHours.evening.heroes;

import java.util.ArrayList;

public class SuperHero {
/*
SuperHero [inheritance, overriding, constructors, super]

    Create a class SuperHero

        declare these instance variables:
            super hero name, real name, universe, powers (ArrayList of String)
            make the universe

        create a constructor to initialize all the variables

        create an instance method:
            protect() - print $super_hero protecting

        override the toString method

    Create a class Marvel
        inherits SuperHero
        make Marvel

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "Marvel"

        create a method callAvengers()
            print: Calling all avengers

        override the protect method()
            print: super_hero protecting by any means necessary

    Create a class DC
        inherits SuperHero
        make DC

        declare an instance variable: city

        create a constructor to initialize all the variables by calling the super class constructor
            set universe to "DC"

        override the protect method()
            print: super_hero protecting with honor

    Create a class CheckHeros
    create a main method
    create Marvel and DC objects and test the variables and methods


data:
    spider man, peter parker, Marvel, powers: Enhanced strength, agility, and spider-sense
    iron man, tony stark, Marvel, powers: powered suit of armor, flight, enhanced strength
    thor, thor odinson, Marvel, powers: wields hammer, controls lightning, flight
    wonder woman, diana prince, DC, powers: Enhanced strength, speed, agility, durability
    batman, bruce wayne, DC, powers: master detective, martial arts, technical tools
    superman, clark kent, DC, powers: super strength, speed, invulnerability, flight

 */
    String heroName;
    String realName;
    String Universe;
    ArrayList<String> powers;

    public SuperHero(String heroName, String realName, String universe, ArrayList<String> powers) {
        this.heroName = heroName;
        this.realName = realName;
        Universe = universe;
        this.powers = powers; //we're pointing arraylist which we created
        //this.powers=new ArrayList<>(powers); //we are creating as arrayList and copying out values in it
    }

    public void protect(){
        System.out.println(heroName+" is protecting");
    }

    @Override
    public String toString() {
        return "Super Hero: " +
                heroName + "\n " +
                "real name: " + realName + "\n" + " has powers "+
                powers;
    }
}

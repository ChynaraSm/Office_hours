package week04_officeHours.week04_officeEvening;

public class HomeLocation {
    public static void main(String[] args) {
    String hood="Highland";
    int price=0;
    double rating=0.0;
    boolean isGated=false;
    boolean petsAllowed=false;

    switch (hood){
        case "Hills":
            price=89000;
            rating=4.0;
            isGated=false;
            petsAllowed=true;
            break;
        case "Oaks":
            price=75000;
            rating=3.5;
            isGated=false;
            petsAllowed=true;
            break;
        case "Highland":
            price=150000;
            rating=4.5;
            isGated=true;
            petsAllowed=false;
            break;
        case "Canyon":
            price=201000;
            rating=4.8;
            isGated=true;
            petsAllowed=true;
            break;
        default:
            System.out.println("unknown");
        }
        String isGatedValue=isGated? "is gated": "is not gated";
        String petsAllowedValue=petsAllowed? "allowed": "not allowed";
        String petsAllowedLucky=petsAllowed? "are": "are not";
        String report="The Houses in the "+ hood+" on avaregae value at "+price+". This neighborhood "+isGatedValue+ " and the rating of the school distracts nearby is "+rating+" out of 5. For the pet owners you "+petsAllowedLucky+ " in luck because pets are "+petsAllowedValue;

        System.out.println(report);


    }
}
/*
T5HouseMarket [switch, variables]

You are buying a new house and need to collect information about the houses in a specific neighborhoods.

	Create a program that will declare and define the neighborhood name and based on the name return a report of the houses in that area. The report should include this information: the average house price, rating of school districts near by(out of 5), if it is a gated community or not, and if pets are allowed

	print the final report in this format:
		$the houses in the $neighborhood_name on average value at $average_price. This neighborhood $is_gated_or_not and the rating of the school distracts near by is $school_rating out of 5. For the pet owners you $are_or_not in luck because pets are $allowed_or_not_allowed

		Note: for simple use you can print true or false in the gated and pets parts, but for a challenge try to print the message with as many dynamic parts as possible

	Data to use:

		name - Hills
		average price - 89,000
		rating - 4.0
		gated - no
		allow pets - yes

		name - Oaks
		average price - 75,000
		rating - 3.5
		gated - no
		allow pets - yes

		name - Highland
		average price - 150,000
		rating - 4.5
		gated - yes
		allow pets - no

		name - Canyon
		average price - 201,000
		rating - 4.8
		gated - yes
		allow pets - yes
 */
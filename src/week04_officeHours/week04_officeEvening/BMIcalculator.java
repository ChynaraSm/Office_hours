package week04_officeHours.week04_officeEvening;

public class BMIcalculator {
    public static void main(String[] args) {
        int weight=0;
        double height=1.8;
        double pBMI=weight/(height*height);
        //String result="";
        if ((weight>40 && weight<185) && (height>1.2 && height<2.5)){
            if (pBMI<18.5) {
                System.out.println("Underweight");
            }else if (pBMI>=18.5 && pBMI<=24.9){
                System.out.println("Normal weight");
            }else if (pBMI>=25 && pBMI<=29.9) {
                System.out.println("Overweight");

            } else{
                System.out.println("Obese");
            }
        } else{
            System.out.println("Invalid number");
        }


    }
}
/*
T4BMI [nested if, multibranch, relational, arithmetic]

	Create a program that will calculate your BMI. Declare and assign the values for a mass (in kilograms) and height (in meters)

	first check if the given values are valid
		- the kilograms needs to be more than 40 and less than 185

		- the height also needs to be more than 1.2 and less than 2.5

		-> if either of those is not met print: "Sorry we cannot calculate the BMI with these metrics"

	if the given values are valid then calculate and print the BMI using the following formula
		BMI = mass / height^2

	use these ranges for BMI for print the result
		Less than 18.5 — Underweight
		From 18.5 to 24.9 — Normal weight
		From 25 to 29.9 — Overweight
		More than or equal to 30 — Obese

	sample data to use:
		mass = 64
		height = 1.65
		-> Normal weight

		mass = 90
		height = 1.8
		-> Overweight

		mass = 50
		height = 1.7
		-> Underweight

 */
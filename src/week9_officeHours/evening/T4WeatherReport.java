package week9_officeHours.evening;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class T4WeatherReport {
    /*
    T4WeatherReport [ArrayList, loop, operators]

    Create a program that will define an ArrayList of recent temperatures. There is always extreme temperatures so to get a better reading of the data remove the highest 2 and lowest 2 temperatures. Then give the following information based on the temperature:

        max temperature, min temperature, median (middle temperature), mean (average temperature)

        also, give a prediction temperature range for the next  few days by using the average and both adding and subtracting 5 to create the range. The values for this predication can be whole numbers

        we can assume the data will always be an odd number so there will be one median

    Ex:
        input:
            62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5

            // excluded:  42.3, 43.0, 68.9, 77.3
            // data sample: 44.8, 47.1, 48.5, 53.4, 55.4, 55.8, 62.1

        output:
            max: 62.1
            min: 44.8
            median: 53.4
            mean: 52.44
            predication: 47 - 57
     */
    public static void main(String[] args) {
        // create an array list
        ArrayList<Double> temperatures=new ArrayList<>(Arrays.asList(62.1, 68.9, 55.4, 44.8, 77.3, 43.0, 53.4, 47.1, 55.8, 42.3, 48.5));

        // we can easily sort
        Collections.sort(temperatures);
        System.out.println(temperatures);
        //we will remove the first two elements
temperatures.remove(0);
        System.out.println(temperatures);
        temperatures.remove(0);
        System.out.println(temperatures);
        //we will remove last two elements
temperatures.remove(temperatures.size()-1);
        System.out.println(temperatures);
        temperatures.remove(temperatures.size()-1);
        System.out.println(temperatures);

        double max=temperatures.get(0); //Double.MIN_VALUE; //
        double min=temperatures.get(0); //Double.MAX_VALUE;
        // we need to find sum in order to find average number

        double sum=0;

        for (Double temperature : temperatures) {
            if(temperature>max){
                max=temperature;
            }

            if(temperature<min){
                min=temperature;
            }
            sum+=temperature;
        }

        double mean=sum/ temperatures.size();
        double median=0;
            if (temperatures.size()%2==0){
               double num1=temperatures.get(temperatures.size()/2);
               double num2=temperatures.get(temperatures.size()/2-1);
               median=(num1+num2)/2;
            }else{
                median=temperatures.get(temperatures.size()/2);
            }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("median = " + median);
        System.out.println("mean = " + mean);
        System.out.println("Prediction "+ ((int)mean-5)+" ~ "+((int)mean+5));

    }

}

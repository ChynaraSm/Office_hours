package week03_morning;

public class T2SumDigits2 {
    public static void main(String[] args) {
        /*
         T2SumDigits [variables, arithmetic & shorthand operators]
    Create a program that will define an int number that ranges from 100 - 999. Take each digit individually and calculate the sum of all the digits
    Ex:
        input: 561
        output: 12
            -> 5 + 6 + 1 = 12
    Extra: Output the result in this format:
        The sum of the digits in $number is $sum
        ex: The sum of the digits in 561 is 12
         */
        int number=854;
        int sum=0;
        sum+=number%10; // remainder is 4, so num sum=4
        number/=10; //854/10=85 so number becomes 85
        sum+=number%10; // remainder is 5 so now sum=4+5
        number/=10; //85/10=8 so number becomes 8
        sum+=number%10;// remainder =8 so sum=4+5+8

        System.out.println("the sum of the number "+number+ " is "+sum);
    }
}

package week03_morning;

public class T2SumDigits {
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
        int number=567;
        int sum=0;
        sum+=567%10;//reaminder is 7, intial sum =0 therefore now it is sum=0+7
        number/=10;//567/10=56 so now number =56
        sum+=number%10; //remainder 6 so sum=7+6
        number/=10;// 56/10=5 so now number is 5
        sum+=number%10;// 5%10--> remainder is 5 so sum=7+6+5
        System.out.println(sum);
    }
}

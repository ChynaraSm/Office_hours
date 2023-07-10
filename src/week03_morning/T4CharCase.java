package week03_morning;

public class T4CharCase {
    public static void main(String[] args) {
     /*
       T4CharCase [variables, if statement, relational operator]
    Create a program that will define a char variable, which will only be defined as a letter (a-z). The character can be defined in uppercase or lowercase and we want to determine which one it is
    Output in this format:
        $character is $uppercase_or_lowercase
     */
        char letter='c';
        String result="";
        if (letter>='A' && letter<='Z' || letter>='a'&& letter<='z'){
            if (letter>='A' && letter<='Z') {
                result=" is upper-case";
            } else{
                result=" is lower-case";
            }
        }else{
            result=" not letter";
        }
        System.out.println(letter+result);
    }
}

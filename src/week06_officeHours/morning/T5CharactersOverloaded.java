package week06_officeHours.morning;

public class T5CharactersOverloaded {
     /*
    T5CharacterOverloaded [methods, loops, overloading]

    Overload the previous Character Set method by having these parameters:
        char, char

    instead of a fixed set of characters this method will return a String of all the characters between the two defined char parameters

        the first char will determine the starting point and the second character will determine the ending point

    Note: Be careful, if you give characters that cannot be within a range based on the ascii table your method will not work

    Ex:
        ('7', 'P') -> 789:;<=>?@ABCDEFGHIJKLMNOP
        ('X', '}') -> XYZ[\]^_`abcdefghijklmnopqrstuvwxyz{|}
     */


    public static String getCharacterSet(int start, int end){ //int is for ascii numbers
        String result="";
        for (  ;start<=end;start++){//i don't need to initialize a new variable instead I am choosing to iterate through the start parameter
            result+=(char)start; //concatenate char because start datatype is int

        }
        return result;

    }

    public static void main(String[] args) {
        System.out.println(getCharacterSet('7','P'));
        System.out.println(getCharacterSet(50,100));
    }
    public static String getCharactersSet(String group) {

        String allCharacters = "";
        char start;//we didn't assign
        char end;

        switch (group.toLowerCase()) {
            case "uppercase":
                start = 'A';
                end = 'Z';
                break;
            case "lowercase":
                start = 'a';
                end = 'z';
                break;
            case "digits":
            case "numbers":
                start = '0';
                end = '9';
                break;
            case "special":
                start = '!';
                end = '.';
                break;
            default:
                return "invalid group";
        }
        return getCharacterSet(start, end);
    }

}


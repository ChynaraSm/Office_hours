package week06_officeHours.morning;

public class T4Characters {
    /*
   T4CharacterSet [methods, loops]

    Create a method that has a String parameter and returns a String.
    Based on the given String a different set of characters will be returned
    use these to determine which set of characters is returned:

    based on the defined parameter return a String will all of the characters in the range

    uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
    lowercase -> abcdefghijklmnopqrstuvwxyz
    digit -> 123456789
    special -> !"#$%&'()*+,-.
     */

    public static String getCharactersSet(String group){

        String allCharacters="";
        char start;//we didn't assign
        char end;

         switch (group.toLowerCase()){
             case"uppercase":
             start='A';
             end='Z';
             break;
             case "lowercase":
                 start='a';
                 end='z';
                 break;
             case "digits":
             case "numbers":
                 start='0';
                 end='9';
                 break;
             case "special":
                 start='!';
                 end='.';
                 break;
                 default:
             return "invalid group";
         }

         for ( char letter=start; letter<=end; letter++ ){
             //System.out.print((int)letter+"");
        allCharacters+=letter;

         }
        //System.out.println();
    return allCharacters;
    }

    public static void main(String[] args) {
        System.out.println(getCharactersSet("uppercase"));
        System.out.println(getCharactersSet("lowercase"));
        System.out.println(getCharactersSet("digits"));
        System.out.println(getCharactersSet("numbers"));
        System.out.println(getCharactersSet("special"));
        System.out.println(getCharactersSet("java"));

    }


}

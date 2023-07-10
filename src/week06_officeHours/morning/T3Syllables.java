package week06_officeHours.morning;

public class T3Syllables {

    /*
    create a method that has a string parameter and return how many syllables the given word has
    ja va
    ap ple
    ham bur ger
     */
    public static int countSyllables(String str){
        int syllables =str.isEmpty()? 0:1;//for all words 1 will be the starting value except if the string is empty;
        // there always is going to be one syllable therefore is 1
        for (int i = 0; i < str.length(); i++) {// i <str.length()-1

            if (str.charAt(i)=='-'){
                syllables++;
            }
         }
        return syllables;
      }

    public static void main(String[] args) {
        System.out.println("hamburger "+countSyllables("ham-bur-ger"));
        System.out.println("delivery has syllables: "+countSyllables("de-li-ve-ry"));
        System.out.println(countSyllables(""));

    }



}

package week7_officeHours.evening;

public class CountWords {
    public static void main(String[] args) {
        /*
        T2CountWords [String, loop]

    Create a method that accepts a String and returns an int
        find how many words are in the given String and return that count
        a word is separated by a space

    Ex:
        input: "today is monday"
        output: 3
         */

        String sentence="today is monday";
        int result=countWords(sentence);
        System.out.println("result "+ result);

    }


    public static int countWords(String sentence){
        int counter=0;
        sentence=sentence.trim();
        for (int i = 0; i <sentence.length() ; i++) {
            //we need to get the each character
            char each=sentence.charAt(i);
            //if my each equals space ' " we will increase the count
            if (each==' '){
                counter++;
            }

        }
        if (sentence.isEmpty()){
            return counter;
        }else{
            return counter+1;
        }
        //in order to find the words we need to add 1 into the counter because if you have 2 space we will have 3 words

    }

}

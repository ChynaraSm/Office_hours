package week05_officeHours.week05_evening;

public class T3SearchResult {
    /*
    Create a program that will have a String in a fixed format showing the results of a search. Based on that given format find the total number of search results and print them.

    Note: make the program as dynamic as possible for different sizes(it could be a number of 10 which is only 2 number digits or 100000 which is 6 number digits)

    Fixed format of the String:
        Total results found: $results. Sort, Filter, Ratings

    ex:
        "Total results found:3012. Sort, Filter, Ratings"
        -> 3012

        "Total results found:25. Sort, Filter, Ratings"
        -> 25

    Q: what is the datatype of the number we are getting in the end?
        Follow up, we will learn how to get this as an integer number in the future
     */
    public static void main(String[] args) {
        String sentence ="teacher";
        //in order to get some part of the string we need to substring
        System.out.println(sentence.substring(2,5));

                        // Total results found:25. Sort, Filter, Ratings
        String mySentence="Total results found:3012. Sort, Filter, Rating";
        //find the index of column
        int indexOfColumn=mySentence.indexOf(":");
        int indexOfFirstDigit=indexOfColumn+1;
        System.out.println(indexOfFirstDigit);

        int indexOfDot=mySentence.indexOf(".");
        //get the part of the string substring
        mySentence.substring(indexOfFirstDigit, indexOfDot);
        System.out.println(mySentence.substring(indexOfFirstDigit, indexOfDot));


    }
}

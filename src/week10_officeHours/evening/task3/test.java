package week10_officeHours.evening.task3;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        Show lou=new Show("The last of us",1, false, new ArrayList<>(Arrays.asList("English", "Spanish")));

        Show got=new Show("Game of Thrones",8, true, new ArrayList<>(Arrays.asList("English", "Spanish", "German")));

        ShowTracker showTracker=new ShowTracker("Adam", "123", 3, new ArrayList<>(Arrays.asList(lou,got)));

        //System.out.println(showTracker);
        System.out.println(showTracker.trackedShows);

        Show ff=new Show("family of feud", 24, false, new ArrayList<>(Arrays.asList("english")));


        System.out.println("______________________after adding  A SHOW");

        showTracker.trackShow(ff);
        System.out.println(showTracker.trackedShows);

        System.out.println("--------------Get completed shows");
        System.out.println(showTracker.filteredBy(true));
        System.out.println(" Get the tracked shows which has an English language_");
        System.out.println(showTracker.filteredBy("English"));



    }
}

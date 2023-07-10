package week7_officeHours.evening.Task5;

public class SportsTeam {

    /*T5SportsTeam [object type]
    Create a class called SportsTeam
            declare these instance variables:
    name, number of players, coach, win/loss record, country, number of fans*/

    String name;
    int numberOfPlayers;
    String coach;
    String winLoss;
    String country;
    int numberOfFans;

    public void setInfo(String name, int numberOfPlayers, String coach, String winLoss, String country, int numberOfFans) {
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
        this.coach = coach;
        this.winLoss = winLoss;
        this.country = country;
        this.numberOfFans = numberOfFans;
    }

    public String toString() {
        return "The "+name+" sports team is based out of "+country+". A total of "+numberOfPlayers+" are led by "+coach+" You and "+" currently hold a "+winLoss+" a record of wins and loses. They have "+numberOfFans+" fans";
    }
}



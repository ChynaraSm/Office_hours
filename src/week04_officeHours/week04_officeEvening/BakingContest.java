package week04_officeHours.week04_officeEvening;

public class BakingContest {
    public static void main(String[] args) {
        double score1=8.5,
                score2=7.9,
                score3=8.3;
        double averageScore1=(score1+score2+score3)/3,
                averageScore2=8.5,
                averageScore3=7.9;
        if (averageScore1>averageScore2 && averageScore1>averageScore3){
            System.out.println("Congratulations you earned First place with a score of: "+averageScore1);
        } else if(averageScore1>averageScore2 && averageScore1<averageScore3 || averageScore1>averageScore3 && averageScore1<averageScore2) {
            System.out.println("Congratulations you earned Second place with a score of: "+averageScore1);
        } else{
            System.out.println("Congratulations you earned Third place with a score of: "+averageScore1);
        }

    }
}

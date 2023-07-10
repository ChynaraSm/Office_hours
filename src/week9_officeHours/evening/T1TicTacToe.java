package week9_officeHours.evening;

public class T1TicTacToe {
    /*
    create a program that will define a 2 d array for a tic tac toe. Check the board to see who won.
    X or 0 are the winners if they have 3 of the character in a row. if there is not 3 x or o in row print tie instead
     */

    public static void main(String[] args) {
        
        //create one two dimensional array
        char[][] gameResult={
                //0   1    2
                {'X','X','X'}, //0
                {'X','X','O'}, //1
                {'X','O','O'}  //2
        };
        //array name  n//row #  column#
        //gameResult    [1]     [1]=    'A';

        //I will create two variable for counting XXX andOOO in a row
        int numberOfXXX=0;
        int numberOfOOO=0;
                            //3 single array
        for (int i = 0; i < gameResult.length; i++) {// i is for row outside
             String container="";
                            //   3 elements I have
            for (int j = 0; j < gameResult[i].length; j++) {

                container+=""+gameResult[i][j];
            }
            if (container.equals("XXX")){
                numberOfXXX++;
            }
            if (container.equals("OOO")){
                numberOfOOO++;
            }

        }
        if (numberOfXXX>numberOfOOO){
            System.out.println("X won");
        }else if(numberOfOOO>numberOfXXX){
            System.out.println("O won");
        }else {
            System.out.println("tie");
        }
        //I will compare number of XXX with number of OOOO
        
        
        
    }




}

package Udemy.CodingExcercises.section5;
//as per the challenge in lesson 49 section 5

import java.util.Scanner;

public class Sect5MethodChallenge {

    public static String displayHighScorePosition(String userName, int playersPosition){

        return userName + " managed to get into position " + playersPosition + " on the high score list.";
    }

    public static int calculateHighScorePosition(int playersScore){
        int position = 0;
            if(playersScore >= 1000) {
                position = 1;
            } else if (playersScore >= 500) {
                position = 2;
            } else if (playersScore >= 100) {
                position = 3;
            } else { position = 4; }
        return position;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Provide the user name : ");
        String userName = sc.nextLine();
        System.out.print("Provide the user score : ");
        int userScore = sc.nextInt();

        int playersPosition = calculateHighScorePosition(userScore);

        System.out.println(displayHighScorePosition(userName,playersPosition));
        System.out.println(displayHighScorePosition("Tim",calculateHighScorePosition(1000)));
        System.out.println(displayHighScorePosition("Bob",calculateHighScorePosition(500)));
        System.out.println(displayHighScorePosition("Gilbert",calculateHighScorePosition(100)));
        System.out.println(displayHighScorePosition("James",calculateHighScorePosition(25)));

    }

}

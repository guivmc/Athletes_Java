package com.company;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class Main {

    public  static int NO_MOVE = 0;
    public  static int YUKO = 1;
    public  static int WAZARI = 2;
    public  static int IPPON = 3;

    public static Random rand = new Random();

    public static void shotPut(Athlete a1, Athlete a2)
    {
        for (int i = 0; i < 3; i++)
        {
            a1.throwsArr[i] = rand.nextInt(500 ) + 1;
            a2.throwsArr[i] = rand.nextInt(500 ) + 1;
        }

        // Sorts arr[] in order
        Arrays.sort(a1.throwsArr);
        Arrays.sort(a2.throwsArr);

        //Who won??
        if (a1.throwsArr[2] == a2.throwsArr[2])
        {
            if (a1.throwsArr[1] == a2.throwsArr[1])
            {
                if (a1.throwsArr[0] == a2.throwsArr[0])
                {
                    System.out.println("Draw!");
                }
                else if (a1.throwsArr[0] > a2.throwsArr[0])
                    System.out.println("Athlete1 wins on Shot Put round!");
                else
                    System.out.println("Athlete1 wins on Shot Put round!");
            }
            else if (a1.throwsArr[1] > a2.throwsArr[1])
                System.out.println("Athlete1 wins on Shot Put round!");
            else
                System.out.println("Athlete1 wins on Shot Put round!");
        }
        else if (a1.throwsArr[2] > a2.throwsArr[2])
            System.out.println("Athlete1 wins on Shot Put round!");
        else
            System.out.println("Athlete1 wins on Shot Put round!");
    }

    public  static int artisticGymnastics()
    {
        Integer scores[] = new Integer[5];

        //Scores
        for (int i = 0; i < 5; i++)
        {
            scores[i] = rand.nextInt(10) + 1;
        }

        //Sort scores
        Arrays.sort(scores);

        int totalScore = 0;

        for (int i = 1; i < 5; i++)
        {
            totalScore += scores[i];
        }

        return totalScore;
    }

    public static void main(String[] args) {
	    Athlete a1 = new Athlete();
        Athlete a2 = new Athlete();

        shotPut(a1, a2);

        //Calculate ShotPut Total Score
        for (int i = 0; i < 3; i++)
        {
            a1.totalScore += a1.throwsArr[i];
            a2.totalScore += a2.throwsArr[i];
        }

        //ArtisticGymnastics round
        a1.ginScore = artisticGymnastics();
        a2.ginScore = artisticGymnastics();

        if (a1.ginScore > a2.ginScore)
            System.out.println("Athlete1 wins on Artistic Gymnastics round!");
        else if (a1.ginScore < a2.ginScore)
            System.out.println("Athlete2 wins on Artistic Gymnastics round!");
        else
            System.out.println("Draw!");

        a1.totalScore += a1.ginScore;
        a2.totalScore += a2.ginScore;

        System.out.println("\n");

        //Judo round
        a1.judoMove = rand.nextInt(IPPON) + NO_MOVE;
        a2.judoMove = rand.nextInt(IPPON) + NO_MOVE;

        if (a1.judoMove > a2.judoMove)
            System.out.println("Athlete1 wins on Judo round!");
        else if (a1.judoMove < a2.judoMove)
            System.out.println("Athlete2 wins on Judo round!");
        else
            System.out.println("Draw!");

        a1.totalScore += a1.judoMove;
        a2.totalScore += a2.judoMove;

        System.out.println("\n");

        //Weightlifting round
        a1.lift = rand.nextInt(500) + 1;
        a2.lift = rand.nextInt(500) + 1;

        if (a1.lift > a2.lift)
            System.out.println("Athlete1 wins on Weightlifting round!");
        else if (a1.lift < a2.lift)
            System.out.println("Athlete2 wins on Weightlifting round!");
        else
            System.out.println("Draw!");

        a1.totalScore += a1.lift;
        a2.totalScore += a2.lift;

        System.out.println("\n");

        if (a1.totalScore > a2.totalScore)
            System.out.println("Athlete1 win!");
        else if (a1.totalScore < a2.totalScore)
            System.out.println("Athlete2 win!");
        else
            System.out.println("Draw!");

    }
}

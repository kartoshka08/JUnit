package org.example;

import java.io.IOException;
import java.util.Arrays;

public class SortMerge {

    public void main(String[] args) throws IOException {
        int[][] teams = {
                {45, 31, 24, 22, 20, 17, 14, 13, 12, 10},
                {31, 18, 15, 12, 10, 8, 6, 4, 2, 1},
                {51, 30, 10, 9, 8, 7, 6, 5, 2, 1}
        };
        int[] nationalTeam = mergeAll(teams);
        System.out.println("Answer: " + Arrays.toString(nationalTeam)); // [51, 45, 31, 31, 30, 24, 22, 20, 18, 17]
    }


    /**
     * Метод для слияния всех команд в одну национальную
     */
    public static int[] mergeAll(int[][] teams) {
        int[] allTeam = new int[10];
        int[] doubleTeam = allTeam;
        for (int i = 0; i < teams.length; i++) {
            doubleTeam = merge(allTeam, teams[i]);
            System.out.println("1st " + Arrays.toString(allTeam) + "   " + "2d " + Arrays.toString(teams[i]));
            allTeam = doubleTeam;
            System.out.println("mix " + Arrays.toString(allTeam));
            System.out.println();
        }
        return allTeam;
    }

    /**
     * Метод для слияния двух команд в одну
     */
    public static int[] merge(int[] teamA, int[] teamB) {
        int[] teamC = new int[10];
        int ia = 0;
        int ib = 0;
        int ic = 0;
        while ((ia < teamA.length || ib < teamB.length) && ic != 10) {
            if (teamA[ia] >= teamB[ib]) {
                teamC[ic] = teamA[ia];
                ia++;
            } else {
                teamC[ic] = teamB[ib];
                ib++;
            }
            ic++;
        }
        return teamC;
    }
}

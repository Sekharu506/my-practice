/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.inheritence;

/**
 *
 * @author Batna Chandra Sekhar
 */
public class StudentRank extends StudentInfo {

    private void numberSwap(int j) {
        double temp;
        temp = STUDENTPERCENTAGE[j];
        STUDENTPERCENTAGE[j] = STUDENTPERCENTAGE[j + 1];
        STUDENTPERCENTAGE[j + 1] = temp;
    }

    private void nameSwap(int j) {
        String name;
        name = STUDENTNAME[j];
        STUDENTNAME[j] = STUDENTNAME[j + 1];
        STUDENTNAME[j + 1] = name;
    }

    public void sortStudentRank() {

        System.out.println("Using Bubbole sort, The Ranks Are AS follows");
        for (int i = 0; i < TOTALSTUDENTS - 1; i++) {
            for (int j = 0; j < TOTALSTUDENTS - i - 1; j++) {
                if (STUDENTPERCENTAGE[j] < STUDENTPERCENTAGE[j + 1]) {
                    numberSwap(j);
                    nameSwap(j);
                }

            }

        }
    }

}

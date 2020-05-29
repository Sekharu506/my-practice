/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.inheritence.studentimpl;

import com.sekhar.inheritence.studentimpl.StudentInfo;

/**
 *
 * @author Batna Chandra Sekhar
 */
public class StudentSort extends StudentInfo {

    private void numberSwap(int j) {
        double temp;
        temp = STUDENT_PERCENTAGE[j];
        STUDENT_PERCENTAGE[j] = STUDENT_PERCENTAGE[j + 1];
        STUDENT_PERCENTAGE[j + 1] = temp;
    }

    private void nameSwap(int j) {
        String name;
        name = STUDENT_NAME[j];
        STUDENT_NAME[j] = STUDENT_NAME[j + 1];
        STUDENT_NAME[j + 1] = name;
    }

    public void sortStudentRank() {

        System.out.println("Using Bubbole sort, The Ranks Are AS follows");
        for (int i = 0; i < TOTAL_STUDENTS - 1; i++) {
            for (int j = 0; j < TOTAL_STUDENTS - i - 1; j++) {
                if (STUDENT_PERCENTAGE[j] < STUDENT_PERCENTAGE[j + 1]) {
                    numberSwap(j);
                    nameSwap(j);
                }

            }

        }
    }

}

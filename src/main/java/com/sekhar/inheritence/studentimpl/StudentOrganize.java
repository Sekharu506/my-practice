/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.inheritence.studentimpl;

import com.sekhar.inheritence.studentimpl.StudentSort;
import java.text.DecimalFormat;

/**
 *
 * @author Batna Chandra Sekhar
 */
public final class StudentOrganize extends StudentSort {

    final public void makeStudentData() {
        setStudentData();
        sortStudentRank();

    }

    final public void displayStudentData() {
        DecimalFormat formater = new DecimalFormat("#.###");
        System.out.println("    Student Name       Percentage    Rank");

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("    " + STUDENT_NAME[i] + "                 " + formater.format(STUDENT_PERCENTAGE[i]) + "             " + (i + 1));
        }
    }

}

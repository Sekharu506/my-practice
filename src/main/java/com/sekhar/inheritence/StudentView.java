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
public final class StudentView extends StudentRank {

    public static void main(String a[]) {
        StudentView studentobject = new StudentView();
        studentobject.displayStudentData();

    }

   final public void displayStudentData() {
        setStudentData();
        sortStudentRank();
        System.out.println("    Student Name       Percentage    Rank");

        for (int i = 0; i < TOTALSTUDENTS; i++) {
            System.out.println("     " + STUDENTNAME[i] + "                  " + STUDENTPERCENTAGE[i] + "                             " + (i + 1));
        }
    }

}

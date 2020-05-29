/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.inheritence.student;

/**
 *
 * @author Batna Chandra Sekhar
 */
public interface StudentProperty {

    int TOTAL_STUDENTS = 5;
    double STUDENT_PERCENTAGE[] = new double[TOTAL_STUDENTS];
    String STUDENT_NAME[] = new String[TOTAL_STUDENTS];

    public void setStudentData();

    public void sortStudentRank();

    public void displayStudentData();

}

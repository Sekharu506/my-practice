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
public interface InterfaceTest {

    int TOTALSTUDENTS = 5;
    double STUDENTPERCENTAGE[] = new double[TOTALSTUDENTS];
    String STUDENTNAME[] = new String[TOTALSTUDENTS];

    public void setStudentData();

    public void sortStudentRank();

    public void displayStudentData();

}

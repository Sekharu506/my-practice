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
public class MarksCalculationImpl extends MarksCalculation {

    protected int addition(int maths, int physics, int chemistry) {
        int sum = maths + physics + chemistry;
        return sum;
    }

    protected double addition(double maths, double physics, double chemistry) {
        double sum = maths + physics + chemistry;
        return sum;
    }

    protected double calculatePercentage(double sum) {
        double percentage;
        percentage = (sum / MAXIMUM_MARKS) * 100;
        return percentage;
    }

}

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
public class CalculationCode extends AbstractClassTest {

    int addition(int maths, int physics, int chemistry) {
        int sum = maths + physics + chemistry;
        return sum;
    }

    double addition(double maths, double physics, double chemistry) {
        double sum = maths + physics + chemistry;
        return sum;
    }

    double calculatePercentage(double sum) {
        double percentage;
        percentage = (sum / MAXIMUMMARKS) * 100;
        return percentage;
    }

}

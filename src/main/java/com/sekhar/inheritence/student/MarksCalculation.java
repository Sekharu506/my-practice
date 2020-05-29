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
public abstract class MarksCalculation {

    final static int MAXIMUM_MARKS = 300;

    abstract int addition(int maths, int physics, int chemistry);

    abstract double addition(double maths, double physics, double chemistry);

    abstract double calculatePercentage(double sum);

}

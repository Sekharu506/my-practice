/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.test.accessmodifiers;

/**s
 *
 * @author Batna Chandra Sekhar
 */
class Students {

    private static int count = 0;//to increase student count when a new student object created
    private final String dept = "CSE";//all students are belong to Cse department
    private String name;

    static {
        System.out.println("Students data");//TO displace about this program before object created
    }

    Students(String n) { //default modifiers assigned to make available wthin the package
        count++;
        this.name = n;
    }

    void display() {
        System.out.println("   Total Students  " + "Present Student NAME" + "  Branch ");
        System.out.println("   " + count + "          " + name + "               " + dept);
    }

}

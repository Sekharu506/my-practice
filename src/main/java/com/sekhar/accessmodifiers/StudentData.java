/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.accessmodifiers;

/**
 *
 * @author Batna Chandra Sekhar
 */
public class StudentData extends Student {

    public StudentData(String name) {
        super(name);
    }
    Address addressobject;//to make this address object global,i used declared outside meythod
    Score scoreobject;//to make globle

    public void setData(String town, String district, int grade, String rank) {
        addressobject = new Address(town, district);
        scoreobject = new Score(grade, rank);
    }

    public void showData() {
        display();
        System.out.println();
        System.out.println();
        System.out.println("    Town            District    ");
        System.out.println("   " + addressobject.town + "            " + addressobject.district);
        System.out.println();
        System.out.println();
        System.out.println("       Grade         rank");
        System.out.println("  " + scoreobject.grade + "          " + scoreobject.rank);
    }

    private class Address {

        private String town;
        private String district;

        Address(String t, String d) {
            /*TO make this Constructor accessable within this package */
            this.town = t;
            this.district = d;
        }

    }

    private class Score {

        protected int grade;
        protected String rank;

        private Score(int g, String r) {
            this.grade = g;
            this.rank = r;
        }
    }

}

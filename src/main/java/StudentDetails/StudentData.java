/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentDetails;

public class StudentData extends Students {

    public StudentData(String n) {
        super(n);
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
    Address a;//to make this address object global,i used declared outside meythod

    private class Score {

        protected int grade;
        protected String rank;

        private Score(int g, String r) {
            this.grade = g;
            this.rank = r;
        }
    }
    Score s;//to make globle

    public void getDetails(String t, String d, int g, String r) {
        a = new Address(t, d);
        s = new Score(g, r);
    }

    public void showDetails() {
        display();
        System.out.println();
        System.out.println();
        System.out.println("    Town            District    ");
        System.out.println(a.town + "         " + a.district);
        System.out.println();
        System.out.println();
        System.out.println("       Grade         rank");
        System.out.println("  " + s.grade + "          " + s.rank);

    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.StudentTest;
import com.sekhar.StudentDetails.StudentData;
/**
 *
 * @author Batna Chandra Sekhar
 */
public class Test {

    public static void main(String a[]) {
        showAll();
    }

    private static void showAll() {
        StudentData n1;
        StudentData n2;//Two objects Created resulting two students created and increasing count by 2
        n1 = new StudentData("aravindh");
        n1.getDetails("srinagar", "vizag", 8, "second class");
        n2 = new StudentData("ramu");
        n2.getDetails("bommuru", "east godavari", 8, "first class");

        n1.showDetails();
        n2.showDetails();

    }
}


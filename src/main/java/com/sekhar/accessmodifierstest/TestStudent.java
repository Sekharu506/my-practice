/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.accessmodifierstest;

import com.sekhar.accessmodifiers.StudentData;

/**
 *
 * @author Batna Chandra Sekhar
 */
public class TestStudent {

    public static void main(String a[]) {
        showAll();
    }

    private static void showAll() {
        StudentData student1;
        StudentData student2;//Two objects Created resulting two students created and increasing count by 2
        student1 = new StudentData("aravindh");
        student1.setData("srinagar", "vizag", 6, "second class");
        student2 = new StudentData("ramu");
        student2.setData("bommuru", "east godavari", 8, "first class");

        student1.showData();
        student2.showData();

    }
}


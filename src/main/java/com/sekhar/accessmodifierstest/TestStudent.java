/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.accessmodifierstest;

import com.sekhar.accessmodifiers.Student;

/**
 *
 * @author Batna Chandra Sekhar
 */
import java.util.Scanner;

public class TestStudent {

    public static void main(String a[]) {
        Student student1 = createStudent();
        Student student2 = createStudent();

        System.out.println("GIven Student Data");

        student1.display();
        student2.display();

    }

    private static Student createStudent() {
        Scanner sc = new Scanner(System.in);
        Student student;

        System.out.println("Enter Student name");
        String name = sc.next();
        student = new Student(name);

        System.out.println("Enter town");
        String town = sc.next();
        System.out.println("Enter District");
        String district = sc.next();
        System.out.println("Enter grade");
        int grade = sc.nextInt();
        System.out.println("Enter rank");
        String rank = sc.next();
        student.setData(town, district, grade, rank);

        student.display();

        return student;
    }
}

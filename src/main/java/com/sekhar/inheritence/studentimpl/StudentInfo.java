/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sekhar.inheritence.studentimpl;

import com.sekhar.inheritence.student.MarksCalculationImpl;
import com.sekhar.inheritence.student.StudentProperty;
import java.util.Scanner;

/**
 *
 * @author Batna Chandra Sekhar
 */
public class StudentInfo extends MarksCalculationImpl implements StudentProperty {

    Scanner sc = new Scanner(System.in);

    public void setStudentData() {
        System.out.println("Enter All Students Details In Your Section BY ID vice");

        for (int i = 0; i < TOTAL_STUDENTS; i++) {
            System.out.println("Enter Student Name");
            STUDENT_NAME[i] = sc.next();
            System.out.println("Choose 1 if marks are in decimal values or 0 if in interger values");
            int markstype = sc.nextInt();
            System.out.println("Enter " + STUDENT_NAME[i] + " maths physics and chemistry marks");
            double percentage;
            if (markstype == 1) {
                double maths = sc.nextDouble();
                double physics = sc.nextDouble();
                double chemistry = sc.nextDouble();
                double sum = addition(maths, physics, chemistry);
                percentage = calculatePercentage(sum);
            } else {
                int maths = sc.nextInt();
                int physics = sc.nextInt();
                int chemistry = sc.nextInt();
                int sum = addition(maths, physics, chemistry);
                percentage = calculatePercentage(sum);
            }

            STUDENT_PERCENTAGE[i] = percentage;

        }

    }

}

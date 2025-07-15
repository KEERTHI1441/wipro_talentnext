package com.mile1.main;


import com.mile1.bean.Student;
import com.mile1.service.*;
import com.mile1.exception.*;

public class StudentMain {
	static Student[] data = new Student[4];

    public StudentMain() {
    	data[0] = new Student(null, new int[]{85, 75, 95}, "Sekar");
    	data[1] = new Student(null, new int[]{11, 22, 33}, null);
    	data[2] = null;
    	data[3] = new Student(null, null, "Manoj");

    }

    public static void main(String[] args) {
        StudentMain sm = new StudentMain();
        StudentReport sr = new StudentReport();
        StudentService ss = new StudentService();

        for (int i = 0; i < data.length; i++) {
            try {
                String result = sr.validate(data[i]);
                System.out.println("Validation Result: " + result);
                if (result.equals("VALID")) {
                    System.out.println("Grade: " + sr.findGrades(data[i]));
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("Number of Null Marks Array: " + ss.findNumberOfNullMarksArray(data));
        System.out.println("Number of Null Name: " + ss.findNumberOfNullName(data));
        System.out.println("Number of Null Objects: " + ss.findNumberOfNullObjects(data));
    }
}

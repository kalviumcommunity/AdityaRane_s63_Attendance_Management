package com.school;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class for the Attendance Management System
 * Demonstrates the functionality of Student and Course classes
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Attendance Management System!\n");

        // Create students
        Student alice = new Student(1, "Alice");
        Student bob = new Student(2, "Bob");
        Student charlie = new Student(3, "Charlie");
        Student diana = new Student(4, "Diana");
        Student eve = new Student(5, "Eve");

        // Create courses
        Course cs101 = new Course("CS101", "Intro to CS", 5);
        Course math201 = new Course("MATH201", "Discrete Math", 5);

        // Enroll students in courses
        cs101.enrollStudent(alice);
        cs101.enrollStudent(bob);
        cs101.enrollStudent(charlie);

        math201.enrollStudent(alice);
        math201.enrollStudent(charlie);

        // Mark attendance for CS101
        System.out.println("Marking attendance for CS101...");
        boolean[] cs101Attendance = {true, false, true}; // Alice: present, Bob: absent, Charlie: present
        cs101.markAttendance(cs101Attendance);

        // Mark attendance for MATH201
        System.out.println("Marking attendance for MATH201...");
        boolean[] math201Attendance = {true, true}; // Alice: present, Charlie: present
        math201.markAttendance(math201Attendance);

        // Display course rosters
        System.out.println("\nCourse Rosters:");
        displayCourseRoster(cs101);
        displayCourseRoster(math201);

        // Demonstrate additional functionality
        System.out.println("\nAdditional Operations:");
        
        // Try to enroll more students
        System.out.println("Attempting to enroll Diana in CS101...");
        if (cs101.enrollStudent(diana)) {
            System.out.println("Diana successfully enrolled in CS101");
        } else {
            System.out.println("CS101 is full, cannot enroll Diana");
        }

        // Check if a student is enrolled
        System.out.println("Is Alice enrolled in CS101? " + cs101.isStudentEnrolled(alice));
        System.out.println("Is Bob enrolled in MATH201? " + math201.isStudentEnrolled(bob));

        // Display individual student attendance
        System.out.println("\nIndividual Student Attendance:");
        System.out.println("Alice's attendance in CS101: " + alice.getAttendancePercentage() + "%");
        System.out.println("Bob's attendance in CS101: " + bob.getAttendancePercentage() + "%");
        System.out.println("Charlie's attendance in CS101: " + charlie.getAttendancePercentage() + "%");
    }

    /**
     * Display the roster for a course
     * @param course Course to display roster for
     */
    private static void displayCourseRoster(Course course) {
        System.out.println(course.toString());
        List<Student> students = course.getEnrolledStudents();
        for (int i = 0; i < students.size(); i++) {
            System.out.println("  " + (i + 1) + ". " + students.get(i).toString());
        }
        System.out.println();
    }
}

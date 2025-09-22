package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        displayWelcomeMessage();
        displayProjectInfo();
        displaySystemInfo();
        testAttendanceRecords();
        displayNextSteps();
    }
    
    private static void displayWelcomeMessage() {
        System.out.println("Welcome to Attendance Management System!");
    }
    
    private static void displayProjectInfo() {
        System.out.println("This is Part 1 of the project setup.");
        System.out.println("Project structure created successfully!");
        System.out.println("Ready for development!");
    }
    
    private static void displaySystemInfo() {
        System.out.println("\nSystem Information:");
        System.out.println("Java Version: " + System.getProperty("java.version"));
        System.out.println("Operating System: " + System.getProperty("os.name"));
    }
    
    private static void testAttendanceRecords() {
        System.out.println("\n=== Testing Attendance Records (Part 4) ===");
        
        // Create sample students and courses
        Student student1 = new Student(101, "Alice Johnson");
        Student student2 = new Student(102, "Bob Smith");
        Student student3 = new Student(103, "Carol Davis");
        
        Course course1 = new Course("CS101", "Introduction to Programming", 30);
        Course course2 = new Course("MATH201", "Calculus I", 25);
        
        // Create attendance log
        List<AttendanceRecord> attendanceLog = new ArrayList<>();
        
        // Create attendance records using getters from student and course objects
        // Using simple integer IDs for courses (101 for CS101, 201 for MATH201)
        attendanceLog.add(new AttendanceRecord(student1.getId(), 101, "Present"));
        attendanceLog.add(new AttendanceRecord(student2.getId(), 101, "Absent"));
        attendanceLog.add(new AttendanceRecord(student3.getId(), 201, "Present"));
        
        // Test with invalid status to verify validation
        attendanceLog.add(new AttendanceRecord(student1.getId(), 201, "Late"));
        
        // Display all attendance records
        System.out.println("\nAttendance Records:");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }
        
        System.out.println("\nStudent and Course Information:");
        System.out.println("Student 1: " + student1);
        System.out.println("Student 2: " + student2);
        System.out.println("Student 3: " + student3);
        System.out.println("Course 1: " + course1);
        System.out.println("Course 2: " + course2);
    }
    
    private static void displayNextSteps() {
        System.out.println("\nNext Steps:");
        System.out.println("1. Create Student and Course classes");
        System.out.println("2. Implement attendance tracking");
        System.out.println("3. Add data persistence");
        System.out.println("4. Create user interface");
    }
}

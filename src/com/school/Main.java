package com.school;

public class Main {
    public static void main(String[] args) {
        displayWelcomeMessage();
        displayProjectInfo();
        displaySystemInfo();
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
    
    private static void displayNextSteps() {
        System.out.println("\nNext Steps:");
        System.out.println("1. Create Student and Course classes");
        System.out.println("2. Implement attendance tracking");
        System.out.println("3. Add data persistence");
        System.out.println("4. Create user interface");
    }
}

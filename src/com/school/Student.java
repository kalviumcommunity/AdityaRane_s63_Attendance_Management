package com.school;

/**
 * Student class representing a student in the attendance management system
 */
public class Student {
    private int id;
    private String name;
    private double attendancePercentage;
    private int totalClasses;
    private int attendedClasses;

    /**
     * Constructor for Student
     * @param id Student ID
     * @param name Student name
     */
    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.attendancePercentage = 0.0;
        this.totalClasses = 0;
        this.attendedClasses = 0;
    }

    /**
     * Mark attendance for a class
     * @param attended true if student attended, false otherwise
     */
    public void markAttendance(boolean attended) {
        totalClasses++;
        if (attended) {
            attendedClasses++;
        }
        updateAttendancePercentage();
    }

    /**
     * Update attendance percentage based on attended and total classes
     */
    private void updateAttendancePercentage() {
        if (totalClasses > 0) {
            attendancePercentage = (double) attendedClasses / totalClasses * 100.0;
        }
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getAttendancePercentage() {
        return attendancePercentage;
    }

    public int getTotalClasses() {
        return totalClasses;
    }

    public int getAttendedClasses() {
        return attendedClasses;
    }

    /**
     * String representation of Student
     */
    @Override
    public String toString() {
        return String.format("Student{id=%d, name='%s', attendance%%=%.1f}", 
                           id, name, attendancePercentage);
    }
}

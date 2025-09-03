package com.school;

import java.util.ArrayList;
import java.util.List;


public class Course {
    private String courseId;
    private String courseName;
    private int maxCapacity;
    private List<Student> enrolledStudents;

    /**
     * Constructor for Course
     * @param courseId Course ID
     * @param courseName Course name
     * @param maxCapacity Maximum number of students that can enroll
     */
    public Course(String courseId, String courseName, int maxCapacity) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = new ArrayList<>();
    }

    /**
     * Enroll a student in the course
     * @param student Student to enroll
     * @return true if enrollment successful, false if course is full
     */
    public boolean enrollStudent(Student student) {
        if (enrolledStudents.size() < maxCapacity) {
            enrolledStudents.add(student);
            return true;
        }
        return false;
    }

    /**
     * Remove a student from the course
     * @param student Student to remove
     * @return true if removal successful, false if student not found
     */
    public boolean removeStudent(Student student) {
        return enrolledStudents.remove(student);
    }

    /**
     * Mark attendance for all enrolled students
     * @param attendanceData Array of boolean values indicating attendance for each student
     */
    public void markAttendance(boolean[] attendanceData) {
        for (int i = 0; i < enrolledStudents.size() && i < attendanceData.length; i++) {
            enrolledStudents.get(i).markAttendance(attendanceData[i]);
        }
    }

    /**
     * Get the number of enrolled students
     * @return Number of enrolled students
     */
    public int getEnrolledCount() {
        return enrolledStudents.size();
    }

    /**
     * Get the maximum capacity of the course
     * @return Maximum capacity
     */
    public int getMaxCapacity() {
        return maxCapacity;
    }

    /**
     * Get the list of enrolled students
     * @return List of enrolled students
     */
    public List<Student> getEnrolledStudents() {
        return new ArrayList<>(enrolledStudents);
    }

    /**
     * Check if a student is enrolled in this course
     * @param student Student to check
     * @return true if student is enrolled, false otherwise
     */
    public boolean isStudentEnrolled(Student student) {
        return enrolledStudents.contains(student);
    }

    /**
     * String representation of Course
     */
    @Override
    public String toString() {
        return String.format("%s - %s (%d/%d)", 
                           courseId, courseName, getEnrolledCount(), maxCapacity);
    }
}

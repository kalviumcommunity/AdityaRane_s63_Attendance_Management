package com.school;

/**
 * AttendanceRecord class representing an attendance record for a student in a course
 */
public class AttendanceRecord {
    private int studentId;
    private int courseId;
    private String status;

    /**
     * Constructor for AttendanceRecord
     * @param studentId Student ID
     * @param courseId Course ID
     * @param status Attendance status ("Present" or "Absent")
     */
    public AttendanceRecord(int studentId, int courseId, String status) {
        this.studentId = studentId;
        this.courseId = courseId;
        
        // Validate status (case-insensitive)
        if (status != null && (status.equalsIgnoreCase("Present") || status.equalsIgnoreCase("Absent"))) {
            this.status = status;
        } else {
            this.status = "Invalid";
            System.out.println("Warning: Invalid attendance status '" + status + "'. Setting status to 'Invalid'.");
        }
    }

    /**
     * Get the student ID
     * @return Student ID
     */
    public int getStudentId() {
        return studentId;
    }

    /**
     * Get the course ID
     * @return Course ID
     */
    public int getCourseId() {
        return courseId;
    }

    /**
     * Get the attendance status
     * @return Attendance status
     */
    public String getStatus() {
        return status;
    }

    /**
     * Display the attendance record
     */
    public void displayRecord() {
        System.out.println("Attendance Record - Student ID: " + studentId + 
                          ", Course ID: " + courseId + 
                          ", Status: " + status);
    }

    /**
     * String representation of AttendanceRecord
     */
    @Override
    public String toString() {
        return String.format("AttendanceRecord{studentId=%d, courseId=%d, status='%s'}", 
                           studentId, courseId, status);
    }
}

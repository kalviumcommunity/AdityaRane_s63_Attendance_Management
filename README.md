# Attendance Management System

## Project Overview

This is Part 4 of the Attendance Management System project. This phase focuses on implementing encapsulation, creating the AttendanceRecord class, and demonstrating basic attendance recording functionality with validation.

## Project Structure

```
src/
└── com/
    └── school/
        ├── Main.java              # Main application with attendance testing
        ├── Student.java           # Student class with encapsulation
        ├── Course.java            # Course class with encapsulation
        └── AttendanceRecord.java  # Attendance record class with validation
```

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line access

### Compilation

From the project root directory:

```bash
javac src/com/school/*.java
```

### Running the Application

From the project root directory:

```bash
java -cp src com.school.Main
```

### Expected Output

```
Welcome to Attendance Management System!
This is Part 1 of the project setup.
Project structure created successfully!
Ready for development!

System Information:
Java Version: 21.0.5
Operating System: Windows 11

=== Testing Attendance Records (Part 4) ===
Warning: Invalid attendance status 'Late'. Setting status to 'Invalid'.

Attendance Records:
Attendance Record - Student ID: 101, Course ID: 101, Status: Present
Attendance Record - Student ID: 102, Course ID: 101, Status: Absent
Attendance Record - Student ID: 103, Course ID: 201, Status: Present
Attendance Record - Student ID: 101, Course ID: 201, Status: Invalid

Student and Course Information:
Student 1: Student{id=101, name='Alice Johnson', attendance%=0.0}
Student 2: Student{id=102, name='Bob Smith', attendance%=0.0}
Student 3: Student{id=103, name='Carol Davis', attendance%=0.0}
Course 1: CS101 - Introduction to Programming (0/30)
Course 2: MATH201 - Calculus I (0/25)

Next Steps:
1. Create Student and Course classes
2. Implement attendance tracking
3. Add data persistence
4. Create user interface
```

## Git Setup Commands

```bash
# Configure Git user (replace with your GitHub username and email)
git config --global user.name "YourGitHubUsername"
git config --global user.email "your.email@example.com"

# Initialize repository
git init

# Create and switch to part-01 branch
git checkout -b part-01

# Add all files
git add .

# Commit changes
git commit -m "feat: Initial project setup (Part 1)"

# Add remote origin (replace with your repository URL)
git remote add origin https://github.com/YourUsername/YourRepository.git

# Push to GitHub
git push -u origin part-01
```

## Part 4 Features

This phase implements the following key features:

### 1. Encapsulation
- **Student.java**: All fields are private with public getters for `studentId` and `name`
- **Course.java**: All fields are private with public getters for `courseId` and `courseName`

### 2. AttendanceRecord Class
- **Private fields**: `studentId` (int), `courseId` (int), `status` (String)
- **Constructor validation**: Validates status as "Present" or "Absent" (case-insensitive)
- **Invalid status handling**: Sets status to "Invalid" and prints warning for invalid inputs
- **Public getters**: For all fields
- **Display method**: `displayRecord()` method for output

### 3. Main Application Updates
- **ArrayList integration**: Uses `ArrayList<AttendanceRecord>` for attendance logging
- **Sample data creation**: Creates students, courses, and attendance records
- **Validation testing**: Includes invalid status to demonstrate validation
- **Record display**: Loops through attendance log and displays all records

## Assignment Submission

This project is part of the Attendance Management System assignment. The following deliverables are included:

1. **Project Structure**: Properly organized Java project with `src/com/school/` directory structure
2. **Encapsulation**: Private fields with public getters in Student and Course classes
3. **AttendanceRecord Class**: Complete implementation with validation and display functionality
4. **Main Application**: Updated with attendance testing and ArrayList usage
5. **Compilation & Execution**: Working Java code that compiles and runs successfully
6. **Documentation**: README.md with setup and usage instructions

## Next Steps

This is Part 1 of the project. Future parts will include:
- Student and Course classes
- Attendance tracking functionality
- Enhanced user interface
- Database integration

## Code Structure

The Main.java file has been refactored to use separate methods for better code organization:
- `displayWelcomeMessage()`: Shows the welcome message
- `displayProjectInfo()`: Displays project setup information
- `displaySystemInfo()`: Shows system information (Java version, OS)
- `displayNextSteps()`: Lists upcoming development tasks

This approach improves code readability and maintainability while providing useful system information.

## About

This project demonstrates basic Java project setup, package structure, and Git workflow for version control and collaboration.
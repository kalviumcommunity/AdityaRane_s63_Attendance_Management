# Attendance Management System

## Project Overview

This is Part 1 of the Attendance Management System project. This phase focuses on setting up the basic project structure and creating a simple Welcome Java application.

## Project Structure

```
src/
└── com/
    └── school/
        └── Main.java    # Welcome Java application
```

## How to Compile and Run

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- Command line access

### Compilation

From the project root directory:

```bash
javac src/com/school/Main.java
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

## Assignment Submission

This project is part of the Attendance Management System assignment. The following deliverables are included:

1. **Project Structure**: Properly organized Java project with `src/com/school/` directory structure
2. **Welcome Application**: Simple Java application that displays welcome messages
3. **Compilation & Execution**: Working Java code that compiles and runs successfully
4. **Documentation**: README.md with setup and usage instructions

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

This approach improves code readability and maintainability.

## About

This project demonstrates basic Java project setup, package structure, and Git workflow for version control and collaboration.
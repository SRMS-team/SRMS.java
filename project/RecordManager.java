package project; // Package name of the project

import java.util.*;  // Import List and ArrayList

public class RecordManager {

    // List that stores all students
    private List<Student> students = new ArrayList<>();

    // ADD STUDENT 
    public void addStudent(Student s) {
        students.add(s); // Add the student to the list
        System.out.println("Student added: " + s.getID()); // Confirmation message
    }

    // SEARCH STUDENT 
    public Student searchStudent(String ID) {
        for (Student s : students) { // Loop through all stored students
            if (s.getID().equals(ID)) { // Compare student's ID with the given ID
                return s; // Return the found student
            }
        }
        return null; // Return null if no student matches the ID
    }

    // REMOVE STUDENT 
    public void removeStudent(String ID) {
        Student s = searchStudent(ID); // Search for the student

        if (s != null) { // If found
            students.remove(s); // Remove student from the list
            System.out.println("Student removed."); // Print confirmation
        } else {
            System.out.println("Student not found."); // Print error message
        }
    }

    // SAVE STUDENTS TO FILE 
    public void saveStudentsToFile(String fileName) {

        for (Student s : students) {  // Loop through each student

            // Build one line of student data (must match Student constructor order)
            String data =
                s.getName() + ";" +       // 1: Name
                s.getage() + ";" +        // 2: Age
                s.getID() + ";" +         // 3: ID
                s.getEmail() + ";" +      // 4: Email
                s.getPhone() + ";" +      // 5: Phone
                s.getdepartment() + ";" + // 6: Department
                s.getYear() + ";" +       // 7: Year
                s.getGPA();               // 8: GPA

            FileHandling.writeToFile(fileName, data); // Write the line to the file
        }
    }

    // LOAD STUDENTS FROM FILE 
    public void loadStudentsFromFile(String fileName) {

        List<String> lines = FileHandling.readFromFile(fileName); // Read all lines from file

        for (String line : lines) { // Loop through every stored line
            
            String[] parts = line.split(";"); // Split the line into parts

            if (parts.length == 8) { // Ensure the line contains all 8 values

                // Create a Student object using the exact constructor order
                Student s = new Student(
                    parts[0],                    // Name
                    Integer.parseInt(parts[1]), // Age
                    parts[2],                    // ID
                    parts[3],                    // Email
                    parts[4],                    // Phone
                    parts[5],                    // Department
                    Integer.parseInt(parts[6]), // Year
                    Double.parseDouble(parts[7]) // GPA
                );

                students.add(s); // Add the newly created student to the list
            }
        }

        System.out.println("Students loaded successfully."); // Print success message
    }
}
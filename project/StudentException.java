package project;

// Custom exception for student-related errors
public class StudentException extends Exception {

    // Constructor that accepts an error message
    public StudentException(String message) {
        super(message); // Pass the message to the parent Exception class
    }
}

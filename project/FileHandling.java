package project;
import java.io.*;     // Import for File, FileWriter, BufferedReader, etc.
import java.util.*;  // Import for List, ArrayList

public class FileHandling {

    // Method to write text to a file
    public static void writeToFile(String fileName, String content) {
        try {
            FileWriter writer = new FileWriter(fileName, true); // true = append mode
            writer.write(content + "\n");                      // Write content + new line
            writer.close();                                    // Close writer to save file
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage()); // Print error message
        }
    }

    // Method to read all lines from a file
    public static List<String> readFromFile(String fileName) {
        List<String> lines = new ArrayList<>();  // List to store file lines

        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName)); // Reader for file
            String line;

            while ((line = reader.readLine()) != null) { // Read line until file ends
                lines.add(line);                         // Add each line to list
            }

            reader.close(); // Close file after reading

        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage()); // Print error message
        }

        return lines; // Return list of lines
    }
}

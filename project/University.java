package project;
import java.util.ArrayList;
public class University {
  private String universityName;
  private ArrayList<Student> students;
  private ArrayList<Course> courses;
  private ArrayList<Instructor> instructors;
  private ArrayList<String> colleges;
  
  public University (String universityName){
      this.universityName = universityName;
      students = new ArrayList<>();
      courses = new ArrayList<>();
      instructors = new ArrayList<>();
      colleges  = new ArrayList<>();
  }
  public void addColleges(String collegeName){
      colleges.add(collegeName);
  }
  public void removeCollege(String collegeName){
      colleges.remove(collegeName);
  }
  public void dislayColleges(){
      System.out.println("Colleges in  " + universityName + ':' );
      for (String c : colleges){
          System.out.println("- " + c);
      }
  }
  
  public void addStudent(Student s ){
      students.add(s);
  }
  public void addCourse(Course c ){
      courses.add(c);
  } 
  public void addInstructor(Instructor i) {
      instructors.add(i);
  }
  public void displayInfo(){
      System.out.println("University Name: " + universityName);
      System.out.println("Number of Students : " + students.size());
      System.out.println("Number of Courses : " + courses.size());
      System.out.println("Number of Instructors : " + instructors.size());
      System.out.println("Number of Colleges : " + colleges.size());
  }
}


package project;
import java.util.ArrayList;
public class Course {
    private String courseName;
    private String courseID;
    private int creditHours;
    private  Instructor instructor;
    private String courseDepartment;
    private ArrayList<Student> students;

    
     public Course(String courseName , String courseID , int creditHours , Instructor instructor , String courseDepartment){
        this.courseName = courseName;
        this.courseID = courseID;
        this.creditHours = creditHours;
        this.instructor = instructor;
        this.courseDepartment = courseDepartment;
        this.students = new ArrayList();
    }
    public String getCourseName (){
        return courseName;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseID(){
        return courseID;
    }
    public void setCourseID(String courseID){
        this.courseID=courseID;
    }
public int getcreditHours(){
    return creditHours;
}
public void setcreditHours( int creditHours){
    this.creditHours = creditHours;
}
public Instructor getinstructorName (){
    return instructor;
}
public void setinstructorName(Instructor instructor){
    this.instructor = instructor;
}
public String getcourseDepartment(){
    return courseDepartment;
}
public void setcourseDepartment(String courseDepartment){
    this.courseDepartment=courseDepartment;
}
public ArrayList<Student> getStudents(){
    return students;
}
public void addStudent(Student s){
    students.add(s);
    System.out.println("Student added : " + s.getID());
}
public void removeStudent(Student s){
    students.remove(s);
    System.out.println("Student removed : " + s.getID());
}
public boolean removeStudentByID(String ID){
for(int i = 0 ; i< students.size(); i++){
    if(students.get(i).getID().equals(ID)){
        students.remove(i);
        return true;
    } }
return false;
}
public void printStudents(){
    System.out.println("Students in course " + getCourseName() + ':');
    for(Student s : students ){
        System.out.println("- " + s.getName() + " ( " + s.getID() + " )");
    }
}
 
public void displayInfo (){
    System.out.println("Course Info : ");
    System.out.println(" Course ID : " + getCourseID());
    System.out.println(" Course Name : " + getCourseName());
    System.out.println(" Course Hours : " + getcreditHours());
    System.out.println("Instructor Name : " + getinstructorName());
    System.out.println("Department : "+ getcourseDepartment());
}

   public void displayStudents(){
        if (students.isEmpty()){
            System.out.println("No students enrolled in tihis course .");
            return;
        }
        System.out.println("Students in " + getCourseName() +':');
        for(Student s : students ){
            System.out.println("- " +s.getName());
}
    }
}


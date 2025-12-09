package project;
import java.util.ArrayList;
public class Student extends Person {
    
    private String department;
    private int year;
    private double GPA;
    
     private ArrayList<Course> studentCourses = new ArrayList<Course>();

    
    public Student( String name , int age , String ID , String email , String phone , String department , int year , double GPA ){
        super(  name  , age ,ID, email, phone); 
        this.department = department;
        this.year = year;
        this.GPA = GPA;

    }
    public String getdepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
    public int getYear(){
        return year;
    }
    public void setYear(int year ){
        this.year = year;
    }
    public double getGPA (){
        return GPA;
    }
    public void setGPA(double GPA){
        this.GPA = GPA;
    }
    
    public void addcourse(Course c ){
        studentCourses.add(c);
    }
    public void removeCourse(Course c ){
        studentCourses.remove(c);
    }
    public ArrayList<Course> getStudentCourses(){
        return studentCourses;
    }
    
    @Override
    public void displayInfo(){
       System.out.println("Student Info : " );
       System.out.println("ID : " + getID());
       System.out.println("Name : " + getName());
       System.out.println("Phone : " + getPhone());
       System.out.println("Age : " + getage());
       System.out.println(" Email : " + getEmail());
       System.out.println("Department : " + getdepartment());
       System.out.println(" Year : " + getYear());
       System.out.println(" GPA : " + getGPA());
         
    }
    public void displayCourses(){
        if (studentCourses.isEmpty()){
            System.out.println("No corses enrolled.");
            return;
        }
    for(Course c : studentCourses){
        System.out.println("- " + c.getCourseName());
}
    }
}

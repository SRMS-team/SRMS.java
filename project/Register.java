package project;
import java.util.ArrayList;
import java.util.Date;
public class Register {
    private ArrayList<Student> studentsList = new ArrayList<Student>();
    private ArrayList<Course> coursesList   = new ArrayList<Course>();
    private ArrayList<String>enrollmentLog  = new ArrayList<String>();

    public void addStudents(Student s){
        studentsList.add(s);
    }
    public void addCourse(Course c){
        coursesList.add(c);
    }
    public void enrollStudent(Student s , Course c ){
        if(s.getStudentCourses().contains(c)){
            System.out.println("Student " +s.getName()
            + "is already enrollad in " + c.getCourseName());
            return;
            
        }
        if(c.getStudents().size() >=50){
            System.out.println("Course " + c.getCourseName() + "is full");
            return;
        }
        s.addcourse(c);
        c.addStudent(s);
        
        String entry = "Student: " + s.getName() +
                "enrolled in " + c.getCourseName() +
                "at " + new Date().toString();
        enrollmentLog.add(entry);
        System.out.println("Enrolled successfully!");
    }
    
    public void reomveEnrollmrnt(Student s , Course c){
        if(!s.getStudentCourses().contains(c)){
            System.out.println("Student is not enrolled in this course");
            return;
        }
        s.removeCourse(c);
        c.removeStudent(s);
        
        System.out.println("Enrollment removed");
    }
    
    public void showStudentCourses(Student s ){
        System.out.println("Courses for " + s.getName() + ':' );
        s.displayCourses();
    }
    
    public void showCourseStudes(Course c ) {
        System.out.println("Student in course " + c.getCourseName() + ':');
        c.displayStudents();
    }
    public void showLog(){
        System.out.println("Enrollment Log : ");
        for(String entry : enrollmentLog){
            System.out.println(entry);
        }
    }

}

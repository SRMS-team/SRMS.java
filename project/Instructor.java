package project;
public class Instructor extends Person{
    private String InstructorID;
    private String specialization;
    
    public Instructor(String name , int age , String ID , String email , String phone , String InstructorID  , String specialization ){
        super(name , age , ID , email , phone );
        this.InstructorID = InstructorID;
        this.specialization = specialization;
    }
    
    public String getInstructorID(){
        return InstructorID;
    }
    public void setInstructorID(String InstructorID){
        this.InstructorID = InstructorID;
    }
    public String getspecialization(){
        return specialization;
    }
    public void setspecialization(String specialization){
        this.specialization = specialization;
    }
    @Override
    public String toString(){
        return "Instructor Info { " +
                "Name : " +getName() + '\'' +
                " , Age : " + getage() +
                " , Email : " + getEmail() + '\''+
                " , Instructor ID : " + getInstructorID() + '\'' +
                " , specialization : " + getspecialization() + '\'' +
                '}';
    }
}

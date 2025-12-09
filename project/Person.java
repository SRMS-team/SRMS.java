package project;
public abstract class Person {
   private String name;
   private int age;
   private String ID;
   private String email;
   private String phone;
   
public Person (String name , int age , String ID , String email , String phone){
    this.name = name;
    this.age = age ;
    this.ID = ID;
    this.email= email;
    this.phone=phone;
   }
   public String getName(){
       return name;
   }
   public void setName(String name){
       this.name=name;
   } 
   public int getage (){
       return age;
   }
   public void setAge(int age){
       this.age=age;
   }
   public String getID(){
       return ID;
   }
   public void setID (String ID){
       this.ID=ID;
   }
   public String getEmail(){
       return email;
   }
   public void setEmail(String email){
       this.email=email;
   }
   public void setPhone (String phone){
       this.phone=phone;
   }
   public String getPhone(){
       return phone;
   }
   public abstract void displayInfo();
}

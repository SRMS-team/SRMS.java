package project;

public class maintest {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        Register reg = new Register();
        RecordManager rm = new RecordManager();

        System.out.println("**Welcome to University Management System **");

        // 1. Input Student Data
        System.out.println("\n[1] Enter Student Details:");
        System.out.print("Name: "); String sName = sc.nextLine();
        System.out.print("Age: "); int sAge = sc.nextInt(); sc.nextLine(); 
        System.out.print("ID: "); String sID = sc.nextLine();
        System.out.print("Email: "); String sEmail = sc.nextLine();
        System.out.print("Phone: "); String sPhone = sc.nextLine();
        System.out.print("Department: "); String sDept = sc.nextLine();
        System.out.print("Year: "); int sYear = sc.nextInt();
        System.out.print("GPA: "); double sGPA = sc.nextDouble(); sc.nextLine();

        Student student = new Student(sName, sAge, sID, sEmail, sPhone, sDept, sYear, sGPA);

     // Instructor data
        System.out.println("\n[2] Enter Instructor Details:");
        System.out.print("Name: "); String iName = sc.nextLine();
        System.out.print("Age: "); int iAge = sc.nextInt(); sc.nextLine();
        System.out.print("ID: "); String iID = sc.nextLine();
        System.out.print("Email: "); String iEmail = sc.nextLine();
        System.out.print("Phone: "); String iPhone = sc.nextLine();
        System.out.print("Instructor ID: "); String iRefID = sc.nextLine();
        System.out.print("Specialization: "); String iSpec = sc.nextLine();

        Instructor instructor = new Instructor(iName, iAge, iID, iEmail, iPhone, iRefID, iSpec);

        // 3. Input Course Data
        System.out.println("\n[3] Enter Course Details:");
        System.out.print("Course Name: "); String cName = sc.nextLine();
        System.out.print("Course ID: "); String cID = sc.nextLine();
        System.out.print("Credit Hours: "); int cHours = sc.nextInt(); sc.nextLine();

        Course course = new Course(cName, cID, cHours, instructor, sDept);

    
        reg.addStudents(student);
        reg.addCourse(course);
        reg.enrollStudent(student, course);
        
        rm.addStudent(student);
        rm.saveStudentsToFile("students.txt");

        System.out.println("\n Processing Data using Threads ");


        Thread t1 = new Thread(() -> {
            synchronized (System.out) {
                System.out.println("\n Thread 1: Displaying Student Info");
                student.displayInfo();
            }
        });

        Thread t2 = new Thread(() -> {
            synchronized (System.out) {
                System.out.println("\n Thread 2: Displaying Course Info");
                course.displayInfo();
            }
        });

        Thread t3 = new Thread(() -> {
            synchronized (System.out) {
                System.out.println("\n Thread 3: Displaying Instructor Info");
               instructor.displayInfo();
            }
        });

     
        t1.start();
        t2.start();
        t3.start();

  
        try {
            t1.join();
            t2.join();
            t3.join();
        } catch (InterruptedException e) {
            System.out.println("Thread interrupted.");
        }

        System.out.println("\n Operation Completed Successfully ");
        sc.close();
        
    }}
        

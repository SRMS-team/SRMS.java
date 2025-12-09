package project;

public class maintest {
    public static void main(String[] args) {
        Register reg = new Register();
        RecordManager rm = new RecordManager();

        Student s1 = new Student("rawan", 21, "S443", "443@qu.edu.sa", "0501830446", "IT", 3, 3.5);
        Student s2 = new Student("deem", 22, "S444", "444@qu.edu.sa", "0553344989", "CS", 3, 3.8);
        Instructor inst = new Instructor("Dr.Jawaher", 32, "I01", "inst@qu.edu.sa", "05555444", "INS100",
                "Software Engineering");
        Course oop = new Course("OOP", "CS201", 3, inst, "CS");

        reg.addStudents(s1);
        reg.addStudents(s2);
        reg.addCourse(oop);

        reg.enrollStudent(s1, oop);
        reg.enrollStudent(s2, oop);

        reg.showLog();

        rm.addStudent(s1);
        rm.addStudent(s2);

        rm.saveStudentsToFile("students.txt");
        rm.loadStudentsFromFile("students.txt");

        Thread t1 = new Thread(() -> {
            System.out.println("\n Thread 1: Student Info ");
            s1.displayInfo();
        });

        Thread t2 = new Thread(() -> {
            System.out.println("\n Thread 2: Course Info ");
            oop.displayInfo();
        });

        Thread t3 = new Thread(() -> {
            System.out.println("\n Thread 3: Instructor Info ");
            System.out.println(inst.toString());
        });
        try {
            t1.start();
            t1.join();

            t2.start();
            t2.join();

            t3.start();
            t3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}

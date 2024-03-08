package Observer;

public class Executor {
    public static void main(String[] args) {
        
        Student s1 = new Student("Hamza");
        Student s2 = new Student("Nissrin");
        Student s3 = new Student("Salah");
        Student s4 = new Student("Oussama");
        Student s5 = new Student("Ayman");

        Course java = new Course("JAVA");
        Course python = new Course("python");
        Course php = new Course("php");

        java.subscribe(s1);
        java.subscribe(s2);
        java.subscribe(s3);
        java.subscribe(s4);
        java.subscribe(s5);

        java.setAvailability(true);


    }
}

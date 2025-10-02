package day3.assessment1;

public class Studentdemo {
    public static void main(String[] args) {
        Student student1 = new Student(101, "Arjun", 20, "Computer Science", "arjun@example.com");

        System.out.println("Student ID: " + student1.getId());
        System.out.println("Name: " + student1.getName());
        System.out.println("Age: " + student1.getAge());
        System.out.println("Department: " + student1.getDepartment());
        System.out.println("Email: " + student1.getEmail());

        System.out.println(student1);
    }
}

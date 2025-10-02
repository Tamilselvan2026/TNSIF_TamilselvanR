package day3.assessment1;

//Student.java
public class Student {
 // Fields
 private int id;
 private String name;
 private int age;
 private String department;
 private String email;

 // Default constructor
 public Student() {}

 // Parameterized constructor
 public Student(int id, String name, int age, String department, String email) {
     this.id = id;
     this.name = name;
     this.age = age;
     this.department = department;
     this.email = email;
 }

 // Getters
 public int getId() {
     return id;
 }

 public String getName() {
     return name;
 }

 public int getAge() {
     return age;
 }

 public String getDepartment() {
     return department;
 }

 public String getEmail() {
     return email;
 }

 // Setters
 public void setId(int id) {
     this.id = id;
 }

 public void setName(String name) {
     this.name = name;
 }

 public void setAge(int age) {
     this.age = age;
 }

 public void setDepartment(String department) {
     this.department = department;
 }

 public void setEmail(String email) {
     this.email = email;
 }

 // To print student details
 @Override
 public String toString() {
     return "Student{" +
             "id=" + id +
             ", name='" + name + '\'' +
             ", age=" + age +
             ", department='" + department + '\'' +
             ", email='" + email + '\'' +
             '}';
 }
}


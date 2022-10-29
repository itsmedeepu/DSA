class Student { // class
    String name;
    int age;

    public void StudentInfo() { // method
        System.out.println("student name = " + this.name);
        System.out.println("student age = " + this.age);

    }

    // parameterize constructor
    Student(String name, int age) {
        System.out.println(" parameterize constructor");
        this.name = name;
        this.age = age;

    }

    // default constructor
    public Student() {
        System.out.println(" default constructor");
    }

    // copy constructor
    public Student(Student student3) {
        System.out.println(" copy constructor");

        this.name = student3.name;
        this.age = student3.age;
    }

}

public class classStudent {

    public static void main(String[] args) {

        Student student1 = new Student(); // object
        student1.name = "dolly";
        student1.age = 5;
        student1.StudentInfo();

        Student student2 = new Student("devi", 15); // object
        student2.StudentInfo();

        Student student3 = new Student(student1); // object
        student3.StudentInfo();
    }
}







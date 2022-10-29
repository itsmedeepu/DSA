class Student { // class
     String name;
    int age;

    // function overloading (complie time)
    public void studentinfo(String name) { // method1

        System.out.println(name);
    }
     public void studentinfo(int age) { // method2

        System.out.println(age);

    }
     public void studentinfo(String name, int age) { // method3

        System.out.println(name + " " + age);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        /*
         * polymorphism --- many forms
         * 
         * 2 types
         * function overloading (compile time polymorphism)
         * --- diffent functions with different actions but same function names
         * 
         * function overriding (run time polymorphism )
         * // method of super and sub class  must have same method and parameter names is called method overriding 
         */
        Student s1 = new Student();
        s1.name = "neha";
        s1.age = 15;
        s1.studentinfo(s1.name);
        s1.studentinfo(s1.name, s1.age);

    }

}

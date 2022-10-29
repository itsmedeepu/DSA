import java.util.Scanner;

/*
Functions
returnType functionName(type arg1 ,type arg2 , ......){
    operations
}

difference between function and methods
function are called directly
where as
methos are called through objects of class
*/

class function1 {
    // print a given name in function
    public static void printMyName(String name){
        System.out.println("your name is " + name);
        return;

    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = sc.next();

        printMyName(name);    // call 
        
      sc.close();
    }

}
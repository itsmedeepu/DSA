import java.util.*;
public class printNameAge {

    public static void main(String[] args) {
        
        
        
        System.out.println("enter your name and age");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        int age = input.nextInt();

        System.out.println(name+"! you are " + age + " years old");


        input.close();
    }
   
    
}

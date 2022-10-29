 // abstaraction means hiding the implementation details 
 // two ways     1) abstract class 2) interface
 
 
 abstract class Animal {  // super class  (abstract class-can't  create object of abstract class)
    abstract void walk();  //  absract method

    public void eat(){
       System.out.println("animal eats for living"); 
    }

}

class Lion extends Animal {  // sub class 1
    public void walk(){
        System.out.println("walks on 4 legs"); 

    }
}

class hen extends Animal {  // sub class 2
    public void walk(){
        System.out.println("walks on 2 legs");

    }
}

public class abstractUsingAbstractClass {
    public static void main(String[] args) {

        Lion l1 = new Lion();
        l1.walk();
        l1.eat();

        hen h1 = new hen();
        h1.walk();
    }
    
}

      


       


      

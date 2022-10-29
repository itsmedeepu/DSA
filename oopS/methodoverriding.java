// methodoverriding (runtime polymorphism)
// jvm plays main role
// method of super and sub class  must have same method and parameter names is called method overriding 
// method overriding (same method name & parameters with differnt functionaity)

class shape { // super class

    void draw() {
        System.out.println("cannot predict the shape ");
    }

}

class triangle extends shape { // sub 1 class

    @Override
    void draw() {
        System.out.println("it is a triangle");
    }
}

class circle extends shape { // sub 2 class
    void draw() {

        super.draw(); // super keyword will calls super class method too
        System.out.println("it is a circle");
    }
}

public class methodoverriding {
    public static void main(String[] args) {

        shape obj = new triangle(); // method calls only sub 1 class
        obj.draw();

        shape obj1 = new circle(); // method calls both sub 2 n super class
        obj1.draw();

    }

}

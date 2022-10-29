 class Shape{    // parent class
    String color;
 }

 class Triangle extends Shape{  // child 1 class

    public void TriangleArea(int l , int h){  // method
        System.out.println(this.color);
        System.out.println(0.5*l*h);
    }
    }

class Circle extends Shape  // child 2 class 
{

    public void CircleArea(int r){  // method
        System.out.println(this.color);
        System.out.println(3.14*r*r);
    }


}

class Square extends Shape{ // child 3 class
    public void SquareArea(int a){  // method
        System.out.println(this.color);
        System.out.println(a*a);
    }
}

public class hierarchial {
    
    public static void main(String[] args) {

        Triangle t1 = new Triangle();  // object 
        t1.color = "red";
        t1.TriangleArea(4, 55);

        Circle c1 = new Circle();
        c1.color = "pink";
        c1.CircleArea(5);

        Square s1 = new Square();
        s1.color = "skyblue";
        s1.SquareArea(5);
        
    }
}




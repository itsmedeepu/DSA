
class Shape { // base or parent class

    String color;

    public void Shapeinfo() { // method

        System.out.println(this.color);

    }

}

class Triangle extends Shape { // sub or child class

    
    int area;

    public void TriangleArea(int l, int h) { // method
     

        System.out.println(this.color);
        System.out.println(0.5 * l * h);
    }
}

public class singleInheritance {

    public static void main(String[] args) {
        /*
         * inheritance --- creating new class from existing class
         * 4 types
         * single / simple inheritance
         * multi-level inheritance
         * hierarchical inheritanc 
         */

        Triangle t1 = new Triangle();
        t1.color = "blue";
        t1.TriangleArea(4, 55);

    }

}

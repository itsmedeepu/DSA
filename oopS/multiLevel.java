
class Shape { // super class
    String color;
}

class Triangle extends Shape { // sub 1 class

    public void TriangleArea(int l, int h) { // method
        System.out.println(this.color);
        System.out.println(0.5 * l * h);

    }

}

class EquilaterlTriangle extends Triangle { // sub2 class

    public void EquilaterlTriangleArea(int a) { // method
        System.out.println(this.color);
        System.out.println(Math.sqrt(3) / 4 * (a * a));

    }
}

public class multiLevel {
    public static void main(String[] args) {

        Triangle t1 = new Triangle();
        t1.color = "pink";
        t1.TriangleArea(4, 55);

        EquilaterlTriangle t2 = new EquilaterlTriangle();
        t2.color = "yellow";
        t2.EquilaterlTriangleArea(4);

    }

}

class Pen { // class

    String color; // blue , red , black
    String type; // ballpoint , gel

    public void write() { // method
        System.out.println("write something");
    }

    public void printColor() {
        System.out.println(this.color);
    }

    public void printtype() {
        System.out.println(this.type);
    }

}

public class classPen {

    public static void main(String[] args) {

        Pen pen1 = new Pen(); // object
        pen1.color = "blue";
        pen1.type = "gel";
        pen1.write();  // method call

        Pen pen2 = new Pen();   // object
        pen2.color = "black";
        pen2.type = "ballpont";

        pen2.printColor();
        pen2.printtype();
        pen2.write();

    }

}
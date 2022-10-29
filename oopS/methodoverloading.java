class example { // class
    // method overloading ( compile time polymorphism)
    // complier plays main role
    // same method name with differnt function is called polymorphism
    // same method name with differnt parameters & return type can be anything

    void add() // method 1
    {
        int a = 9, b = 17, c;
        c = a + b;
        System.out.println(c);
  }

    void add(int x, int y) // method 2  (two parameter)
    {
        int c;
        c = x + y;
        System.out.println(c);
      }

    void add(double p, int q) // method 3  (two paramenter )
    {
        double c;
        c = p + q;
        System.out.println(c);
 }

 double add (double m , double n)  // method 4 (return type double )
 {
    double c = m+n;
    return c;

 }
}

public class methodoverloading {

    public static void main(String[] args) { // main

        example obj = new example(); // object

        obj.add(); // method 1 calling
        obj.add(3, 6); // method 2 calling
        obj.add(10.9, 5); // method 3 calling

       double add =  obj.add(10.95 , 11.00);  // method 4 calling
       System.out.println(add);
    
    }
}





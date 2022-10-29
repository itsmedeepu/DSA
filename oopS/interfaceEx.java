// interface just like a class , which contains only abstract method
interface Animals {    
     void walks();   // interface methos bydefault public+abstract
}

interface herbivore {    // interface methos bydefault public+abstract
     void eats();
}

class Cat implements Animals {
    public void walks() {

        System.out.println("walks on 4 legs");

    }

}

class Cow implements Animals, herbivore {
    public void walks() {
        System.out.println("walks on 4 legs");
    }

    public void eats() {
        System.out.println("eats only grass");
    }

}

public class interfaceEx {
    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.walks();

        Cow cow1 = new Cow();
        cow1.walks();
        cow1.eats();

    }

}

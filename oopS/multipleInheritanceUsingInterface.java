interface male {

    void eats(); // public+abstract

    void dressing();

}

interface female { // public+abstract
    void eats();

    void travelling();

}

class humans implements male, female {

    public void eats() {

        System.out.println("male and female are subset of human and eats for living");

    }

    public void dressing() {

        System.out.println("females are fond of dressing");

    }
    public void travelling() {

        System.out.println("males are fond of travelling");

    }
}

public class multipleInheritanceUsingInterface {
    public static void main(String[] args) {

        humans obj = new humans();
        obj.eats();
        obj.dressing();
        obj.travelling();
     }
    }

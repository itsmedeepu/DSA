// encapsulation - combination of data hiding + abstraction
//wrapping the data members & member method in single unit called encapsulation
class bank {

    private int password; // data hiding

    public void setinfo(int x) { // data abstraction
        password = x;

    }

    public int getinfo() {

        return password;

    }

}

public class encapsulation {
    public static void main(String[] args) {

        bank obj = new bank();
        obj.setinfo(342678906);
        System.out.println(obj.getinfo());

    }

}

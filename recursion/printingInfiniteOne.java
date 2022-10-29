

public class printingInfiniteOne {

   public static void f1() {
        System.out.println(1);

        f1();
    }
public static void main(String[] args) {
   f1();
}
    
}
public class printingName {
     static int count = 1;
    public  static void Name() {
        if (count == 6) {
             return;
        }
     
        System.out.println(count + " devi kumavath");
        count++;
        Name();
        
    }
    public static void main(String[] args) {
        Name();
    }
    
}

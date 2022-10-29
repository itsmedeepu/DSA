public class baseCondition {

    static int count = 0;
    public static void f1(){  // function defition 
        if(count == 5)  // base condition
        return;

        System.out.println(count);
        count++;
        f1();  // function calling itself 
    }

    public static void main(String[] args) {

        f1();  // function calling
        
    }
    
}

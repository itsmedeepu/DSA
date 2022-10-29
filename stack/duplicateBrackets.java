import java.util.Scanner;
import java.util.Stack;

// ((a+b) + (c+d)) --- false
// (a+b) + ((a+b)) --- true
public class duplicateBrackets {

    public static void main(String[] args) {
        System.out.println("enter the expression");
         Scanner obj = new Scanner(System.in);
         String exp;
         exp = obj.nextLine();
        
        Stack<Character> st = new Stack<>();
        for(int i = 0 ;i < exp.length() ; i++){
            char ch = exp.charAt(i);
            if (ch == ')') {
                  if(st.peek() == '('){
                    System.out.println("true");
                    return;
                  }

                  else {
                    while (st.peek() != '(') {
                       st.pop(); 
                    }
                    st.pop();
                  }
            } else {

                st.push(ch);
                
            }
        }

        System.out.println("false");
        obj.close();
    }

}

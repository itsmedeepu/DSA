import java.util.Scanner;
import java.util.Stack;

public class balanceBrackets {

    // [(a+b) + {(c+d)*(e/f)}] ----- true
    // [(a+b) + {(c+d)*(e/f)]} ---- false

    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("enter string expression");
        String str = obj.nextLine();
        System.out.println(balance(str));
    }

 //pending
        public static boolean balance(String str){
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else if (ch == ')' || ch=='}'||ch==']') {

                if(st.isEmpty() || !checkpair(st.pop(),ch)) return false;
            } 
        }
        return st.isEmpty();
            
        }

        public static  boolean checkpair(char c1,char c2){
            if(c1=='{' && c2=='}') return true;
            if(c1=='[' && c2==']') return true;
            if(c1=='(' && c2==')') return true;
            return false;
        }
    
    // public static handleClosing(stack<Character> st , Char corresOCh){
    //     if (st.size() == 0) {
    //         System.out.println("false");
    //         return false;

    //     } else if (st.peek() != corresOCh ) {
    //         System.out.println("false");
    //         return false;
    //     } else {
    //         st.pop();
    //         return true;
    //     }
    // }

}

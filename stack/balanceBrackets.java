// import java.util.Scanner;
// import java.util.Stack;

// public class balanceBrackets {

//     // [(a+b) + {(c+d)*(e/f)}] ----- true
//     // [(a+b) + {(c+d)*(e/f)]} ---- false

//     public static void main(String[] args) {
//         Scanner obj = new Scanner(System.in);
//         System.out.println("enter string expression");
//         String str = obj.nextLine();

//         Stack<Character> st = new Stack<>();
//         for (int i = 0; i < str.length(); i++) {
//             char ch = str.charAt(i);
//             if (ch == '(' || ch == '{' || ch == '[') {
//                 st.push(ch);
//             } else if (ch == ')') {
//                 handleClosing
//             } else if (ch == '}') {

//             } else if (ch == ']') {

//             }
//         }

//  pending


    


//     public static handleClosing(stack<Character> st , Char corresOCh){
//         if (st.size() == 0) {
//             System.out.println("false");
//             return false;

//         } else if (st.peek() != corresOCh ) {
//             System.out.println("false");
//             return false;
//         } else {
//             st.pop();
//             return true;
//         }
//     }

// }
// }

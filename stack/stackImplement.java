import java.util.Stack;

//  push-add , pop-remove , peek - see

public class stackImplement {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        st.push(10);
        st.push(20);
        st.push(30);
        System.out.println(st + "->" + st.peek() + " " + st.size());
        st.push(40);
        st.push(50);
        System.out.println(st + "->" + st.peek() + " " + st.size());

        // System.out.println(st + "->" + st.peek() + " " + st.size());

        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.push(100);
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.pop();
        st.pop();
        st.pop();
        System.out.println(st + "->" + st.peek() + " " + st.size());

        st.pop();
        System.out.println(st + "->" + " " + st.size());

        // System.out.println(st.peek());

    }
}

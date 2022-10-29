import java.util.ArrayList;
import java.util.List;

public class fizzBuzz {

    public static List<String> fizzbuzz(int n) {
        List<String> answer = new ArrayList<>(n);

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                answer.add("fizzbuzz");
            } else if (i % 3 == 0) {
                answer.add("fizz");
            } else if (i % 5 == 0) {
                answer.add("buzz");

            }

            else {
                answer.add(String.valueOf(i));
            }

        }

        System.out.println(answer);

        return answer;
    }

    public static void main(String[] args) {

        fizzbuzz(15);

    }
}
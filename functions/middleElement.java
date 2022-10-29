import java.util.Scanner;

public class middleElement {

    public static void main(String[] args) {
        System.out.println("enter the string");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;

            length = 2;

        } else {
            position = str.length() / 2;

            length = 1;

        }

        System.out.println(str.substring(position, position + length));
  sc.close();
    }

}

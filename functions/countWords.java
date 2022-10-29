import java.util.Scanner;

public class countWords {

    public static int displayWords(String str) {

        int count = 0;
        if (!(" ".equals(str.substring(0, 1))) || !(" ".equals(str.substring(str.length() - 1)))) {

            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ' ') {
                    count++;

                }

            }
            count = count + 1;
        }
        return count;


    }

    public static void main(String[] args) {
        System.out.println("enter any string");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();

        System.out.println("there is/are " + displayWords(str) + " words in the above string");
        in.close();

    }

}

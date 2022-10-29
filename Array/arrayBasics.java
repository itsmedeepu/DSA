import java.util.*;

public class arrayBasics {

    /*
     * defining an array (1)
     * type[] arrayNmae = new type[size];
     * or
     * type arrayName[] = new type[size];
     * 
     * defining an array (2)
     * type[] arrayname = { 1 , 2, 3, 4, 5 , 6};
     */
    public static void main(String[] args) {

        // int marks[] = {98 , 78 , 76}
        // or
        // int[] marks = new int[3];
        // marks[0] = 98; // dbms
        // marks[1] = 78; // os
        // marks[2] = 67; // oops

        // System.out.println(marks[0]);
        // System.out.println(marks[1]);
        // System.out.println(marks[2]);
        // or

        // for (int i = 0; i < 3; i++) {
        //     System.out.println(marks[i]);
        // }

        System.out.println("enter array size");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int numbers[] = new  int[size];
        
        //input
        for(int i = 0 ; i <size ; i++)
        {
            numbers[i] = sc.nextInt();
        }
           //output
           System.out.println("array elements are");
        for(int i = 0 ; i < size ; i++)
        {
            System.out.println( numbers[i]);
        }
            sc.close();
    }

}

import java.util.HashSet;
import java.util.Set;

public class printDuplicate {

    public static void main(String[] args) {
        
        int arr[] = {11 , 5 , 4 , 2 , 13 , 14 , 11};

        Set<Integer> uniqueNumber = new HashSet<>();

        boolean isDuplicateExist = false;
        for(int i = 0 ; i <arr.length ; i++)
        {
            if(uniqueNumber.contains(arr[i])) {
                isDuplicateExist = true;
                System.out.println("duplicate elements " + arr[i]);
            }
            else
            {
                uniqueNumber.add(arr[i]);
            }
        }

        if(!isDuplicateExist){
            System.out.println(-1);
        }


      
    }
    
}

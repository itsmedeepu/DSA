public class palindrome {

    public static boolean   checkPalindrome(int i, int n , String word ){


        if(i > n/2)
        {
            return true;
        }

        if( word.charAt(i) != word.charAt(n)){
            return false;
        }

        return checkPalindrome(i+1 , n-1 , word);
    }

    public static void main(String[] args) {

        String word = "mdam";

        int n = word.length()-1;

      

       System.out.println( checkPalindrome(0 , n ,  word));

       
        
    }
    
} 

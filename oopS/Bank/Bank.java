// package Bank;

class Account {  // class
    public String name ;
    public int   AccountNO;
    public int age;
    public String branch;

    public void details(){  // method

        System.out.println(this.name + " " + this.AccountNO + " " + this.age + " " + this.branch);

    }
    
}

public class Bank {

   

    public static void main(String[] args) {

        Account account1 = new Account();
        account1.name = "devi";
        account1.AccountNO = 1222222222;
        account1.age = 15;
        account1.branch = "gachibowli";

        account1.details();
        
    }

  
    
}

package ass_3;

public class AccountDemo {




    public static void main(String[] args) {
        Account account=new Account("1234567890112");

       account.deposit(20000);
       try {
           double bal=account.withdraw(40000);
           System.out.println("remaining balance = "+bal);

       }
       catch (InsufficientFundException ife){
           ife.getMessage();
       }



    }
}

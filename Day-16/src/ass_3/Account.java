package ass_3;

public class Account {

    String accountNumber;
    double balance;

    Account(){

    }


    Account(String account){
        this.accountNumber=account;
    }


    void deposit(int amount){
       this.balance=amount;
    }

    double withdraw(double amount) throws InsufficientFundException {
        if(this.balance>amount){
            return this.balance-amount;
        }
        else{
            InsufficientFundException ife= new InsufficientFundException("requested amount is more than the available balance");
          throw ife;
        }
    }

}

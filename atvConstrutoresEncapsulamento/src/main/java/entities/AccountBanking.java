package entities;

public class AccountBanking {
    private int accountNumber;
    private String holderName;
    private double balance;


    public AccountBanking (int accountNumber,String holderName){
          this.accountNumber=accountNumber;
          this.holderName=holderName;
    }
    public AccountBanking (int accountNumber,String holderName,double firstDeposit){
        this.accountNumber=accountNumber;
        this.holderName=holderName;
        this.balance=firstDeposit;
    }

    public void   bankWithdrawal(double deposit){
        this.balance-=deposit + 5.00;
    }
public  void deposit(double deposit){
        this.balance+=deposit;
}

    public String toString() {
        return "Account data:"+
                String.format("Account %d ",accountNumber)+
                String.format("Holder: %s,",holderName)+
                String.format("Balance: $ %.2f",balance);
    }

    public double getBalance() {
        return balance;
    }
}



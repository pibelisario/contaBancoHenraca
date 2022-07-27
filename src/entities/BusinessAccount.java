package entities;

public class BusinessAccount extends Account{


    private Double loanLimit;

   public BusinessAccount(){
       super();
   }

    public BusinessAccount(Integer number, String holder, Double balance) {
        super(number, holder, balance);
    }

    public void loan(double amount){
       if (amount <= loanLimit){
            deposit(amount);
       }
    }
}

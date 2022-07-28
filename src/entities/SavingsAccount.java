package entities;

public class SavingsAccount extends Account{

    private Double interestRate;

    public SavingsAccount(){}

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void uptadeBalance(){
        balance += balance * interestRate;
    }
}

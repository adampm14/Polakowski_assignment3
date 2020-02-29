package polakowski_problem2;

public class SavingsAccount {
static private double annualInterestRate;
private double savingsBalance;
	
public double getsavingsBalance(){
	return this.savingsBalance;
}
public void setsavingsBalance(double balance) {
	 this.savingsBalance = balance;
}


public double calculateMonthlyInterest() {
	//declaring local variable to manipulate savingsBalance
	double monthlyInterest;
	monthlyInterest = ((this.savingsBalance * (annualInterestRate))/12);
	return this.savingsBalance = monthlyInterest+this.savingsBalance;

}
public void balance() {

	System.out.printf("$%.2f", savingsBalance);
}

public static void modifyInterestRate(double rate) {
	annualInterestRate = rate;
	}
}
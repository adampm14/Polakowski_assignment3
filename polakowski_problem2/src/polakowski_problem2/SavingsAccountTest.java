package polakowski_problem2;

public class SavingsAccountTest {
	 
 
 
	public static void main(String[] args) {
		SavingsAccount saver1 = new SavingsAccount();
		SavingsAccount saver2 = new SavingsAccount();
		saver1.setsavingsBalance(2000.00);
		saver2.setsavingsBalance(3000.00);
		SavingsAccount.modifyInterestRate(.04);
		System.out.println("Month \t Saver1  \tSaver2");
		for (int i = 1; i<13; i++) {
			saver1.calculateMonthlyInterest();
			saver2.calculateMonthlyInterest();
			System.out.print("Month " + i + ": ");
			saver1.balance();
			System.out.print("\t");
			saver2.balance();
			System.out.println("");
			}
		System.out.println("");
		System.out.println("Interest increased to 5%");
		SavingsAccount.modifyInterestRate(.05);
		saver1.calculateMonthlyInterest();
		saver2.calculateMonthlyInterest();
		System.out.print("month 13: ");
		saver1.balance();
		System.out.print("\t");
		saver2.balance();
	}
}




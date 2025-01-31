package atm_interface;

public class Bankaccount {
	 private double balance;

		public double getBalance() {
			return balance;
		}

		public void setBalance(double balance) {
			this.balance = balance;
		}
		 //method to deposit
		public void deposit(double amount) {
			if(amount > 0) {
				balance +=amount;
				System.out.println("money Deposited : "+amount);
			}else {
				System.out.println("Invalid amount for deposit!");
			}
		}
		  public void withdraw(double amount) {
			  if (amount > 0 && amount <= balance) {
				balance -=amount;
				System.out.println("money withdraw : "+amount);
			}else {
				System.out.println("insufficient fund");
			}
		  }


}

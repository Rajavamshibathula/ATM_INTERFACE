package atm_interface;



public class User {

	public static void main(String[] args) throws InterruptedException {
		Bankaccount bankAccount=new Bankaccount();
		bankAccount.setBalance(10000);
		Atm atm=new Atm(bankAccount);
		atm.pin();
		atm.showMenu();
		atm.start();

	}

}

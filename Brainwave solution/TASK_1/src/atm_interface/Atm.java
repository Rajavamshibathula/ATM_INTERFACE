package atm_interface;

import java.util.Scanner;


public class Atm {
	 Scanner scanner=new Scanner(System.in);
	 private Bankaccount account;
	 
	 public Atm(Bankaccount account) {
		this.account = account;
	 }
	 
	 public void showMenu() throws InterruptedException {
		
		 	 
		 s1("ATM menu :");
		 s1("1. balance Check ");
		 s1( "2. Deposit cash");
		 s1("3. Withdrawn cash");
		 s1("4. Exit");
		 
	 }
	 public void start() throws InterruptedException {
		
		 boolean status=true;
		while(status) {
			System.out.println("enter your choice");
			int choice=scanner.nextInt();
		 switch (choice) {
		case 1:
			checkBalance();
			break;
			
		case 2:
			deposit();
			break;
		case 3:
			withdraw();
			break;
			
		case 4: 
			status=false;
			s1("Exit ATM , THANK YOU");
			 
			break;
			
		default:
			System.out.println("invalid choice. please select a valid option : ");
			break;
			
		}
		}
		}
		 
	 

	private void withdraw() {
		System.out.println("enter withdrawal amount");
		double amount =scanner.nextDouble();
		account.withdraw(amount);
	}
	

	private void deposit() {
		System.out.println("enter deposit amount :");
		double amount =scanner.nextDouble();
		account.deposit(amount);
	}

	private void checkBalance() {
		System.out.println("current Balance :"+account.getBalance());
		
	}
	
	public void pin() throws InterruptedException {
		s1("Welcome to ATM ");
		s1("Insert your ATM card");
		s1("Enter the your pin");
		int pin=scanner.nextInt();
	}
	 public void s1(String string ) throws InterruptedException {
		  for (int i = 0; i < string.length(); i++) {
				System.out.print(string.charAt(i));
				
				Thread.sleep(50);
			}
		  System.out.println();
	  }
	 
	

}

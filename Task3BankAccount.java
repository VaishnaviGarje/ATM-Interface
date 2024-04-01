package codsoft;

import java.util.Scanner;

public class Task3BankAccount extends Task3ATM{

	public Task3BankAccount(double balance) {
		super(balance);
	}

	public void performtransaction(int option) {
		int amount;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		switch (option) {
		case 1:
			System.out.println("Enter amount to deposite");
			amount = sc.nextInt();
			deposite(amount);
			break;
		case 2:
			System.out.println("Enter amount to Withdrew");
			amount = sc.nextInt();
			withdrew(amount);
			break;
		case 3:
			cheackbalance();
			break;
		case 4:
			System.out.println("Exiting...............");
			break;
		default:
			System.out.println("Invalid option....please try Again");
			break;
		}
	}
	
public static void main(String[] args) {
	Task3BankAccount atm=new Task3BankAccount(1000);
	while(true) {
	System.out.println("choose option...");
	System.out.println("1) Deposite.\t 2) Withdrew\t 3) Cheak Balance\t 4) Exit");
	@SuppressWarnings("resource")
	Scanner s=new Scanner(System.in);
	int option=s.nextInt();
	if(option==4) {
		break;
	}
			atm.performtransaction(option);

		}
	}
}

package codsoft;

public class Task3ATM {
    private double balance;
	public Task3ATM(double balance) {
		this.balance=balance;
	}
	public void deposite(double amount) {
		balance=balance+amount;
		System.out.println("Amount $ "+amount+" Deposited to account.... Current balance is $ "+balance);
	}
	
	public void withdrew(double amount) {
		if(balance>=amount) {
			balance=balance-amount;
			System.out.println("withdrew $ "+amount+"remaining balance is $ "+balance);
		}else {
			System.out.println("Insufficient balance $ "+balance);
		}
	}
	public void cheackbalance() {
	System.out.println("Current Balance is $ "+balance);
	}
}
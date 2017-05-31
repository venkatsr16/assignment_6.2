package exception2;

public class BankAtm {
	int atmId;
	String bankName;
	String location;
	double balance;

	public BankAtm(int atmId,String bankName,String location,double balance){
		this.atmId=atmId;
		this.bankName = bankName;
		this.location = location;
		this.balance = balance;
	}
	public void withdraw(double amt) throws BankATMException{
		double newAccountBalance=10000;
		if(balance < newAccountBalance) {
			throw new BankATMException("Balance is less than 10000. Cannot withdraw");
		}
		else {
			newAccountBalance = balance-amt;
			balance=newAccountBalance;
			System.out.println("Balance is "+balance);
		}
			
	}
	public void deposit(double amt) throws BankATMException {
		double newAccountBalance=10000;
			if(amt<0.0) {
				throw new BankATMException("Cannot deposit");
			}
			else {
				newAccountBalance = balance+amt;
				balance=newAccountBalance;
				System.out.println("Balance is "+balance);
			}
	}
	public static void main(String args[]) {
		BankAtm b1 = new BankAtm(100,"Citi Bank","Adyar",400);
		BankAtm b2 = new BankAtm(101,"HDFC Bank","Mount Road",700);
		BankAtm b3 = new BankAtm(102,"KVB","T Nagar",12500);

		try {
			b1.withdraw(400);
			b1.deposit(300);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		try {
			b2.withdraw(700);
			b2.deposit(200);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
		try {
			b3.withdraw(12500);
			b3.deposit(500);
		}catch(Exception e) {
			System.out.println("Exception occurred "+e);
		}
	}
}
		
		
	
	
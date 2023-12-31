public class BankAccount {
	private double balance;

	public BankAccount(double balance) {
		this.balance = balance;
	}
  public double getBalance() {
		return balance;
	}
  public void deposite(double amount) {
		try {
			if (amount > 0) {
				this.balance = this.balance + amount;
      }
      System.out.println("Total Balance is: " + this.balance);
		} catch (Exception e) {
			System.out.println(" please enter valid amount ");
		}
	}
  public boolean withdraw(double amount) {
		try {
			if (amount < this.balance) {
				this.balance = this.balance - amount;

				System.out.println("Availablel balance is: " + this.balance);
				return true;
			} else {
				System.out.println(" Sorry can not process , insufficient balance !!! ");
				return false;
			}
		} catch (Exception e) {
			System.out.println("Please enter valid ammount ");

		}
		return false;
  }
}

public class ATM {
	private BankAccount bankAccount;

	public ATM(BankAccount bankAccount) {
		this.bankAccount = bankAccount;
	}
  public void test() {
    Scanner sc = new Scanner(System.in);
		System.out.println("\t\t\t***************** WELCOME TO ATM *****************");
		while (true) {
			System.out.println("ATM Menu: ");
			System.out.println("\t\t 1. Check Balance");
			System.out.println("\t\t 2. Deposite");
			System.out.println("\t\t 3. Withdraw");
			System.out.println("\t\t 4. Exit");
      System.out.println("Enter your choice: ");
			int choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1:
				checkBalance();
				break;
			case 2:
				deposite();
				break;
			case 3:
				withdraw();
				break;
			case 4:
				System.out.println("Exiting ATM.Thank You!!");
				break;
			default:
				System.out.println("Invalid Choice.please enter valid option");

			}
		}
	}

	private void checkBalance() {
		double balance = bankAccount.getBalance();
		System.out.println("Current Balance is: " + "RS " + balance);
	}
  private void deposite() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter deposite amount: ");
		double amount = sc.nextDouble();
		bankAccount.deposite(amount);
		System.out.println("Deposite Successful! Total Balance: " + "RS " + bankAccount.getBalance());
	}
		private void withdraw() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter withdrawal amount: ");
		double amount = sc.nextDouble();
		if (bankAccount.withdraw(amount)) {
			System.out.println("withdrawal Successful! Total Balance: " + "RS " + bankAccount.getBalance());
			}
    }
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount user = new BankAccount(20000.0);
		ATM atm = new ATM(user);
		atm.test();
		}
}




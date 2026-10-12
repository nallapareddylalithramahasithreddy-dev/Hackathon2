import java.util.Scanner; 

 

class BankAccount { 

    // Data members 

    private String accountNumber; 

    private String accountHolderName; 

    private double balance; 

 

    // Parameterized constructor 

    public BankAccount(String accountNumber, String accountHolderName, double balance) { 

        this.accountNumber = accountNumber; 

        this.accountHolderName = accountHolderName; 

        this.balance = balance; 

    } 

 

    // Deposit method 

    public void deposit(double amount) { 

        if (amount > 0) { 

            balance += amount; 

            System.out.println("Amount deposited successfully."); 

        } else { 

            System.out.println("Invalid deposit amount."); 

        } 

    } 

 

    // Withdraw method 

    public void withdraw(double amount) { 

        if (amount > 0 && amount <= balance) { 

            balance -= amount; 

            System.out.println("Amount withdrawn successfully."); 

        } else { 

            System.out.println("Insufficient balance or invalid amount."); 

        } 

    } 

 

    // Check balance method 

    public double checkBalance() { 

        return balance; 

    } 

 

    // Display account details 

    public void displayAccount() { 

        System.out.println("\n--- Account Details ---"); 

        System.out.println("Account Number   : " + accountNumber); 

        System.out.println("Account Holder   : " + accountHolderName); 

        System.out.println("Current Balance  : " + balance); 

    } 

} 

 

public class Main { 

    public static void main(String[] args) { 

        Scanner sc = new Scanner(System.in); 

 

        // Read account details 

        System.out.print("Enter Account Number: "); 

        String accountNumber = sc.nextLine(); 

 

        System.out.print("Enter Account Holder Name: "); 

        String accountHolderName = sc.nextLine(); 

 

        System.out.print("Enter Initial Balance: "); 

        double initialBalance = sc.nextDouble(); 

 

        // Create BankAccount object using parameterized constructor 

        BankAccount account = new BankAccount( 

            accountNumber, 

            accountHolderName, 

            initialBalance 

        ); 

 

        // Deposit operation 

        System.out.print("Enter amount to deposit: "); 

        double depositAmount = sc.nextDouble(); 

        account.deposit(depositAmount); 

 

        // Withdrawal operation 

        System.out.print("Enter amount to withdraw: "); 

        double withdrawAmount = sc.nextDouble(); 

        account.withdraw(withdrawAmount); 

 

        // Display final account details 

        account.displayAccount(); 

 

        sc.close(); 

    } 

} 
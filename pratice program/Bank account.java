import java.util.Scanner;

public class BankAccountNoComments {
    
    static final double MIN_BALANCE = 100.0;

    String accountHolder;
    int accountNumber;
    double balance;

    public BankAccountNoComments(String accHolder, int accNum, double initialDeposit) {
        accountHolder = accHolder;
        accountNumber = accNum;
        balance = initialDeposit;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }

    public boolean withdraw(double amount) {
        if (amount <= balance && (balance - amount) >= MIN_BALANCE) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        } else if (amount > balance) {
            System.out.println("Insufficient funds!");
        } else {
            System.out.println("Cannot go below minimum balance.");
        }
        return false;
    }

    public void display() {
        System.out.println("\n=== Account Summary ===");
        System.out.println("Account Holder:\t" + accountHolder + "\nAccount Number:\t" + accountNumber);
        System.out.println("Balance:\t$" + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Account Number: ");
        int accNum = scanner.nextInt();
        System.out.print("Enter Initial Deposit: ");
        double initDeposit = scanner.nextDouble();
        BankAccountNoComments myAccount = new BankAccountNoComments(name, accNum, initDeposit);
        boolean running = true;
        while (running) {
            System.out.println("\nChoose Operation:");
            System.out.println("1. Deposit\n2. Withdraw\n3. Display\n4. Exit");
            System.out.print("Enter choice: ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double depositAmt = scanner.nextDouble();
                    myAccount.deposit(depositAmt);
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawAmt = scanner.nextDouble();
                    myAccount.withdraw(withdrawAmt);
                    break;
                case 3:
                    myAccount.display();
                    break;
                case 4:
                    running = false;
                    System.out.println("Thank you for using Bank Account Manager.");
                    break;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
        // int[] lastFiveTransactions = {200, -100, 50, -50, 100};
        // System.out.println("\nTransaction History (last five):");
        // for (int i = 0; i < lastFiveTransactions.length; ++i) {
        //     if (lastFiveTransactions[i] == 0)
        //         continue;
        //     String type = (lastFiveTransactions[i] > 0) ? "Deposit" : "Withdraw";
        //     System.out.println((i+1) + ". " + type + ": $" + Math.abs(lastFiveTransactions[i]));
        // }
        // int sum = 0; int count = 0;
        // do {
        //     for (int amount : lastFiveTransactions) {
        //         if ((amount & 1) == 1)
        //             sum += amount;
        //         ++count;
        //         if (count >= lastFiveTransactions.length) break;
        //     }
        // } while (count < lastFiveTransactions.length);
        // System.out.println("\nSum of odd transactions: $" + sum);
        scanner.close();
    }
}

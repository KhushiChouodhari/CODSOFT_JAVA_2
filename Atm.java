import java.util.Scanner;

public class Atm 
{
private double accountBalance;
public Atm(double initialBalance) 
{
this.accountBalance = initialBalance;
}
public void displayMenu() 
{
System.out.println("Welcome to the ATM!");
System.out.println("1. Check Balance");
System.out.println("2. Withdraw");
System.out.println("3. Exit");
}
public void checkBalance() 
{
System.out.println("Your account balance is: $" + accountBalance);
}
public void withdraw(double amount) 
{
if (amount > 0 && amount <= accountBalance) 
{
accountBalance -= amount;
System.out.println("Withdrawal successful. Remaining balance: $" + accountBalance);
} 
else {
System.out.println("Invalid withdrawal amount or insufficient balance.");
}
}
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);
Atm atm = new Atm(1000.0); 
while (true) {
atm.displayMenu();
System.out.print("Enter your choice (1/2/3): ");
int choice = scanner.nextInt();
switch (choice) {
case 1:
atm.checkBalance();
break;
case 2:
System.out.print("Enter the withdrawal amount: $");
double withdrawalAmount = scanner.nextDouble();
atm.withdraw(withdrawalAmount);
break;
case 3:
System.out.println("Exiting the ATM. Thank you!");
scanner.close();
System.exit(0);
default:
System.out.println("Invalid choice. Please try again.");
}
}
}
}
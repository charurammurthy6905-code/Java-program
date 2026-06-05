class BankAccount {
    int balance = 0;
    void deposit(int amt) { balance += amt; }
    void withdraw(int amt) { 
        if(amt <= balance) balance -= amt; 
    }
    void display() { System.out.println(balance); }
}

public class Main5
 {
    public static void main(String[] args) {
        BankAccount b = new BankAccount();
        b.deposit(1000);
        b.withdraw(300);
        b.display();  // Output: 700
    }
}
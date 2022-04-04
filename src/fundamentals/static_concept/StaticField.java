package fundamentals.static_concept;

public class StaticField {
    public static void main(String[] args) {
        BankAccount alexPayment = new BankAccount("RO33BRDE", 130);
        BankAccount marcPayment = new BankAccount("RO33BRDE", 180);

        //Check balance
        System.out.println(BankAccount.balance);

        //The balance should always be the same in all instances.
        alexPayment.checkBalance();
        marcPayment.checkBalance();
    }
}

class BankAccount {
    String accountNumber;
    static int balance;

    public BankAccount(String accountNumber, int amount) {
        this.accountNumber = accountNumber;
        balance += amount;
    }

    void checkBalance() {
        System.out.println(balance);
    }
}
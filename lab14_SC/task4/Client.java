package task4;

public class Client extends Thread {
    private BankAccount account;

    public Client(BankAccount account) {
        this.account = account;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            int amount = (int) (Math.random() * 500);
            if (Math.random() < 0.5) {
                account.deposit(amount);
            } else {
                account.withdraw(amount);
            }
        }
    }
}

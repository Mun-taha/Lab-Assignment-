public class BankATM implements ATMService {

    @Override
    public void checkBalance(String accountNumber) {
        System.out.println("Checking balance for account: " + accountNumber);
    }

    @Override
    public void depositFunds(String accountNumber, double amount) {
        System.out.println("Depositing $" + amount + " into account: " + accountNumber);
    }

    @Override
    public void withdrawCash(String accountNumber, double amount) {
        System.out.println("Withdrawing $" + amount + " from account: " + accountNumber);
    }

    @Override
    public void transferFunds(String fromAccount, String toAccount, double amount) {
        System.out.println("Transferring $" + amount + " from account " + fromAccount + " to " + toAccount);
    }

    public void maintenance() {
        System.out.println("Performing maintenance on ATM.");
    }

    public void repair() {
        System.out.println("Repairing the ATM.");
    }
}


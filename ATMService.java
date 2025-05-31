
public interface ATMService {
    void checkBalance(String accountNumber);
    void depositFunds(String accountNumber, double amount);
    void withdrawCash(String accountNumber, double amount);
    void transferFunds(String fromAccount, String toAccount, double amount);
}
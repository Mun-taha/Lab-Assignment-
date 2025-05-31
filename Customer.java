public class Customer {
    private String name;
    private BankATM atm;

    public Customer(String name, BankATM atm) {
        this.name = name;
        this.atm = atm;
    }

    public void useATM() {
        atm.checkBalance("CUST1");
        atm.depositFunds("CUST1", 1000);
        atm.withdrawCash("CUST1", 500);
        atm.transferFunds("CUST1", "CUST2", 200);
    }
}

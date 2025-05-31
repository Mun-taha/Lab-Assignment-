public class BankATMSystem {
    public static void main(String[] args) {
        BankATM atm = new BankATM();

        Customer customer = new Customer("Muntaha", atm);
        customer.useATM();

        System.out.println("------");

        ATMTechnician technician = new ATMTechnician("Kamal", atm);
        technician.performMaintenance();
        technician.performRepair();
    }
}

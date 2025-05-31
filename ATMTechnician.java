
public class ATMTechnician {
    private String name;
    private BankATM atm;

    public ATMTechnician(String name, BankATM atm) {
        this.name = name;
        this.atm = atm;
    }

    public void performMaintenance() {
        atm.maintenance();
    }

    public void performRepair() {
        atm.repair();
    }
}

package Bank;

public class MainBank {
    public static void main(String[] args) {
        Bank bank = new Bank("National Australia Bank" );
        bank.addBranch("Adelaide");
        bank.addCostumer("Adelaide", "Tim", 50.05);
        bank.addCostumer("Adelaide", "Mike", 175.34);
        bank.addCostumer("Adelaide", "Percy", 220.12);
        bank.addCustomerTransaction( "Adelaide", "Tim", 44.22);
        bank.addCustomerTransaction( "Adelaide", "Tim", 12.44);
        bank.addCustomerTransaction( "Adelaide", "Mike", 1.65);
        bank.lisCustomer( "Adelaide", true);

    }
}

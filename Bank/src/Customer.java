import java.util.ArrayList;

public class Customer {
    private String customerName;
    private ArrayList<Double> amountMoney=new ArrayList<>();

    public Customer(String customerName, double amountMoney) {
        this.customerName = customerName;
        this.amountMoney.add(amountMoney);
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<Double> getAmountMoney() {
        return amountMoney;
    }


}

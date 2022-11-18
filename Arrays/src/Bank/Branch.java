package Bank;

import java.util.ArrayList;

public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name) {
        this.name = name;
        this.customers=new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean newCustomer(String customerName,double tranzaction){
       if (findCustomer(customerName)==null){
          return this.customers.add(new Customer(customerName,tranzaction));
       }
       return false;
    }

    public boolean addCustomerTranzaction(String customerName,double tranzaction){
        Customer exsistCostumer=findCustomer(customerName);
        if (exsistCostumer!=null){
            exsistCostumer.addTranzaction(tranzaction);
            return true;
        }
        return false;
        }
    public Customer findCustomer(String customerName){
        for (int i = 0; i < customers.size(); i++) {
            Customer chekingCustomer=this.customers.get(i);
            if (chekingCustomer.getName().equals(customerName)){
                return chekingCustomer;
            }
        }
        return null;

    }

}

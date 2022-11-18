package Bank;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name) {
        this.name = name;
        this.branches = new ArrayList<>();
    }
        public boolean addBranch(String branchName){
                if (findBranch(branchName)==null){
                    this.branches.add(new Branch(branchName));
                    return true;
                }
                return false;
        }

        public  boolean addCostumer(String branchName,String customerName,double initialTransaction){
        Branch branch=findBranch(branchName);
        if (branch!=null){
            branch.newCustomer(customerName,initialTransaction);
            return true;
        }
        return false;
    }


        public boolean addCustomerTransaction(String branchName,String customerName,double initialTransaction){
            Branch branch=findBranch(branchName);
            if (branch!=null){
                return branch.addCustomerTranzaction(customerName,initialTransaction);

            }
            return false;
        }
        public Branch findBranch(String branchName){
            for (int i = 0; i < branches.size(); i++) {
                Branch checkBranch=this.branches.get(i);
                if (checkBranch.getName().equals(branchName)){
                    return checkBranch;
                }
            }
            return null;
    }
        public void lisCustomer(String branchName,boolean showCustomers){
           Branch branch=findBranch(branchName);
           if (branch!=null){
               System.out.println("Customer Details for Branch "+branch.getName());
               ArrayList<Customer> customers=branch.getCustomers();//customers or new ArrayList<Customer>()
               for (int i = 0; i < customers.size(); i++) {
                Customer customer=customers.get(i);
                   System.out.println("Customer: \n"+customer.getName()+"["+(i+1)+"]");
                   if (showCustomers){
                       System.out.println("Transactions: ");
                       ArrayList<Double> doubles=customer.getTranzactions();
                       for (int j = 0; j < doubles.size(); j++) {
                           System.out.println("["+(j+1)+"]"+" amount "+doubles.get(j));
                       }
                   }
               }
           }

        }


}

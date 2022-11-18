package Bank;

import java.util.ArrayList;

public class Customer {
    private String name;
    private ArrayList<Double> tranzactions;

    public Customer(String name, double tranzaction) {
        this.name = name;
        this.tranzactions = new ArrayList<>();
        this.tranzactions.add(tranzaction);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTranzactions() {
        return tranzactions;
    }
    public void addTranzaction(double tranzaction){
       tranzactions.add(tranzaction);
    }
}

package Bank;

import java.util.ArrayList;

/**
 * Created by Arnas on 2017.04.17.
 */
public class Customer {
    private String name;
    private ArrayList<Double> transactions;

    public Customer(String name, double initialTransactionAmount){
        this.name = name;
        this.transactions = new ArrayList<>();
        addTransaction(initialTransactionAmount);
    }

    public void addTransaction(double amount){
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }
}
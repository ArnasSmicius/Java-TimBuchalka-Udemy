package Bank;

import java.util.ArrayList;

/**
 * Created by Arnas on 2017.04.17.
 */
public class Branch {
    private String name;
    private ArrayList<Customer> customers;

    public Branch(String name){
        this.name = name;
        this.customers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public boolean addCustomer(String name, double initialAmount){
        if(findCustomer(name) == null) {
            this.customers.add(new Customer(name, initialAmount));
            return true;
        } else {
            return false;
        }
    }

    public boolean addTransaction(String name, double amount){
        Customer customer = findCustomer(name);
        if(customer != null){
            customer.addTransaction(amount);
            return true;
        } else {
            return false;
        }
    }

    private Customer findCustomer(String name){
        for(Customer customer : customers){
            if(customer.getName().equals(name)){
                return customer;
            }
        }
        return null;
    }
}
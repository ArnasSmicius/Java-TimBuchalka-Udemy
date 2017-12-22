package Bank;

import java.util.ArrayList;

/**
 * Created by Arnas on 2017.04.17.
 */
public class Bank {
    private String name;
    private ArrayList<Branch> branches;

    public Bank(String bankName){
        this.name = bankName;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String name){
        if(findBranch(name) == null){
            branches.add(new Branch(name));
            return true;
        } else {
            return false;
        }
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double amount){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.addTransaction(customerName, amount);
        } else {
            return false;
        }
    }

    public boolean listCustomers(String branchName, boolean showTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branch.getName());
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(Customer customer : branchCustomers){
                System.out.println("Customer: " + customer.getName());
                if(showTransactions){
                    ArrayList<Double> transactions = customer.getTransactions();
                    for(Double transaction : transactions){
                        System.out.println("Amount: " + transaction);
                    }
                }
            }
            return true;
        } else {
            return false;
        }
    }

    private Branch findBranch(String name){
        for(Branch branch : branches){
            if(branch.getName().equals(name)){
                return branch;
            }
        }
        return null;
    }
}

package BankingChallenge;

import java.util.ArrayList;

public class Bank {

    private String name;
    private ArrayList<Branch> branches;

    public Bank(String name){
        this.name = name;
        this.branches = new ArrayList<>();
    }

    public boolean addBranch(String branchName){
        if(findBranch(branchName) != null){
            return false;
        }
        Branch newBranch = new Branch(branchName);
        this.branches.add(newBranch);
        return true;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction){
        Branch branch = findBranch(branchName);
        if(branch != null){
            return branch.newCustomer(customerName, initialTransaction);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction){
        Branch currentBranch = findBranch(branchName);
        if(currentBranch != null){
            return currentBranch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    private Branch findBranch(String branchName){
        for(Branch branch : branches){
            if(branch.getName().equals(branchName)){
                return branch;
            }
        }
        return null;
    }

    public boolean listCustomers(String branchName, boolean printTransactions){
        Branch branch = findBranch(branchName);
        if(branch != null){
            System.out.println("Customer details for branch " + branchName);
            ArrayList<Customer> branchCustomers = branch.getCustomers();
            for(int i =0; i<branchCustomers.size(); i++){
                Customer branchCustomer = branchCustomers.get(i);
                System.out.println("Customer: " + branchCustomer.getName() + "[" + (i + 1) + "]" );
                if(printTransactions){
                    System.out.println("Transactions");
                    ArrayList<Double> transactions = branchCustomer.getTransactions();
                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("[" + (j + 1) + "] Amount " + transactions.get(j));
                    }
                }
            }
            return true;
        }else{
            return false;
        }
    }

//    public boolean listCustomers(String branchName, boolean printTransactions){
//        Branch currentBranch = findBranch(branchName);
//        if(currentBranch != null) {
//            System.out.println("Customer details for branch " + branchName);
//            ArrayList<Customer> currentCustomers = currentBranch.getCustomers();
//            if (printTransactions) {
//                for (int i = 0; i < currentCustomers.size(); i++) {
//                    Customer currentCustomer = currentCustomers.get(i);
//                    System.out.println("Customer: " + currentCustomer.getName() + "[" + (i + 1) + "]");
//                    System.out.println("Transactions");
//                    for (int j = 0; j < currentCustomer.getTransactions().size(); j++) {
//                        System.out.println("[" + (j + 1) + "] Amount " + currentCustomer.getTransactions().get(j));
//                    }
//                }
//                return true;
//            } else {
//                for (int i = 0; i < currentCustomers.size(); i++) {
//                    Customer currentCustomer = currentCustomers.get(i);
//                    System.out.println("Customer: " + currentCustomer.getName() + "[" + (i + 1) + "]");
//                }
//                return false;
//            }
//        }
//        return false;
//    }
}

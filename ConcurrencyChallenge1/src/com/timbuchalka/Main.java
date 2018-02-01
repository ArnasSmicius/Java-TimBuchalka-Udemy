package com.timbuchalka;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	    final BankAccount account = new BankAccount("12345-678", 1000.00);

        Thread person1 = new Thread() {
            @Override
            public void run() {
                account.deposit(300.00);
                account.withdraw(50.00);
            }
        };

        Thread person2 = new Thread() {
            @Override
            public void run() {
                account.deposit(203.75);
                account.withdraw(100.00);
            }
        };

        person1.start();
        person2.start();

        Thread.sleep(5000);
        System.out.println("Account balance = " + account.getBalance());
    }
}

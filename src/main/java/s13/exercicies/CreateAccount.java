package s13.exercicies;

import s13.entities.Account;
import s13.entities.BusinessAccount;
import s13.entities.SavingsAccount;

public class CreateAccount {
    public static void main(String args[]){
        Account account = new Account(1001, "all", 0.0);
        BusinessAccount businessAccount = new BusinessAccount(1002, "allan", 0.0, 500.0);
        businessAccount.loan(0);


        //UPCASTING
        Account account1 = businessAccount;
        Account account2 = new BusinessAccount(1003, "Bob", 100.0, 200.0);
        Account account3 = new SavingsAccount(1004, "Bob", 100.0, 0.00);

        //DOWNCASTING
        BusinessAccount businessAccount4 = (BusinessAccount) new Account(1004, "boo", 0.0);
        BusinessAccount businessAccount2 = (BusinessAccount) account1;
        businessAccount2.loan(1);
        businessAccount4.loan(1);

        if(account3 instanceof BusinessAccount){
            BusinessAccount businessAccount1 = (BusinessAccount) account3;
        } else if (account3 instanceof SavingsAccount) {
            SavingsAccount savingsAccount1 = (SavingsAccount) account3;
            savingsAccount1.updateBalance();
        }


        System.out.println(account2.getBalance());
        account2.withDraw(10);
        System.out.println(account2.getBalance());

        System.out.println(account3.getBalance());
        account3.withDraw(10);
        System.out.println(account3.getBalance());

    }
}

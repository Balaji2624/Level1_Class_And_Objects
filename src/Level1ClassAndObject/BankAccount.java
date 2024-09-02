//Write a Java program to create a class called "BankAccount" with instance variables "balance" and "accountNumber."
//Include a method to deposit money into the account and a method to withdraw money from the account.

package Level1ClassAndObject;

public class BankAccount {
       double balance;
       long accNo;
       public BankAccount(double bal, long acn)
       {
    	   balance=bal;
    	   accNo=acn;
       }
       public void Deposit(int money)
       {
    	   if(money>0)
    	   {
    		   balance=balance+money;
    		   System.out.println("Deposited ammount "+money+" to :"+accNo);
    	   }else {
    		   System.out.println("to Deposit ammount must be positive");
    	   }
    	   
       }
       public void Withdraw(int money)
       {
    	   if(money > 0 && money <= balance)
    	   {
    		   balance=balance-money;
    		   System.out.println("withdraw the ammount "+money+" from "+accNo);
    	   }else if(money > balance)
    	   {
    		   System.out.println("Inssuficant balance in the account that account number is :"+accNo);
    	   }else {
    		   System.out.println("ammount must be positive");
    	   }
    	   
       }
       public  void display()
       {
    	   System.out.println("Total balance in your account : "+balance);
       }
       public static void main(String args[])
       {
    	   BankAccount account=new BankAccount(8000,1665498212);
    	   account.display();
    	   account.Withdraw(200);
    	   account.display();
    	   account.Deposit(2000);
    	   account.display();
       }
}

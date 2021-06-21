package Day_1;

import java.util.Scanner;

         public class Bank_Mangment_Project {
	     static int i=900; 
	     public static void main(String[] args) {
		 Scanner s=new Scanner (System.in);
		 Bank[] user=new Bank[1000];
		
		 while(true)
		 {
			 
			 System.out.println("1_Open a new bank account");
	          System.out.println("2_Show Account info");
	          System.out.println("3_Withdraw");
	          System.out.println("4_Deposite");
	          System.out.println("5_Search");
	          System.out.println("6_exit");
	                              
	          System.out.println("---------------------------------------------------------------------------------------") ;  
	          System.out.println("Please enter your choice[1--6]");   
	               int choice= s.nextInt();
	                      
	          switch (choice) {                   
	                     case 1: 
	                    	 
        			         user[i]=new Bank();
        			         user[i].createAccount(i);
        			        System.out.println("Please rember your account number: "+i);
        			        System.out.println();
        			         ++i;
        			         
        			         break;
	                     case 2: 
	                    	 System.out.println("Enter your Account number:");
	                    	 int num=s.nextInt();
	                    	 user[num].getDetails();
	                    	 break;
	                     case 3:
	                    	 System.out.println("Enter your Account number:");
	                    	 int ok=s.nextInt();
	                    	 System.out.println("Enter a amount:");
	                    	 int amount=s.nextInt();
	                    	 user[ok].withdraw(amount);
	                    	 break;
	                     case 4:
	                    	 System.out.println("Enter your Account number:");
	                    	 int kk=s.nextInt();
	                    	 System.out.println("Enter a amount:");
	                    	 int am=s.nextInt();
	                    	 user[kk].Deposite(am);
	                     case 5:
	                    	 System.out.println("Enter your Account number");
	                    	 int pp=s.nextInt();
	                    	 if(pp==i)
	                    	 {
	                    		 System.out.println("Your Account is in our Bank");
	                    		 
	                    	 }
	                    	 else
	                    		 System.out.println("Your account is not present in our bank");
	                     case 6:
	                    	 break;
	                    	 

	}

}
	}
}


class Bank{
	

	private String Accname;
	private int Accnumber;
	private double balance;
	
	Scanner s=new Scanner (System.in);
	
	
	 void createAccount(int p)
	{
		 System.out.println("Enter Customer name :");
		 Accname=s.nextLine();
		 System.out.println("Enter a opening balance: ");
		 balance=s.nextDouble();
		 p=Accnumber;
		 System.out.println("\"Welcome Account is created  \"");
		 System.out.println();
		 
	} 
	  void getDetails()
		{
              System.out.println("Customer Name:"+Accname);
			  System.out.println("Customer Account Number:"+Accnumber);
			  System.out.println("Account Balence: "+balance);
	    }
	  void withdraw(int amou)
	  {
		  if(balance<amou)
		  {
			  System.out.println("Enter amount is to high balance is low");
		  }
		  else if(balance>=amou)
		  {
			  balance-=amou;
			  System.out.println("Withdraw Sucesfully.....!");
			  System.out.println("Available balence: "+balance);
			  
		  }
		  
	  }

	  void Deposite(int am)
	  {
		  balance+=am;  
		  System.out.println("Deposite amount Sucessfully...!");
		  System.out.println("Available balence: "+balance);
	  }
	
	}
	
	
	
	
	
	

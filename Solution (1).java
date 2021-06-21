import java.util.Scanner;	
class bank{

	String accountno;
	String name;
	String accounttype;
	int balance;
	int amountd;
	int amountw;
    
Scanner sc=new Scanner(System.in);
void setopeningacc()
{
System.out.println("Enter account no.:");
accountno=sc.nextLine();
this.accountno=accountno;
System.out.println("Enter name of account holder.:");
name=sc.nextLine();
this.name=name;
System.out.println("Enter account balance:");
balance=sc.nextInt();
this.balance=balance;
System.out.println("Enter account type:");
sc.nextLine();
accounttype=sc.nextLine();
this.accounttype=accounttype;
}
void setshowacc()
{
System.out.println("Account no.:"+this.accountno);
System.out.println("Account Holder Name:"+this.name);
System.out.println("Total balance:"+this.balance);
System.out.println("Account Type:"+this.accounttype);
}
void setdeposit()
{
System.out.println("Enter amount to deposite:");
amountd=sc.nextInt();
this.balance=this.balance+amountd;
System.out.println("Total balance:"+this.balance);
}
void setwithdraw()
{
System.out.println("Enter amount to withdraw");
amountw=sc.nextInt();
this.balance=this.balance-amountw;
System.out.println("Total balance:"+this.balance);
}

}
class Solution
 {
     public static void main(String args[])
     {
        int j=0;
        int n=0;
		String accountsearch;
       bank obj[]=new bank[5];
        for(int i=0;i<obj.length;i++)
        {   j++;
            System.out.println("Create Account:"+j);
            obj[i]=new bank();
            obj[i].setopeningacc();
        }

		
			int option=0;
			while(option>5|option<5)
			{
		Scanner sc=new Scanner(System.in);
		 System.out.println("Select the operation you want to perform");
		 System.out.println("1.Show account Details.");
		 System.out.println("2.Deposit amount.");
		 System.out.println("3.Withdraw amount.");
		 System.out.println("4.Search.");
		 System.out.println("5.Exit.");
		option=sc.nextInt();
	
		switch(option)
		{
			case 1:
				System.out.println("Enter account no");
				sc.nextLine();
				accountsearch=sc.nextLine();
				for(int i=0;i<obj.length;i++)
				{
					if(obj[i].accountno.equals(accountsearch))
					{
						obj[i].setshowacc();
					}
					else 
					{ System.out.println("Invalid accout no.!!!");}
				}
				break;
			
			case 2:
				System.out.println("Enter account no to deposite:");
				sc.nextLine();
				accountsearch=sc.nextLine();
				for(int i=0;i<obj.length;i++)
				{
					if(obj[i].accountno.equals(accountsearch))
					{
						obj[i].setdeposit();
					}
					else System.out.println("Invalid account no.!!!");
				}
				break;
			case 3:
				System.out.println("Enter account no to withdraw:");
				sc.nextLine();
				accountsearch=sc.nextLine();
				for(int i=0;i<obj.length;i++)
				{
					if(obj[i].accountno.equals(accountsearch))
					{
						obj[i].setwithdraw();
					}
					else System.out.println("Invalid account no.!!!");
				}
				break;
			case 4:
				System.out.println("Enter name to search for account details.");
				sc.nextLine();
				accountsearch=sc.nextLine();
				for(int i=0;i<obj.length;i++)
				{
					if(obj[i].name.equals(accountsearch))
					{
						obj[i].setshowacc();
					}
					else System.out.println("Invalid name!!!");
				}
				break;
			
			default:
		}
		
		if(option>5)
		{
			System.out.println("WRONG INPUT");
		}
		}
	 }
 }

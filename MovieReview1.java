package Movie;
import java.util.Scanner;

class SubM{
	Scanner sc=new Scanner(System.in);
	String Mname;
	String Dname,review;
	int rate;
	static int a;
	
	
	void AddReview(){
		System.out.println();
		System.out.println("     ADD MOVIE");
		System.out.print("Movie Name    : ");
		
		Mname=sc.nextLine();
		System.out.print("Director Name : ");
		Dname=sc.nextLine();
		
		System.out.print("Rate(<=10)    : ");
		int temp=sc.nextInt();
		if(temp<=10)
			rate=temp;
		else
			System.out.println("InValid");

		System.out.println();
		sc.nextLine();
		System.out.println("Enter Review");
		review=sc.nextLine();
		System.out.println();
	}	
}



public class MovieReview1 {
	public static void main(String args[]) 
	{
		
		Scanner sc=new Scanner(System.in);
		int num;
		int j=0;
		SubM obj[]=new SubM[10];

		do
		{
			System.out.println("       MENU");
			System.out.println("Press 1: Add Review");
			System.out.println("Press 2: Find Review");
			System.out.println();
			System.out.print("--->");
			num=sc.nextInt();
		
			
			switch(num) {
			case 1:
				
				obj[j]=new SubM(); 
				System.out.println(j);
				obj[j].AddReview();
				++j;
				break;
			case 2:
				System.out.print("Enter Movie Name :");
				sc.nextLine();
				String temp=sc.nextLine();
				System.out.println("*******************************************");
				for(int k=0;k<j;k++)
				{
					if(obj[k].Mname.equals(temp))   
					{
						System.out.println(obj[k].review);
					}
				}
				
				
				System.out.println("*******************************************");
				break;
			default:
				System.out.println("InValid");
				System.out.println("Enter again..");
			}

		}while(num<=2);
	}
}
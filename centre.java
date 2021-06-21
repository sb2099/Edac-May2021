import java.util.*;
class centre
{

int id;
String name;
String location;
String address;
String coordinator;
Scanner sc=new Scanner(System.in);
 void setdata()
 {
System.out.println("Enter Id : ");
 this.id=sc.nextInt();
 sc.nextLine();
 System.out.println("Enter Name  : ");
 this.name=sc.nextLine();
 System.out.println("Enter Location : ");
 this.location=sc.nextLine();
 System.out.println("Enter Address : ");
 this.address=sc.nextLine();
 System.out.println("Enter Coordinator : ");
 this.coordinator=sc.nextLine();
 }

void getdata()
{
System.out.println(id);
System.out.println(name); 
 switch(location)
 
 
 {
 case "Banglore":
 System.out.println("Banglore");
 case "Pune":
 System.out.println("Pune");
 case "Hyderabad":
 System.out.println("Hyderabad");
 case "Chennai":
 System.out.println("Chennai");
 case "Mumbai":
 System.out.println("Mumbai");
 default:
 System.out.println("put correct case");
 }
System.out.println(address);
System.out.println(coordinator);
}

public static void main(String args[])
{
	int i;
	for(i=0;i<=5;i++)
		
{
centre c = new centre();
c.setdata();
c.getdata();
}
}
}

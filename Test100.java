class A
{
    int i = 10;
    void fun()
    {
        System.out.println("A");
    }
	 void fun1(){
	System.out.println("new fun1() in A");
	//return 1;
	}
}
 
class B extends A
{
    int i = 20;
    void fun()
    {
        System.out.println("B");
    }
}

 class C extends B
{
   int i = 30;
   void fun()
    {
        System.out.println("C");
    }
	void fun1(){
	System.out.println("new fun1() in C");
	}
}

public class Test100
{
    public static void main(String[] args)
    {
          // B obj = new C( );    
 	//A obj = new C( ); 
          //B obj = new B( );               ///////////////////////////  //obj is an object of class B of type B 
          //A obj = new A( );               ////////////////////////// //obj is an object of class A of type A 
          A obj = new B( );             ////////////////////////// //obj is an object of class B of type A
        
        System.out.println(obj.i);
        System.out.println(((B)obj).i);
 obj.fun();
        System.out.println(((C)obj).i);
          
         
	//obj.fun1();

    }
}
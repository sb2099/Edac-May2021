class Fruits {
	public void show()	{
		System.out.println("show from Fruits.");
	}

	public static void display()	{
		System.out.println("display (static) from fruits");
	}
}


class Apple extends Fruits {
	public void show()	{
		System.out.println("show from Apple.");
	}

	public static void display()	{
		System.out.println("display (static) from apple");
	}
}

class Mango extends Fruits {
	public void show()	{
		System.out.println("show from Mango.");
	}

	public static void display()	{
		System.out.println("display (static) from Mango.");
	}
}

class Sample {
	public static void main(String args[]) {
		Apple o6 = new Apple();
		Fruits o7 = o6;

		if(o7 instanceof Apple) {

			System.out.println("Instance of Apple");
			Apple o8 = (Apple) o7;
			o8.show();
			o8.display();
			
		}
		

		Mango o9 = new Mango();
		Fruits o10 = o9;

		if(o10 instanceof Mango) {
			System.out.println("Instance of mango");
			Mango o8 = (Mango) o10;
			o8.show();
			o8.display();
			
		}

		// Fruits o1 = new Fruits();
		// o1.show();
		// o1.display();

		// Apple o2 = new Apple();
		// o2.show();
		// o2.display();

		// Fruits o3 = new Apple();
		// o3.show();
		// o3.display();



		// Apple o4 = new Apple();
		// Fruits o5 = o4;
		// o5.show();
		// o4.show();
		// o5.display();
		

		
		
		

	}
}
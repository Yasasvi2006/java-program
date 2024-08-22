package java_method;
class car {
	public void display()
	{
		System.out.println("it is a car");
	}
}
class bmw extends car{
	public void display()
	{
		System.out.println("it is black car");
	}
}
class Main{
	public static void main(String[] args)
	{
		bmw c1=new bmw();
		c1.display();
	}
}



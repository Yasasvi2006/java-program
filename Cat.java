//default constructor

public class Cat {
	int age;
	String name;
	public Cat()
	{
		age=0;
		name="unknown";
	}
	public static void main (String[] args)
	{
		Cat myObj=new Cat();
		System.out.println(myObj.age);
		System.out.println(myObj.name);
	}
}

//parameterized constructor
public class Dog {
	String name,color;
	public Dog(String x,String y) {
		name=x;
		color=y;
	}
	public static void main(String[] args) {
		Dog myObj=new Dog("todd","black");
		System.out.println(myObj.name);
		System.out.println(myObj.color);
		
	}
}

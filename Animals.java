package divya;
class Animal{
	public void eat()
	{
		System.out.println("animal eats");
	}
	public void sound()
	{
		System.out.println("animal eats");
	}
}
class Lion extends Animal{
	public void eat() {
		System.out.println("lion eats");
	}
	public void sound() {
		System.out.println("lion sounds");
	}
}
class Tiger extends Animal{
	public void eat() {
		System.out.println("tiger eats");
	}
	public void sound() {
		System.out.println("tiger sounds");
	}
}
class Panther extends Animal{
	public void eat() {
		System.out.println("panther eats");
	}
	public void sound() {
		System.out.println("panther sounds");
	}
}
public class Animals {
 public static void main(String[] args) {
	 Lion l1=new Lion();
	 Tiger t1=new Tiger();
	 Panther p1=new Panther();
	 l1.eat();
	 l1.sound();
	 t1.eat();
	 t1.sound();
	 p1.eat();
	 p1.sound();
	 
 }
}

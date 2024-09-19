//overriding
package divya;
class Animal{
	public void move()
	{
		System.out.println("sat");
	}
}
class Cheetah extends Animal{
	public void move()
	{
		System.out.println("moving");
	}
}

public class Animal1 {
public static void main(String[] args)
{
	Cheetah c1=new Cheetah();
	c1.move();
}
}

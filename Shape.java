package divya;

class Shape1 {
	int a=5,b=6;
	public void getArea()
	{
		System.out.println("area is"+a);
	}
}
	class Rectangle extends Shape1{
		public void getArea()
		{
			System.out.println("area is"+a*b);
		}
		}
	class Shape{
		public static void main(String[] args)
		{
			Rectangle r1=new Rectangle();
			r1.getArea();
		}
	}


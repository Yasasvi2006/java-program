//method overloading
package java_method;

public class area {
	public int area1(int x) {
		return (x*x);
	}
	public int area1(int x,int y) {
		return(x*y);
	}
		public double area1(double x) {
			return (Math.PI*x*x);
	}
		public static void main (String[] args)
		{
			area a=new area();
			System.out.println(a.area1(4));
			System.out.println(a.area1(4,8));
			System.out.println(a.area1(8));
			
		}
}


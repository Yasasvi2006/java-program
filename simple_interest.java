//simple interest
package java_method;
import java.util.Scanner;
public class simple_interest {
	public static void main(String[] args) {
		int p,t,r;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the vale of p");
		p=sc.nextInt();
		t=sc.nextInt();
		r=sc.nextInt();

		System.out.println((p*t*r)/100+"is the simple interest");
		
}
}

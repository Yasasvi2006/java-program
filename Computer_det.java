//outerclass-innerclass
class Computer{
	int vers=12;
	class Processor{
		int model;
		public void displayDetails()
		{
			
			model=6;
			System.out.println(model);
		}
	}
}
public class Computer_det {
 public static void main(String[] args) {
	 Computer myOut=new Computer();
	 Computer.Processor myInn=myOut.new Processor();
	 myInn.displayDetails();
	 System.out.println(myOut.vers);
 }
}

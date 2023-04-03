package week1.day2;

public class Car {
	String Model="Maruthi820";
	
	public void printcar() {
		System.out.println("Skoda");
	}
	public int getcarreg() {
	return 1234;
	}
	public int getMultiple(int a, int b, int c) {
		int d =a*b; 
		int e=d*c;
		return e;
	}
	public String getModel() {
		return Model;
		
	}
	public boolean getpuncture()
	{
		return true;
	}
public static void main(String[] args) {
	
	Car obj=new Car();
	String model3 = obj.Model;
	obj.printcar();
	int getcarreg = obj.getcarreg();
	System.out.println(getcarreg);
	int multiple = obj.getMultiple(2, 5, 10);
	System.out.println(multiple);
	//String model2 = obj.getModel();
	System.out.println(model3);
	boolean getpuncture = obj.getpuncture();
	System.out.println(getpuncture);
	
}
}

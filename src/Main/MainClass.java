package Main;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i= 0 ; i < 20 ; i++) 
		{
			System.out.println("hello " + i);
		}
		
		Calculater calc = new Calculater();
		calc.Sum1(10, 20);
		System.out.println("Done");
	}

}

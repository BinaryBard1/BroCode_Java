package dsaq;
import java.util.Random;

public class part8random {
	public static void main(String[]args) {
		Random ran = new Random();
		int a = ran.nextInt(5)+1;
		double b= ran.nextDouble(5);
		boolean z= ran.nextBoolean();
		System.out.println(a);
		System.out.println(b);
		System.out.println(z);
		
		
	}

}

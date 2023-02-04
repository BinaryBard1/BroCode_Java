package dsaq;
import java.util.Scanner;
import java.util.Random;

public class part11_2logical {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int r = rd.nextInt(50);
		System.out.println(r);
		if (r>40) {
			System.out.println("Its Hot Outside!");
		}
		else if (r>30 &&r<40) {
			System.out.println("Ideal Temp");
		}
		else {
			System.out.println("Cold outside");
		}
		sc.close();
		
	}

}

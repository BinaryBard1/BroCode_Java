package dsaq;
import java.util.Scanner;

public class part4userinput {
	public static void main (String [] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name ");
		String name = sc.nextLine();
		System.out.println("Enter your age man");
		int age = sc.nextInt();
		sc.nextLine();
		String name2 = "pair";
		String dish = sc.nextLine();
		System.out.println("Your Name is "+name+ " and your age is "+age+ " Fav dish "+dish);
		sc.close();
		}
	

}

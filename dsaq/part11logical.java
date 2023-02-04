package dsaq;
import java.util.Scanner;

public class part11logical {
	public static void main(String []args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Q or q to quit game");
		String response = sc.next();
		if (!response.equals("Q")&& !response.equals("q")) {
			System.out.println("You have resumed the game");
		}
		else {
			System.out.println("You have ended the game");
		}	
		sc.close();
	}

}

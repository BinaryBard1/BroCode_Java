package dsaq;
import java.util.Scanner;

public class part14_nestedloops {
	public static void main(String [] args) {
		int rows;
		int columns;
		String symbol;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of rows");
		rows = sc.nextInt();
		System.out.println("Enter no of Columns");
		columns = sc.nextInt();
		System.out.println("Enter Symbol");
		symbol = sc.next();
		
		for(int i=1 ; i<=rows; i++) {
			System.out.println();
			for(int j= 1; j<=columns; j++) {
				System.out.print(symbol);
			}
			
		}
		sc.close();
	}

}


package dsaq;

public class pattern {
	public static void main(String []args) {
		for (int i=0; i<6;i++) {
			for(int j = 1; j<=6;j++) {
				if (j==1 || j==6-i) {
					System.out.print("*");
					}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			}		
		}
	}


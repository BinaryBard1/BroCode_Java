package dsaq;

import java.util.Scanner;

public class part7mathclass {
	public static void main(String []args) {
		double x;
		double y;
		double z;
		double a=  10.4;
		double b = -4.01;
		double c = Math.max(a, b);
		double d = Math.min(a, b);
		double e = Math.abs(b);
		double f = Math.sqrt(a);
		double g = Math.floor(a);
		double h = Math.ceil(a);
		double k = Math.round(a);
		System.out.println(c+" "+ d+" "+ e+" "+f+" "+g+" "+h+" "+k);
		
		
		double radius;
		
		System.out.println("Enter length1:-");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		System.out.println("Enter length2:-");
		y= scanner.nextInt();
		
		z = Math.sqrt((x*x)+(y*y));
		System.out.println("Hypo:-"+z);
		radius = scanner.nextDouble();
		double area = Math.PI*radius*radius;
		
		System.out.println("Area of circle"+area);
		scanner.close();
	}

}

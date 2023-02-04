package dsaq;

public class Part3swap {
	public static void main(String[] args) { 
		String name = "Aniruddha";
		String lastname = "Shrikhande";
		String temp;
		
		temp = name;
		name = lastname;
		lastname = temp;
		
		System.out.println("name "+ name);
		System.out.println("lastname "+lastname);
		
		
	}

}

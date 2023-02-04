package dsaq;

public class extra {
	
	public class hello{
		public void hi(String name, int age) {
			System.out.println("Your name is "+name +" and you are "+age+" years old!");
		}
	}
	public static void main(String []args) {
		extra ex =  new extra();
		extra.hello ani = ex.new hello();
		ani.hi("Aniruddha", 19);
		
		
	}

}

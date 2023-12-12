
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello world!"); 
		
		Person p1 = new Person("Henk", true, 180, "Amsterdam", 80);
		//p1.setData("Gerard", true, 180, "Amsterdam", 80);
		p1.printProperties();
		p1.name = "Gerard";
		p1.male = true;
		p1.height = 180;
		p1.city = "Amsterdam";
		p1.weight = 80;
		// Method call
		p1.printProperties();
		int height = p1.whatIsTheHeight();
		String city = p1.whatIsTheCity();
		System.out.println("Lengte = " + height);
		System.out.println("Stad = " + city);
		
		Person p2 = new Person();
		//p2.setData("Suzan", false, 170, "Rotterdam", 65);
		p2.name = "Suzan";
		p2.male = false;
		p2.height = 170;
		p2.city = "Rotterdam";
		p2.weight = 70;
		//p2.printProperties();
		
		int height2 = p2.whatIsTheHeight();
		String city2 = p2.whatIsTheCity();
		System.out.println("Lengte = " + height2);
		System.out.println("Stad = " + city2);
		
		
		
		
		//Product product1 = new Product();
		//product1.setName("TV");
		
		
	}

}

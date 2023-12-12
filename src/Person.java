
public class Person {

	public String name;
	public boolean male;
	public int height;
	public String city;
	public int weight;

	public Person() { 
		System.out.println("In constructor");
	 
		name = "Unknown"; 
		male = false; 
		height = 0; 
		city = "Unknown"; 
		weight = 0; }
	
	
	public Person(String name, boolean male, int height, String city, int weight) {
		System.out.println("In constructor2");
		
		this.name = name;
		this.male = male;
		this.height = height;
		this.city = city;
		this.weight = weight;
	}
	

	// Method declaration
	public void printName() {
		System.out.println("Naam is " + name);
	}

	public void printProperties() {
		System.out.println("Name: " + name + "; Is male: " + male + "; Height: " + height + "; City: " + city
				+ "; Weight: " + weight);
	}

	public void setData(String a, boolean b, int c, String d, int e) {
		System.out.println("Name: " + a + "; Is male: " + b + "; Height: " + c + "; City: " + d + "; Weight: " + e);
	}

	public int whatIsTheHeight() {
		return height;
	}

	public String whatIsTheCity() {
		return city;
	}
}


public class Product {
	
	private String name;
	
	private int costs;
	
	// Getter - Haal waarde op
	public String getName() {
		return name;
	}
	
	// Setter- Stel nieuwe waarde in
	public void setName(String newName) {
		if (newName != null)
			name = newName;
	}

	public int getCosts() {
		return costs;
	}

	public void setCosts(int costs) {
		this.costs = costs;
	}
	
	
}

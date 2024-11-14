package javaintern;

public class Room {
	String type;
	double p;
	boolean available;
	
	public Room(String type, double price) {
		this.type = type;
		this.p = p;
		this.available = true;
	}
	
	public void reserve() {
		this.available = false;
	}
	
	@Override
	public String toString() {
		return "Room Type: " + type + ", price: " + p +", Available: " + (available ? "Yes" : "No");
	}

}

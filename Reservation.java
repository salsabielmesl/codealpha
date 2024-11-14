package javaintern;

public class Reservation {
	Room room;
	String n;
	String cindate;
	String coutdate;
	
	public Reservation(Room room, String n, String cindate, String coutdate) {
		this.room = room;
		this.n = n;
		this.cindate = cindate;
		this.coutdate = coutdate;
	}
	@Override
	public String toString() {
		return "Reservation for" + n + ": Room Type - " + room.type + ", check in -" +cindate + ", check out - " + coutdate;
	}

}

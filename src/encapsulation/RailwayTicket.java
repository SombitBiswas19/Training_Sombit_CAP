package encapsulation;

public class RailwayTicket {
	// private data (hidden seat count)
	private int availableSeats = 50;
	// public method to book ticket
	public void bookTicket(int seats) {
		if (seats <= availableSeats && seats > 0) {
			availableSeats -= seats;
			System.out.println(seats + " seats booked successfully.");
		} else {
			System.out.println("Not enough seats available.");
		}
	}
	// public method to cancel ticket
	public void cancelTicket(int seats) {
		if (seats > 0) {
			availableSeats += seats;
			System.out.println(seats + " seats cancelled successfully.");
		}
	}
	// public method to check available seats
	public int getAvailableSeats() {
		return availableSeats;
	}
}

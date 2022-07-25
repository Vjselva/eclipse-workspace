package FlightBooking;

public class BookingPojo {
	private int  flightId;
	private char Category;
	private char seatType;
	private char seniorCitizen;
	private int noSeats;
	@Override
	public String toString() {
		return "flightId=" + flightId + ", Category=" + Category + ", seatType=" + seatType
				+ ", seniorCitizen=" + seniorCitizen + ", noSeats=" + noSeats + ", Meals=" + Meals + ", totalCost="
				+ totalCost;
	}
	private char Meals;
	private double totalCost;
	public int getFlightId() {
		return flightId;
	}
	public void setFlightId(int flightId) {
		this.flightId = flightId;
	}
	public char getCategory() {
		return Category;
	}
	public void setCategory(char category) {
		Category = category;
	}
	public char getSeatType() {
		return seatType;
	}
	public void setSeatType(char seatType) {
		this.seatType = seatType;
	}
	public char getSeniorCitizen() {
		return seniorCitizen;
	}
	public void setSeniorCitizen(char seniorCitizen) {
		this.seniorCitizen = seniorCitizen;
	}
	public int getNoSeats() {
		return noSeats;
	}
	public void setNoSeats(int noSeats) {
		this.noSeats = noSeats;
	}
	public char getMeals() {
		return Meals;
	}
	public void setMeals(char meals) {
		Meals = meals;
	}
	public double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(double totalCost) {
		this.totalCost = totalCost;
	}
	
	
}

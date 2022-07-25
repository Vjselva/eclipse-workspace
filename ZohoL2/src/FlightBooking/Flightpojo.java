package FlightBooking;

public class Flightpojo {
	
	private int economySeats;
	private int businessSeats;
	private int takalEconomySeats;
	private int tatkalBusinessSeats;
	private int economyCost;
	private int businessCost;
	private int takkalEconomyCost;
	private int takkalBusinessCost;
	private int mealCost;
	public int getEconomySeats() {
		return economySeats;
	}
	public void setEconomySeats(int economySeats) {
		this.economySeats = economySeats;
	}
	public int getBusinessSeats() {
		return businessSeats;
	}
	public void setBusinessSeats(int businessSeats) {
		this.businessSeats = businessSeats;
	}
	public int getTakalEconomySeats() {
		return takalEconomySeats;
	}
	public void setTakalEconomySeats(int takalEconomySeats) {
		this.takalEconomySeats = takalEconomySeats;
	}
	public int getTatkalBusinessSeats() {
		return tatkalBusinessSeats;
	}
	public void setTatkalBusinessSeats(int tatkalBusinessSeats) {
		this.tatkalBusinessSeats = tatkalBusinessSeats;
	}
	public int getEconomyCost() {
		return economyCost;
	}
	public void setEconomyCost(int economyCost) {
		this.economyCost = economyCost;
	}
	public int getBusinessCost() {
		return businessCost;
	}
	public void setBusinessCost(int businessCost) {
		this.businessCost = businessCost;
	}
	public int getTakkalEconomyCost() {
		return takkalEconomyCost;
	}
	public void setTakkalEconomyCost(int takkalEconomyCost) {
		this.takkalEconomyCost = takkalEconomyCost;
	}
	public int getTakkalBusinessCost() {
		return takkalBusinessCost;
	}
	public void setTakkalBusinessCost(int takkalBusinessCost) {
		this.takkalBusinessCost = takkalBusinessCost;
	}
	public int getMealCost() {
		return mealCost;
	}
	public void setMealCost(int mealCost) {
		this.mealCost = mealCost;
	}
	@Override
	public String toString() {
		return "Flightpojo [economySeats=" + economySeats + ", businessSeats=" + businessSeats + ", takalEconomySeats="
				+ takalEconomySeats + ", tatkalBusinessSeats=" + tatkalBusinessSeats + ", economyCost=" + economyCost
				+ ", businessCost=" + businessCost + ", takkalEconomyCost=" + takkalEconomyCost
				+ ", takkalBusinessCost=" + takkalBusinessCost + ", mealCost=" + mealCost + "]";
	}
	
	
	
}

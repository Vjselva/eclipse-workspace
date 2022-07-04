package FoodOrderDB;

public class FoodDetails {
	private String name;
	private FoodType type;
	private int price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public FoodType getType() {
		return type;
	}

	public void setType(FoodType type) {
		this.type = type;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "FoodDetails [name=" + name + ", type=" + type + ", price=" + price + "]";
	}


}

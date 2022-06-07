package FoodOrder;

public class UserDetails {
	
	private String userName;
	private long mobileNumber;
	private String location;
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public long getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(long mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserPage [userName=" + userName + ", mobileNumber=" + mobileNumber + ", location=" + location
				+ ", password=" + password + "]";
	}

	
	

}

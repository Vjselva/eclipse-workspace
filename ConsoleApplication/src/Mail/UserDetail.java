package Mail;

import java.util.ArrayList;

public class UserDetail {
	
	private String name;
	private int age;
	private Long mobileno;
	private String password;
	private ArrayList<SendMail> sendMail=new ArrayList<SendMail>();
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Long getMobileno() {
		return mobileno;
	}
	public void setMobileno(Long mobileno) {
		this.mobileno = mobileno;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ArrayList<SendMail> getSendMail() {
		return sendMail;
	}
	public void setSendMail(ArrayList<SendMail> sm) {
		this.sendMail.addAll(sm);
	}
	
	@Override
	public String toString() {
		return "UserDetail [name=" + name + ", age=" + age + ", mobileno=" + mobileno + ", password=" + password
				+ ", sendMail=" + sendMail.toString() + "]";
	}
	
	
	

}

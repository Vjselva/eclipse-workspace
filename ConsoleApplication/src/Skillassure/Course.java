package Skillassure;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String courseId;
	private String name;
	private List<Assesment> assesList=new ArrayList<Assesment>();
	
	public Course(String Id, String name) {
		courseId=Id;
		this.name=name;
	}
	public String getCourseId() {
		return courseId;
	}
	public String getName() {
		return name;
	}
	public void addAssesment(Assesment ass){
		assesList.add(ass);
	}
	public List<Assesment> getAssesments(){
		return assesList;
	}
	public int getTotalMCQ(){
		int total=0;
		for(Assesment ass:assesList){
			total+=ass.getTotalMCQ();
		}
		return total;
	}
	public int getTotalHandsOn(){
		int total=0;
		for(Assesment ass:assesList){
			total+=ass.getTotalHandsOn();
		}
		return total;
	}
	public int getTotalScore(){
		int total=0;
		for(Assesment ass: assesList){
			total+=ass.getTotalScore();
		}
		return total;
	}

}

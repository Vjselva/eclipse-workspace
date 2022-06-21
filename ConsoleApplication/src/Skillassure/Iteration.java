package Skillassure;

import java.util.ArrayList;
import java.util.List;

public class Iteration
{
	private int iterationNo;
	private String goal;
	private Course course; //Iteration has course
	private List<Assesment> assesList=new ArrayList<Assesment>(); //Interation has many Assesments
	
	public Iteration(int num, String gol) {
		iterationNo=num;
		goal=gol;
	}
	public void addAssesment(Assesment ass){
		assesList.add(ass);
	}
	public int getIterationNo() {
		return iterationNo;
	}
	public String getGoal() {
		return goal;
	}
	public List<Assesment> getAssesList() {
		return assesList;
	}
	public void setCourse(Course course) {
		this.course = course;
	}
	public Course getCourse() {
		return course;
	}
	public int getTotalAssesments(){
		return assesList.size(); //total number of assessments
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

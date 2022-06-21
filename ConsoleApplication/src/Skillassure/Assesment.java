package Skillassure;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Assesment 
{
	private int assesmentId;
	private String desc;
	private int noOfQuestion;
	private Date dtassesment;
	private List<Question> quesList=new ArrayList<Question>();
	
	public Assesment() 
	{
		
	}
	
	public Assesment(int assesmentId, String desc, int noOfQuestion,Date dtassesment) {
		this.assesmentId = assesmentId;
		this.desc = desc;
		this.noOfQuestion = noOfQuestion;
		this.dtassesment = dtassesment;
	}
	public int getAssesmentId() {
		return assesmentId;
	}

	public String getDesc() {
		return desc;
	}

	public int getNoOfQuestion() {
		return noOfQuestion;
	}

	public Date getDtassesment() {
		return dtassesment;
	}

	public List<Question> getQuesList() {
		return quesList;
	}

	public void addQuestion(Question ques){
		quesList.add(ques);
	}
	public int getTotalMarks(){
		int totalMarks=0;
		for(Question ques: quesList){
			totalMarks+=ques.getmarks();
		}
		return totalMarks;
	}
	public List<Question> getQuestions(){
		return quesList;
	}
	public int getTotalMCQ(){
		int total=0;
		for(Question ques:quesList){
			if(ques instanceof MCQQuestion)
				total++;//Question = MCQ + Handson
		}
		return total;
	}
	public int getTotalHandsOn(){
		int total=0;
		for(Question ques:quesList){
			if(ques instanceof HandsOnQuestion)
				total++;
		}
		return total;
	}
	public int getTotalScore(){
		int total=0;
		for(Question ques: quesList){
			total+=ques.getmarks();
		}
		return total;
	}

}

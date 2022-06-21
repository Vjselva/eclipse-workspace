package Skillassure;

public class SkillAssureTrainingModel {
	private String clientName;
	private Iteration[] iteration=new Iteration[3]; //SkillAsure has  3 Iterations
	
	public SkillAssureTrainingModel(String name) {
		this.clientName=name;
		iteration[0]=new Iteration(0, "Fundamentals");
		iteration[1]=new Iteration(1, "Core Java");
		iteration[2]=new Iteration(2, "Web Designing");
	}
	public String getName(){
		return clientName;
	}
	public int getTotalAssesmentsInTraining(){
		int total=0;
		for(Iteration i:iteration){
			total+=i.getTotalAssesments();
			total+=i.getCourse().getAssesments().size();
		}
		return total;
	}
	
	public int getMCQBasedAssesments(){
		int total=0;
		for(Iteration i:iteration){
			total+=i.getTotalMCQ();
			total+=i.getCourse().getTotalMCQ();
		}
		return total;
	}
	public int getHandsOnBasedAssesments(){
		int total=0;
		for(Iteration i:iteration){
			total+=i.getTotalHandsOn();
			total+=i.getCourse().getTotalHandsOn();
		}
		return total;
	}
	public int getTotalScoreOfAllAssesments(){
		int total=0;
		for(Iteration i:iteration){
			total+=i.getTotalScore();
			total+=i.getCourse().getTotalScore();
		}
		return total;
	}
	public Iteration getInstanceOfZerothIteration(){
		return iteration[0];
	}
	public Iteration getInstanceOfFirstIteration(){
		return iteration[1];
	}
	public Iteration getInstanceOfSecondIteration(){
		return iteration[2];
	}
}

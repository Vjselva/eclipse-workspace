package Skillassure;

import java.util.Date;

public class TestMainFunc {

	public static void main(String[] args) {
		
	

			SkillAssureTrainingModel model=new SkillAssureTrainingModel("HCL");
			
			Course c1=new Course("HCL001", "PLT");
			Course c2=new Course("HCL002", "CORE JAVA");
			Course c3=new Course("HCL003", "WEB DESIGN");
			
			//adding interation and course to SkillAssureModel
			model.getInstanceOfZerothIteration().setCourse(c1);
			model.getInstanceOfFirstIteration().setCourse(c2);
			model.getInstanceOfSecondIteration().setCourse(c3);
					
			Date date=new Date(System.currentTimeMillis());
			System.out.println(date);
			
			Assesment assesment=new Assesment(1,"JAVA", 12,date);
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 10));
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 10));
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 20));
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 20));
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 50));
			assesment.addQuestion(new HandsOnQuestion("JAVA","PPT", 50));
			
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 1));
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 1));
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 2));
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 2));
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 5));
			assesment.addQuestion(new MCQQuestion("Pseudocode","a", "b", "c","d","a", 5));
			//assesment.addQuestion(new MCQQuestion(null, null, null, null, null, null, 0)
			
			Assesment assesment2=new Assesment(2, "Python", 10, date);
			assesment.addQuestion(new HandsOnQuestion("Python", "PPt", 20));
			assesment.addQuestion(new HandsOnQuestion("Python", "PPt", 30));
			assesment.addQuestion(new HandsOnQuestion("Python", "PPt", 20));
			assesment.addQuestion(new HandsOnQuestion("Python", "PPt", 30));
			assesment.addQuestion(new HandsOnQuestion("Python", "PPt", 20));
			
			assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "a", 2));
			assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "a", 3));
			assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "a", 2));
			assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "a", 3));
			assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "a", 2));
			//assesment.addQuestion(new MCQQuestion("Pseudocode", "a", "b", "c", "d", "e", 1));
			
			model.getInstanceOfZerothIteration().addAssesment(assesment);
			//model.getInstanceOfZerothIteration().addAssesment(assesment2);
			
			System.out.println("Total Assesments: "+model.getTotalAssesmentsInTraining());
			System.out.println("MCQ Questions: "+model.getMCQBasedAssesments());
			System.out.println("Hands On Question: "+model.getHandsOnBasedAssesments());
			System.out.println("Total Marks: "+model.getTotalScoreOfAllAssesments());
		}

	}



package Skillassure;

public class MCQQuestion extends Question
{
	private String questionName;
	private String option1;
	private String option2;
	private String option3;
	private String option4;
	private String rightOption;
	
	public MCQQuestion(String questionName, String option1, String option2,	String option3, String option4, String rightOption, int marks) {
		super(marks);
		this.questionName = questionName;
		this.option1 = option1;
		this.option2 = option2;
		this.option3 = option3;
		this.option4 = option4;
		this.rightOption = rightOption;
	}

	public String getQuestionName() {
		return questionName;
	}

	public String getOption1() {
		return option1;
	}

	public String getOption2() {
		return option2;
	}

	public String getOption3() {
		return option3;
	}

	public String getOption4() {
		return option4;
	}

	public String getRightOption() {
		return rightOption;
	}

}

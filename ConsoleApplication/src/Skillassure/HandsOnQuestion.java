package Skillassure;

public class HandsOnQuestion extends  Question
{
	private String questiondesc;
	private String referenceDocument;
	
	public HandsOnQuestion(String desc, String doc, int marks){
		super(marks);
		questiondesc=desc;
		referenceDocument=doc;
	}

	public String getQuestiondesc() {
		return questiondesc;
	}

	public String getReferenceDocument() {
		return referenceDocument;
	}

}

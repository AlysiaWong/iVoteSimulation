// Alysia Wong
// CS 3560 Assignment 1
// MultiChoiceQuestion.java - Type of Question, students can have multiple answers.

package iVoteSimulation;

import java.util.ArrayList;

public class MultiChoiceQuestion implements Question {
	private String multiQuestion;
	private ArrayList<String> multiAnswerChoices = new ArrayList<String>();
	private boolean isMultiType = true;
	
	public MultiChoiceQuestion(String question, ArrayList<String> answers)
	{
		this.multiQuestion = question;
		this.multiAnswerChoices = answers;
	}
	
	public void setQuestion(String question) {
		this.multiQuestion = new String (question);
	}
	
	public String getQuestion() {
		return multiQuestion;
	}
	
	public void setAnswer(ArrayList<String> answers) {
		this.multiAnswerChoices = answers;
	}
	
	public ArrayList<String> getAnswer() {
		return multiAnswerChoices;
	}
	
	public boolean isMultiType(){
		return isMultiType;
	}
}

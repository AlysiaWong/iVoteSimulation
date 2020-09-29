// Alysia Wong
// CS 3560 Assignment 1
// SingleChoiceQuestion.java - Type of Question, students can have a single answer.

package iVoteSimulation;

import java.util.ArrayList;

public class SingleChoiceQuestion implements Question {
	private String singleQuestion;
	private ArrayList<String> singleAnswerChoices;
	private boolean isMultiType = false;
	
	public SingleChoiceQuestion(String question, ArrayList<String> answer){
		this.singleQuestion = question;
		this.singleAnswerChoices = answer;
	}
	
	public void setQuestion(String question) {
		this.singleQuestion = question;
	}
	
	public String getQuestion() {
		return singleQuestion;
	}
	
	public void setAnswer(ArrayList<String> answer) {
		this.singleAnswerChoices = answer;
	}
	
	public ArrayList<String> getAnswer() {
		return singleAnswerChoices;
	}
	
	public boolean isMultiType() {
		return isMultiType;
	}
}

// Alysia Wong
// CS 3560 Assignment 1
// Question.java - Interface

package iVoteSimulation;

import java.util.ArrayList;

public interface Question {
	public String getQuestion();
	public void setQuestion(String question);
	public void setAnswer(ArrayList<String> answer);
	public ArrayList<String> getAnswer();
	public boolean isMultiType();
}

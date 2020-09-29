// Alysia Wong
// CS 3560 Assignment 1
// VotingService.java - voting service to calculate the total number of each response.

package iVoteSimulation;

import java.util.ArrayList;


public class VotingService {
	private boolean isMultiType;
	private ArrayList<String> studentAnswers;
	private int A= 0, B = 0, C = 0, D = 0;
	
	public VotingService(boolean questionType, ArrayList<String> answers)
	{
		this.isMultiType = questionType;
		this.studentAnswers = answers;
	}
	
	public void answerResults(ArrayList<String> studentAnswers){
		for (int i = 0 ; i < studentAnswers.size() ; i++){
				String val = studentAnswers.get(i);
				if (val.equals("A"))
					A++;
				else if (val.equals("B"))
					B++;
				else if (val.equals("C"))
					C++;
				else if (val.equals("D"))
					D++;	
				else
					System.out.print("invalid input");
		}
	}
	
	public void printResults(){
		System.out.print("Results \n A:" + A + " B:" + B + " C:" + C + " D:" + D + "\n\n");
		// reset answer results for next question
		A = 0;
		B = 0;
		C = 0;
		D = 0;
	}
	
	public void revote(ArrayList<String> newAnswer) {
		answerResults(newAnswer);   // compute the answer results
		printResults();   // print out the results
	}
}

// Alysia Wong 
// CS3560 Assignment 1
// MultiResponse.java - Response for multiple choice answers.

package iVoteSimulation;

public class MultiResponse implements Response  {
	private String responseA;
	private String responseB;
	private String responseC;
	private String responseD;
	
	public MultiResponse(String a, String b, String c, String d) {
		this.responseA = a;
		this.responseB = b;
		this.responseC = c;
		this.responseD = d;
	}
	
	public void printResponseChoices() {
		System.out.println("A) " + responseA
						  +" B) " + responseB
						  +" C) " + responseC
						  +" D) " + responseD);
	}
}

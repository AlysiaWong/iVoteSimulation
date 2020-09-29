// Alysia Wong
// CS 3560 Assignment 1
// SingleResponse.java - Response for single answer choice.

package iVoteSimulation;

public class SingleResponse implements Response {
	private String responseA;
	private String responseB;
	private String responseC;
	private String responseD;
	
	public SingleResponse(String a, String b, String c, String d) {
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

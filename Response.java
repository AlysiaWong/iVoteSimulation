// Alysia Wong
// CS 3560 Assignment 1
// Response.java - prints out response choices that students can choose from

package iVoteSimulation;

public class Response {
	private String responseA;
	private String responseB;
	private String responseC;
	private String responseD;
	
	public Response(String a, String b, String c, String d) {
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

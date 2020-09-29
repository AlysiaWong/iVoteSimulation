// Alysia Wong
// CS 3560 Assignment 1
// Student.java - Students answering the polling questions. Have an ID and their answers. 

package iVoteSimulation;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Student {
	private int id;   
	HashMap<Integer,ArrayList<String>> studentAnswer = new HashMap<Integer,ArrayList<String>>();
		
	public Student(int id){
		this.id = id;
	}
		
	public void setId(int setId) {
		this.id = setId;
	}
	
	public int getId(){
		return id;
	}
		
	public void setStudentAnswer(int currID, ArrayList<String> currAnswer){
		studentAnswer.put(currID,currAnswer);
	}
	
	public ArrayList<String> getStudentAnswer(int studentID){
		ArrayList<String> val = studentAnswer.get(studentID);
		return val;
	}
}

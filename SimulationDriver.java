// Alysia Wong
// CS 3560 Assignment 1
// SimulationDriver.java - Simulates a random number of students voting on various question types. This includes multiple choice questions or single choice questions.

package iVoteSimulation;

import java.util.ArrayList;
import java.util.Collections;

import iVoteSimulation.MultiChoiceQuestion;
import iVoteSimulation.SingleChoiceQuestion;
import iVoteSimulation.Student;
import iVoteSimulation.VotingService;

public class SimulationDriver {
	private static MultiChoiceQuestion q1;
	private static SingleChoiceQuestion q2;
	private static VotingService question1, question2;
	private static String currentQuestion;
	private static Response multiResponses, singleResponses;
	private static ArrayList<String> currentAnswerChoices = new ArrayList<String>();
	private static ArrayList<String> studentAnswers = new ArrayList<String>();
	final static int TOTAL_STUDENTS = (int)(Math.random() * 50) + 1;
	private static Student[] student = new Student[TOTAL_STUDENTS];
		
	public static void main(String[] args) {
		// start message
		System.out.println("*** Welcome to iVote Simulator ***");
			
		// creating student IDs		
		System.out.println("Total Students: " + student.length);
		student = createStudentIds(student.length);
			
		for (int i = 0 ; i < 50 ; i++){
			System.out.print("-");
				
			if (i == 49)
				System.out.println();
		}
			
		/*
		 * Multiple Choice Question
		*/
			
		// set and print question and answers
		currentQuestion = new String ("Which of the following movies were made in the 1970's?");
		currentAnswerChoices.add("A");
		currentAnswerChoices.add("B");
		currentAnswerChoices.add("C");
		currentAnswerChoices.add("D");
		
		q1 = new MultiChoiceQuestion(currentQuestion, currentAnswerChoices);
		System.out.println("Question: " + q1.getQuestion());
		multiResponses = new Response("The Godfather", "Rocky", "West Side Story", "Titanic");
		multiResponses.printResponseChoices();
		
		// students picking their answers
		int numSelectedAnswers;
		Collections.shuffle(currentAnswerChoices);
		for (int i = 0 ; i < student.length ; i++) { 
			numSelectedAnswers = (int)(Math.random() * currentAnswerChoices.size() + 1); // random number of selected answers
			for (int j = 0 ; j < numSelectedAnswers ; j++){ 
				studentAnswers.add(currentAnswerChoices.get(j));
			}
			student[i].setStudentAnswer(i, studentAnswers);
		}	
		
		// voting service
		question1 = new VotingService(q1.isMultiType(),studentAnswers);
		question1.answerResults(studentAnswers);
		question1.printResults();
		
		// revote
		int numRevote = (int)(Math.random()*student.length+1);
		Collections.shuffle(currentAnswerChoices);
		System.out.println("Chance to revote...");
		for (int i = 0; i < numRevote ; i++) { // for number of students
			numSelectedAnswers = (int)(Math.random() * currentAnswerChoices.size() + 1); // random number of selected answers
			for (int j = 0 ; j < numSelectedAnswers ; j++){ // for amount of random selected answers
				studentAnswers.set(i, currentAnswerChoices.get(j));
			}
			student[i].setStudentAnswer(i, studentAnswers);
		}
		question1.revote(studentAnswers);
		
		/*
		 * SINGLE CHOICE ANSWER
		 */
		for (int i = 0 ; i < 50 ; i++){
			System.out.print("-");
				
			if (i == 49)
				System.out.println();
		}
		
		// set and print question and answers
		currentQuestion = "What is the capital of Canada?";
		q2 = new SingleChoiceQuestion(currentQuestion, currentAnswerChoices);
		System.out.println("Question: " + q2.getQuestion());
		singleResponses = new Response("Ottawa", "Toronto", "Montreal", "Ontario");
		singleResponses.printResponseChoices();
		studentAnswers.clear(); // new question
		
		// students selecting their answers
		Collections.shuffle(currentAnswerChoices);
		for (int i = 0 ; i < student.length ; i++) { // loop through every student
			int singleAnswer = (int)(Math.random()*currentAnswerChoices.size());
			studentAnswers.add(i, currentAnswerChoices.get(singleAnswer));
			student[i].setStudentAnswer(i, studentAnswers);
		}	
		
		question2 = new VotingService(q2.isMultiType(),studentAnswers);
		question2.answerResults(studentAnswers);
		question2.printResults();
		
		// revote
		numRevote = (int)(Math.random()*student.length+1);
		Collections.shuffle(currentAnswerChoices);
		System.out.println("Chance to revote...");
		for (int i = 0; i < numRevote ; i++) { // for number of students
			int singleAnswer = (int)(Math.random()*currentAnswerChoices.size());
			studentAnswers.set(i, currentAnswerChoices.get(singleAnswer));
			student[i].setStudentAnswer(i, studentAnswers);
		}		
		question2.revote(studentAnswers);
		
		// ending message
		System.out.println("*** End of iVote Simulator ***");
	}
				
	public static Student[] createStudentIds(int numberOfStudents){
	// loop will run depending on total number of students
		for (int i = 0 ; i < numberOfStudents ; i++){
			student[i] = new Student(i+1);   // assigning student IDs
		}
		return student;
	}
}

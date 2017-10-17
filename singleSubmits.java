//the collection of submissions are held by a hashmap with 
//student id as key and an integer value of which answer they selected

import interfaces.*;
import java.util.*;

public class singleSubmits implements Submissions {
	Map<Integer, Integer> submissions = new HashMap<Integer, Integer>();
	int numbOfAnswers;

	// adds or updates a submission to the submissions hashMap
	public void add(int ID, int selection) {
		submissions.put(ID, selection);
	}

	//sets the container and number of answers
	public void setContainer(Question question) {
		submissions = new HashMap<Integer, Integer>();
		numbOfAnswers = question.getAnswerCount();
	}

	// prints out the submission results
	public void outputStats() {
		int[] counts = new int[numbOfAnswers];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		for (Integer value : submissions.values()) {
			counts[value]++;
		}
		System.out.println("===========Single-Choice Stats===========");
		System.out.println("Total Students: " + submissions.size());

		for (int i = 0; i < counts.length; i++) {
			System.out.println((i + 1) + ". : " + counts[i]);
		}
	}

}

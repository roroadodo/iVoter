import interfaces.*;
import java.util.*;

public class singleSubmits implements Submissions {
	Map<Integer, Integer> submissions = new HashMap<Integer, Integer>();
	int numbOfAnswers;

	public void add(int ID, int selection) {
		submissions.put(ID, selection);
	}

	public void setContainer(Question question) {
		submissions = new HashMap<Integer, Integer>();
		numbOfAnswers = question.getAnswerCount();
	}

	public void outputStats() {
		int[] counts = new int[numbOfAnswers];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		for (Integer value : submissions.values()) {
			counts[value]++;
		}
		System.out.println("===========Total Results===========");
		System.out.println("Total Students: " + submissions.size());
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println((i + 1) + ". : " + counts[i]);
		}
	}

}

import java.util.*;

import interfaces.*;

public class multiSubmits implements Submissions {
	Map<Integer, Integer[]> submissions;
	int numbOfAnswers;

	public void add(int ID, int selection) {
		if (submissions.containsKey(ID)) {
			submissions.get(ID)[selection] = 1;
		} else {
			submissions.put(ID, new Integer[numbOfAnswers]);
			for(int i = 0; i<numbOfAnswers; i++) {
				submissions.get(ID)[i] = 0;
			}
			submissions.get(ID)[selection] = 1;
		}
	}

	public void setContainer(Question question) {
		submissions = new HashMap<Integer, Integer[]>();
		numbOfAnswers = question.getAnswerCount();

	}

	public void outputStats() {
		int[] counts = new int[numbOfAnswers];
		for (int i = 0; i < counts.length; i++) {
			counts[i] = 0;
		}
		for (Integer[] value : submissions.values()) {
			for(int i = 0; i<numbOfAnswers; i++) {
				counts[i] += value[i];
			}
		}
		System.out.println("===========Total Results===========");
		System.out.println("Total Students: " + submissions.size());
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println((i + 1) + ". : " + counts[i]);
		}
	}

}

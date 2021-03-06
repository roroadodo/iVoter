import interfaces.Student;
import interfaces.iVoter;
import java.util.*;

public class regStudent implements Student {
	private Random rand = new Random();
	private int id;

	// constructor; Id is randomly generated
	public regStudent() {
		id = rand.nextInt(10000) + 1;
	}

	public int getID() {
		return id;
	}

	public void setID() {
		//not used
	}

	// students will choose a random answer, and submit it to the ivoter
	public void submitAnswer(iVoter ivoter) {
		int answerCount = ivoter.getAnswerCount();
		int chosenAnswer = rand.nextInt(answerCount);
		ivoter.AnswerQuestion(id, chosenAnswer);
	}

}

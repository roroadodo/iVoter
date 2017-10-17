import java.util.ArrayList;
import java.util.List;
import interfaces.*;

public class regQuestion implements Question {

	String QuestionTxt;
	List<CandidateAnswer> AnswersList = new ArrayList<CandidateAnswer>();

	public void setQuestion(String q) {
		QuestionTxt = q;
	}

	//adds an answer object to the list
	public void setAnswer(CandidateAnswer answer) {
		AnswersList.add(answer);
	}

	//prints out the question
	public void outputQuestion() {
		System.out.println(QuestionTxt);
		for (int i = 0; i < AnswersList.size(); i++) {
			System.out.print((i + 1) + ". ");
			CandidateAnswer temp = (CandidateAnswer) AnswersList.get(i);
			temp.printAnswer();
		}
	}

	//returns number of answers
	public int getAnswerCount() {
		if (AnswersList != null) {
			return AnswersList.size();
		} else
			return 0;
	}

}

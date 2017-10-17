import java.util.ArrayList;
import java.util.List;
import interfaces.*;

public class regQuestion implements Question {

	String QuestionTxt;
	List<CandidateAnswer> AnswersList = new ArrayList();

	public void setQuestion(String q) {
		QuestionTxt = q;
	}

	public void setAnswer(CandidateAnswer answer) {
		AnswersList.add(answer);
	}

	public void outputQuestion() {
		System.out.println(QuestionTxt);
		for (int i = 0; i < AnswersList.size(); i++) {
			System.out.print((i + 1) + ". ");
			CandidateAnswer temp = (CandidateAnswer) AnswersList.get(i);
			temp.printAnswer();
		}
	}

	public int getAnswerCount() {
		if (AnswersList != null) {
			return AnswersList.size();
		} else
			return 0;
	}

}

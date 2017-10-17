import interfaces.*;

public class regiVoter implements iVoter {

	Question Question;
	Submissions submissions;

	public void setQuestion(Question question) {
		this.Question = question;

	}

	public void setSubmits(Submissions submissions) {
		this.submissions = submissions;

	}

	public void AnswerQuestion(int ID, int chosenAnswer) {
		submissions.add(ID, chosenAnswer);
	}

	public int getAnswerCount() {
		if (Question != null) {
			return Question.getAnswerCount();
		} else
			return 0;
	}

	public void outputResults() {
		Question.outputQuestion();
		submissions.outputStats();
	}

}

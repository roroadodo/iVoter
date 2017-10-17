import interfaces.CandidateAnswer;

public class strAnswer implements CandidateAnswer {
	String Answer;

	public void setAnswer(String txt) {
		Answer = txt;
	}

	public void printAnswer() {
		System.out.println(Answer);

	}

}

package interfaces;

public interface Question {
	public void setQuestion(String q);
	public void setAnswer(CandidateAnswer answer);
	public void outputQuestion();
	public int getAnswerCount();
}

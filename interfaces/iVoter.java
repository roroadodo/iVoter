package interfaces;

public interface iVoter {

	public void setQuestion(Question question);
	public void setSubmits(Submissions submissions);
	public void AnswerQuestion(int ID, int chosenAnswer);
	public int getAnswerCount();
	public void outputResults();
}

//the question object will hold a string for the question and a collection of answer objects
package interfaces;

public interface Question {
	public void setQuestion(String q);

	public void setAnswer(CandidateAnswer answer);

	public void outputQuestion();

	public int getAnswerCount();
}

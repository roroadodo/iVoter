//the iVoter object will hold both the question object and the submissions object
//students will use the ivoter object to answer the set question.
package interfaces;

public interface iVoter {

	public void setQuestion(Question question);

	public void setSubmits(Submissions submissions);

	public void AnswerQuestion(int ID, int chosenAnswer);

	public int getAnswerCount();

	public void outputResults();
}

//Students will have an ID and will be able to submit an answer using the ivoter object
package interfaces;

public interface Student {

	public int getID();

	public void setID();

	public void submitAnswer(iVoter ivoter);
}

//submissions will hold a collection of which candidate answer 
//students select
package interfaces;

public interface Submissions {

	public void add(int ID, int selection);

	public void setContainer(Question question);

	public void outputStats();
}

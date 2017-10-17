import interfaces.*;
import java.util.*;

public class SimulationDriver {
	static Random rand = new Random();
	static Question question;
	static iVoter iVoter;
	static Submissions submits;
	static List<Student> studentList;

	public static void main(String[] args) {

		question = new regQuestion();
		iVoter = new regiVoter();

		// The type of question will be either single or multi-choice,
		// and the decision is random
		int questionType = rand.nextInt(2);
		if (questionType == 0) {
			CreateSingleAnswerQuestion(question);
			submits = new singleSubmits();
		} else {
			CreateMultiAnswerQuestion(question);
			submits = new multiSubmits();
		}

		// different submissions objects hold submissions differently 
		submits.setContainer(question);

		// the iVoter is given the question and submission container
		iVoter.setQuestion(question);
		iVoter.setSubmits(submits);

		studentList = GenerateStudents();
		SubmitAnswers(studentList, iVoter);

		iVoter.outputResults();
	}

	// a question in the form of text, and multiple candidate answer objects are
	// given to the Question object
	public static void CreateSingleAnswerQuestion(Question question) {
		question.setQuestion("What color is the Sun?");

		strAnswer answer = new strAnswer();
		answer.setAnswer("blue");
		question.setAnswer(answer);

		answer = new strAnswer();
		answer.setAnswer("yellow");
		question.setAnswer(answer);

		answer = new strAnswer();
		answer.setAnswer("red");
		question.setAnswer(answer);
	}

	// a question in the form of text, and multiple answers are given to the
	// Question object
	public static void CreateMultiAnswerQuestion(Question question) {
		question.setQuestion("Which of the following are Mammals?");

		strAnswer answer = new strAnswer();
		answer.setAnswer("lions");
		question.setAnswer(answer);

		answer = new strAnswer();
		answer.setAnswer("penguins");
		question.setAnswer(answer);

		answer = new strAnswer();
		answer.setAnswer("gorillas");
		question.setAnswer(answer);

		answer = new strAnswer();
		answer.setAnswer("lizards");
		question.setAnswer(answer);
	}

	// the list of students are generated with a count between 1 - 50
	public static List<Student> GenerateStudents() {
		List<Student> students = new ArrayList<Student>();

		int count = rand.nextInt(50) + 1;

		for (int i = 0; i < count; i++) {
			students.add(new regStudent());
		}

		return students;
	}

	// for each student within the list of students, the student will submit a
	// random number of answers to the iVoter
	public static void SubmitAnswers(List<Student> studentList, iVoter ivoter) {
		for (int i = 0; i < studentList.size(); i++) {

			int count = rand.nextInt(ivoter.getAnswerCount()) + 1;

			for (int j = 0; j < count; j++) {
				studentList.get(i).submitAnswer(ivoter);
			}

		}

	}

}

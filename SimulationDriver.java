import interfaces.*;
import java.util.*;

public class SimulationDriver {

	public static void CreateQuestion(Question question) {
		question.setQuestion("What color is the Sun?");
	}

	public static void CreateAnswers(Question question) {
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

	public static List<Student> GenerateStudents() {
		List<Student> students = new ArrayList<Student>();

		Random rand = new Random();
		int count = rand.nextInt(50) + 1;

		for (int i = 0; i < count; i++) {
			students.add(new regStudent());
		}

		return students;
	}

	public static void SubmitAnswers(List<Student> studentList, iVoter ivoter) {
		for (int i = 0; i < studentList.size(); i++) {
			Random rand = new Random();
			int count = rand.nextInt(ivoter.getAnswerCount()) + 1;
			for (int j = 0; j < count; j++) {
				studentList.get(i).submitAnswer(ivoter);
			}
		}

	}

	public static void main(String[] args) {

		Question question = new regQuestion();
		iVoter iVoter = new regiVoter();
		List<Student> studentList;
		Submissions submits = new singleSubmits();

		CreateQuestion(question);
		CreateAnswers(question);

		submits.setContainer(question);

		iVoter.setQuestion(question);
		iVoter.setSubmits(submits);

		studentList = GenerateStudents();
		SubmitAnswers(studentList, iVoter);
		iVoter.outputResults();
	}
}

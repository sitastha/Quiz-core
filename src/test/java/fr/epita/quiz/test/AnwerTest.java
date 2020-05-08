package fr.epita.quiz.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.DAO.AnswerDAO;
import fr.epita.quiz.DAO.ExamDAO;
import fr.epita.quiz.DAO.QuestionDAO;
import fr.epita.quiz.DAO.StudentDAO;
import fr.epita.quiz.datamodel.Answer;
import fr.epita.quiz.datamodel.Exam;
import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.datamodel.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationcontext.xml")
public class AnwerTest {
	@Inject
	QuestionDAO questiondao;
	
	@Inject
	AnswerDAO answerDAO;
	
	@Inject
	ExamDAO examDao;
	
	@Inject
	StudentDAO studentDAO;
	
	@Test
	public void testAnswerTest() {
		
		Question question = new Question();
		question.setQuestion_Title("WHy JAva Is hard?");
		questiondao.insert(question);
		
		Exam exam = new Exam();
		exam.setExam_title("JAVA");
		examDao.insert(exam);
		
		Student student  = new Student();
		student.setName("SITA");
		studentDAO.insert(student);
		
		Answer answer = new Answer();
		answer.setAns("Java is not Hard ");
		answer.setQuestion(question);
		answer.setExam(exam);
		answer.setStd(student);
		
		
		answerDAO.insert(answer);
		
		
		
		
		
	}
}

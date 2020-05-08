package fr.epita.quiz.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import fr.epita.quiz.DAO.ExamDAO;
import fr.epita.quiz.DAO.MCQAnswerDAO;
import fr.epita.quiz.DAO.MCQChoiceDAO;
import fr.epita.quiz.DAO.QuestionDAO;
import fr.epita.quiz.DAO.StudentDAO;

import fr.epita.quiz.datamodel.Exam;
import fr.epita.quiz.datamodel.MCQAnswer;
import fr.epita.quiz.datamodel.MCQChoice;
import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.datamodel.Student;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationcontext.xml")
public class MCQAnswerTest {
	@Inject
	MCQChoiceDAO mcqchoicedao;
	
	@Inject
	ExamDAO examDao;
	
	@Inject
	StudentDAO studentDAO;
	
	@Inject
	MCQAnswerDAO mcqanswerdao;
	
	@Inject
	QuestionDAO questiondao;
	
	@Test
	public void testMCQAnswerTest() {
		
		Exam exam = new Exam();
		exam.setExam_title("JAVA");
		examDao.insert(exam);
		
		Student student  = new Student();
		student.setName("SITA");
		studentDAO.insert(student);
		
		Question question = new Question();
		question.setQuestion_Title("What is java??");
		questiondao.insert(question);
		
		MCQChoice mcqchoice = new MCQChoice();
		mcqchoice.setChoice("1.java is hard. 2.java is not hard");
		mcqchoice.setValid(true);
		mcqchoice.setQuestion(question);		
		
		mcqchoicedao.insert(mcqchoice);
		
		MCQAnswer mcqanswer = new MCQAnswer();
		mcqanswer.setMcqanswers("java is hard");
		mcqanswer.setExams(exam);
		mcqanswer.setStd(student);
		mcqanswer.setMcqchoice(mcqchoice);
		mcqanswerdao.insert(mcqanswer);
		
		
		
		
	}

}

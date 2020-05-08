package fr.epita.quiz.test;

import javax.inject.Inject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import fr.epita.quiz.DAO.MCQChoiceDAO;
import fr.epita.quiz.DAO.QuestionDAO;
import fr.epita.quiz.datamodel.MCQChoice;
import fr.epita.quiz.datamodel.Question;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationcontext.xml")
public class MCQChoiceTest {
	@Inject
	QuestionDAO questiondao;
	
	@Inject
	MCQChoiceDAO mcqchoicedao;
	
	

	
	@Test
	public void testMCQChoiceTest() {
		
		Question question = new Question();
		question.setQuestion_Title("WHy JAva Is hard?");
		questiondao.insert(question);
		

		
		MCQChoice mcqchoice = new MCQChoice();
		mcqchoice.setChoice("Java is not Hard ");
		mcqchoice.setValid(true);
		mcqchoice.setQuestion(question);
		
		System.out.println(mcqchoicedao);
		
		mcqchoicedao.insert(mcqchoice);
		
		
		
		
	}

}

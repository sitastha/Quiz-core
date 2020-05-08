package fr.epita.quiz.test;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import fr.epita.quiz.DAO.QuestionDAO;
import fr.epita.quiz.datamodel.Question;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "/applicationcontext.xml")
public class QuestionTest {
	
	@Inject
	QuestionDAO questiondao;
	
	@Test
	public void testQuestionTest() {
		
		Question question = new Question();
		question.setQuestion_Title("WHy JAva Is hard?");
		questiondao.insert(question);
	}

}

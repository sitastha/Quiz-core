package fr.epita.quiz.DAO;

import java.util.List;
import java.util.Map;

import fr.epita.quiz.datamodel.Question;

public class QuestionDAO extends GenericDAO<Question,Long>{

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from Question where Questions = :pQuestions";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Question criteria) {
		parameters.put("pQuestions", criteria.getQuestion_Title());
		
	}

	@Override
	public Class<Question> getEntityClass() {
		// TODO Auto-generated method stub
		return Question.class;
	}
	
	public List<Question> getAllData() {
		String query = "from Question";
		List<Question> list = em.createQuery(query,getEntityClass()).getResultList();
		System.out.println(list);
		return list;
	}
}

package fr.epita.quiz.DAO;

import java.util.Map;

import fr.epita.quiz.datamodel.Answer;

public class AnswerDAO extends GenericDAO<Answer,Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from Answer where Answers = :pAnswers";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Answer criteria) {
		parameters.put("pAnswers", criteria.getAns());
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Answer> getEntityClass() {
		// TODO Auto-generated method stub
		return Answer.class ;
	}

	
	
}

package fr.epita.quiz.DAO;

import java.util.Map;

import fr.epita.quiz.datamodel.MCQAnswer;

public class MCQAnswerDAO extends GenericDAO<MCQAnswer,Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from MCQAnswer where MCQAnswers = :pMCQAnswers";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, MCQAnswer criteria) {
		parameters.put("pMCQAnswers", criteria.getMcqanswers());
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<MCQAnswer> getEntityClass() {
		// TODO Auto-generated method stub
		return MCQAnswer.class;
	}
	
}

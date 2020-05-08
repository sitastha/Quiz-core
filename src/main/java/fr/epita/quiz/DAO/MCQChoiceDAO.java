package fr.epita.quiz.DAO;

import java.util.Map;

import javax.persistence.Query;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import fr.epita.quiz.datamodel.Answer;
import fr.epita.quiz.datamodel.MCQChoice;

public class MCQChoiceDAO extends GenericDAO<MCQChoice,Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from MCQChoice_table where choice = :pchoices";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, MCQChoice criteria) {
		parameters.put("pchoices", criteria.getChoice());
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<MCQChoice> getEntityClass() {
		// TODO Auto-generated method stub
		return MCQChoice.class;
	}
	
	@Transactional(value = TxType.REQUIRED)
	public void deleteChild(long id) {
		String qusry = "delete from MCQChoice where question = "+id;
		Query searchQuery = em.createQuery(qusry);
		searchQuery.executeUpdate();
	}
	
}

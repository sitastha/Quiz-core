package fr.epita.quiz.DAO;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import fr.epita.quiz.datamodel.Question;
import fr.epita.quiz.datamodel.Student;

public class StudentDAO extends GenericDAO<Student,Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from Student where Std_Name = :pStd_Names";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Student criteria) {
		parameters.put("pStd_Names", criteria.getName());
		// TODO Auto-generated method stub
		
	}

	@Override
	public Class<Student> getEntityClass() {
		// TODO Auto-generated method stub
		return Student.class;
	}
	
}
package fr.epita.quiz.DAO;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import fr.epita.quiz.datamodel.Answer;
import fr.epita.quiz.datamodel.Exam;
import fr.epita.quiz.datamodel.Question;

public class ExamDAO extends GenericDAO<Exam,Long> {

	@Override
	public String getQuery() {
		// TODO Auto-generated method stub
		return "from Exam where Exam_Title = :pExam_Title";
	}

	@Override
	public void setParameters(Map<String, Object> parameters, Exam criteria) {
		// TODO Auto-generated method stub
		parameters.put("pExam_Title", criteria.getExam_title());
	}

	@Override
	public Class<Exam> getEntityClass() {
		// TODO Auto-generated method stub
		return Exam.class;
	}
	
}

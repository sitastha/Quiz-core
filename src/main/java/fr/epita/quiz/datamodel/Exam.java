package fr.epita.quiz.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Examination")
public class Exam {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="Exam_Title")
	private String exam_title;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getExam_title() {
		return exam_title;
	}

	public void setExam_title(String exam_title) {
		this.exam_title = exam_title;
	}

	public Exam() {
		
	}
	
	

}

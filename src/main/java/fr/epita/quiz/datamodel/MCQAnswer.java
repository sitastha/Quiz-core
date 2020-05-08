package fr.epita.quiz.datamodel;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="MCQAnswer")
public class MCQAnswer {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name="MCQAnswers")
	private String mcqanswers;
	
	@ManyToOne
	@JoinColumn(name="Student_FK")
	private Student Std;

	@ManyToOne
	@JoinColumn(name="Examination_FK")
	private Exam exams;
	
	@ManyToOne
	@JoinColumn(name="MCQChoice_FK")
	private MCQChoice mcqchoice;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Student getStd() {
		return Std;
	}

	public void setStd(Student std) {
		Std = std;
	}

	public Exam getExams() {
		return exams;
	}

	public void setExams(Exam exams) {
		this.exams = exams;
	}

	public MCQChoice getMcqchoice() {
		return mcqchoice;
	}

	public void setMcqchoice(MCQChoice mcqchoice) {
		this.mcqchoice = mcqchoice;
	}
	
	public String getMcqanswers() {
		return mcqanswers;
	}

	public void setMcqanswers(String mcqanswers) {
		this.mcqanswers = mcqanswers;
	}

	public MCQAnswer() {
	
	}
	


}

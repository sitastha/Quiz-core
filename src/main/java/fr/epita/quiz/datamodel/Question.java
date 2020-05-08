package fr.epita.quiz.datamodel;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Question")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
    
    @Column(name="Questions")
    private String Question_Title;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getQuestion_Title() {
		return Question_Title;
	}

	public void setQuestion_Title(String question_Title) {
		Question_Title = question_Title;
	}

	public Question() {
		
	
	}
    
}

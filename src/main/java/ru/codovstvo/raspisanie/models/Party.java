package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Party {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String title;

    
    public Party( String title) {
		this.title = title;
	}
    
    public Party() {
	}


    /**
     * @return Integer return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return String return the title
     */
    public String gettitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void settitle(String title) {
        this.title = title;
    }

}
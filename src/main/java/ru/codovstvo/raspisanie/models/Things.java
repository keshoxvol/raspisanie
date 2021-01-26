package ru.codovstvo.raspisanie.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Things {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    private String name;


    public Things(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
    
    public Things() {
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
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
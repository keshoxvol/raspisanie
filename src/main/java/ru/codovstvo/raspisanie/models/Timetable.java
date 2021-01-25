package ru.codovstvo.raspisanie.models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Timetable {
    @Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Integer id;
    
    private String thing;

    private String group;

    private Date date;
    
    private String audience;
    
    private String teacher;
    
    public Timetable(Integer id, String thing, String group, Date date, String audience, String teacher){
        this.id = id;
        this.thing = thing;
        this.group = group;
        this.date = date;
        this.audience = audience;
        this.teacher = teacher;
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
     * @return String return the thing
     */
    public String getThing() {
        return thing;
    }

    /**
     * @param thing the thing to set
     */
    public void setThing(String thing) {
        this.thing = thing;
    }

    /**
     * @return String return the group
     */
    public String getGroup() {
        return group;
    }

    /**
     * @param group the group to set
     */
    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * @return String return the audience
     */
    public String getAudience() {
        return audience;
    }

    /**
     * @param audience the audience to set
     */
    public void setAudience(String audience) {
        this.audience = audience;
    }

    /**
     * @return String return the teacher
     */
    public String getTeacher() {
        return teacher;
    }

    /**
     * @param teacher the teacher to set
     */
    public void setTeacher(String teacher) {
        this.teacher = teacher;
    }


    /**
     * @return Date return the date
     */
    public Date getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(Date date) {
        this.date = date;
    }

}
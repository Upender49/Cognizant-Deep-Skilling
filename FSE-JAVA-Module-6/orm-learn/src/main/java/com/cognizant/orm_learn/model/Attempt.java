package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name="attempt")
public class Attempt {
    @Id
    @Column(name="at_id")
    private int id;


    @Column(name="at_date")
    private Date date;
    @ManyToOne
    @JoinColumn(name = "at_us_id")
    private User user;

    @OneToMany(mappedBy = "attempt")
    private Set<AttemptQuestion> questions;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<AttemptQuestion> getQuestions() {
        return questions;
    }

    public void setQuestions(Set<AttemptQuestion> questions) {
        this.questions = questions;
    }
}

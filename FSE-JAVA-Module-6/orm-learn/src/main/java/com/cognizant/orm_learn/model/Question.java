package com.cognizant.orm_learn.model;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name="question")
public class Question {


    @Id
    @Column(name="qn_id")
    private int id;


    @Column(name="qn_text")
    private String text;


    @OneToMany(mappedBy="question")
    private Set<Option> options;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Set<Option> getOptions() {
        return options;
    }

    public void setOptions(Set<Option> options) {
        this.options = options;
    }
}
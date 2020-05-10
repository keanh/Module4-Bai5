package com.codegym.model;

import javax.persistence.*;

@Entity
@Table
public class Nasa {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    protected int point;
    private String author;
    private String feedback;

    public Nasa() {
    }

    public Nasa(int point, String author, String feedback) {
        this.point = point;
        this.author = author;
        this.feedback = feedback;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}

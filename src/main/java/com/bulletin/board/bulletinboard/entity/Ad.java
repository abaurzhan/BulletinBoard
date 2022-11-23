package com.bulletin.board.bulletinboard.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Ad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ad_id")
    private int id;

    @Column(name = "ad_name")
    private String name;
    private LocalDate publicationDate;
    private String title;
    private String text;
    private double price;

    @ManyToOne
    @JoinColumn(name = "FK_Ad_Rubric")
    private Rubric rubric;

    @ManyToOne
    @JoinColumn(name = "FK_Ad_Author")
    private Author author;

    public Ad(String name, LocalDate publicationDate, String title, String text, double price, Rubric rubric) {
        this.name = name;
        this.publicationDate = publicationDate;
        this.title = title;
        this.text = text;
        this.price = price;
        this.rubric = rubric;
    }

    public Ad() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getPublicationDate() {
        return publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate) {
        this.publicationDate = publicationDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Rubric getRubric() {
        return rubric;
    }

    public void setRubric(Rubric rubric) {
        this.rubric = rubric;
    }
}
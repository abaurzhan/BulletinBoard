package com.bulletin.board.bulletinboard.entity;

import javax.persistence.*;


@Entity
public class Rubric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rubric_id")
    private int id;

    private String name;

    public Rubric() {
    }

    public Rubric(String name) {
        this.name = name;
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
}

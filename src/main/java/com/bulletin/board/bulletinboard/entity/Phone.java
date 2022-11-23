package com.bulletin.board.bulletinboard.entity;

import javax.persistence.*;

@Entity
public class Phone {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "phone_id")
    private int id;

    private String number;

    public Phone() {
    }

    public Phone(String number) {
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String name) {
        this.number = name;
    }
}

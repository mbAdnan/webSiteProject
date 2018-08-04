package com.mysite.com.mysiteApp.entities;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Message  implements  Serializable{
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private String sujet;
    private String message;
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Message() {
    }

    public Message(String name, String email, String sujet, String message) {
        this.name = name;
        this.email = email;
        this.sujet = sujet;
        this.message = message;
        this.date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSujet() {
        return sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

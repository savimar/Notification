package ru.savimar.notification.entity;

import javax.persistence.*;

@Entity
@Table(name="letters")
public class Letter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name="to_")
    private String to;
    @Column(name="message_")
    private String message;

    public Letter() {
    }

    public Letter(int id, String to, String message) {
        this.id = id;
        this.to = to;
        this.message = message;
    }

    public Letter(String to, String message) {
        this.to = to;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}

package com.example.springbootjpa.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien{
    @Id
    String id;
    String name;

    public Alien() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Alien{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                '}';
    }
}
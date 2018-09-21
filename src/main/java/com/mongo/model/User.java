package com.mongo.model;


import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String   id;

    private String name;
    private String lastName;

    public User(){

    }

    public User(String name, String lastName){
        this.name = name;
        this.lastName = lastName;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return String.format(
                "Customer[id=%s, firstName='%s', lastName='%s']",
                id, name, lastName);
    }
}

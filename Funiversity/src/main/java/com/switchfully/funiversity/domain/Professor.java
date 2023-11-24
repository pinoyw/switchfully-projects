package com.switchfully.funiversity.domain;

import java.util.UUID;

public class Professor {
    private final String id;
    private String firstName;
    private String lastName;

    public Professor(String firstName, String lastName) {
        this.id = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // -- Getters ----------------------
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}

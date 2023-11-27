package com.switchfully.funiversity.api;

import java.util.UUID;

public class UpdateProfessor {
    private String firstName;
    private String lastName;

    public UpdateProfessor(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // -- Getters ----------------------
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}
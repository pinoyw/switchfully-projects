package com.switchfully.funiversity.api;

import java.util.UUID;

public class ProfessorDto {
    private final String id;
    private String firstName;
    private String lastName;

    public ProfessorDto(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // -- Getters ----------------------
    public String getId() { return id; }
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
}

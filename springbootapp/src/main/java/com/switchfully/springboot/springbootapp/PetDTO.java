package com.switchfully.springboot.springbootapp;


public class PetDTO {
    private int id;
    private String name;
    private PetKind kind;
    private String profileText;

    public PetDTO(int id, String name, PetKind kind, String profileText) {
        this.id = id;
        this.name = name;
        this.kind = kind;
        this.profileText = profileText;
    }
}

package com.switchfully.springboot.springbootapp;

import java.util.List;

public class PetService {
    public PetService(PetRepository petRepo, PetMapper petMap) {
        this.petRepo = petRepo;
        this.petMap = petMap;
    }

    private PetRepository petRepo; // = new PetRepository();
    private PetMapper petMap; // = new PetMapper();
    public List<PetDTO> getAllPets(  ) {
        return petMap.toDTO( petRepo.getAllPets() );
    }
}
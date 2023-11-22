package com.switchfully.springboot.springbootapp;

import com.switchfully.springboot.springbootapp.pet.PetDTO;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PetService {
    private PetRepository petRepo;
    private PetMapper petMap;

    public PetService(PetRepository petRepo, PetMapper petMap) {
        this.petRepo = petRepo;
        this.petMap = petMap;
    }


    public List<PetDTO> getAllPets(  ) {
        return petMap.toDTO( petRepo.getAllPets() );
    }
}
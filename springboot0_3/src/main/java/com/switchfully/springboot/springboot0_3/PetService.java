package com.switchfully.springboot.springboot0_3;

import java.util.List;

public class PetService {
    private PetRepository petRepo = new PetRepository();
    private PetMapper petMap = new PetMapper();
    public List<PetDTO> getAllPets(  ) {
        return petMap.toDTO( petRepo.getAllPets() );
    }
}

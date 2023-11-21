package com.switchfully.springboot.springboot0_3;

import java.util.List;
import java.util.stream.Collectors;

public class PetMapper {
    public PetDTO toDTO(Pet pet){
        //        PetDTO(int id, String name, PetKind kind, String profileText)
        return new PetDTO(pet.getId(), pet.getName(), pet.getKind(),  pet.getProfileText());

    }

    public List<PetDTO> toDTO(List<Pet> petList){
        return petList.stream().map(this::toDTO).collect(Collectors.toList());
    }
}

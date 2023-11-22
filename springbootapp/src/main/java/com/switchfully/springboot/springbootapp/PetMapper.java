package com.switchfully.springboot.springbootapp;

import com.switchfully.springboot.springbootapp.pet.Pet;
import com.switchfully.springboot.springbootapp.pet.PetDTO;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
@Component
public class PetMapper {
    public PetDTO toDTO(Pet pet){
        return new PetDTO(pet.getId(), pet.getName(), pet.getKind(),  pet.getProfileText());
    }
    public List<PetDTO> toDTO(List<Pet> petList){
        return petList.stream().map(this::toDTO).collect(Collectors.toList());
    }
}

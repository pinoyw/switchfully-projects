package com.switchfully.springboot.springbootapp;

import com.switchfully.springboot.springbootapp.pet.Pet;
import com.switchfully.springboot.springbootapp.pet.PetKind;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PetRepository {
    public List<Pet> getAllPets() {
        return List.of( new Pet(100,"Jos", PetKind.DOG,"Braaveen Hooond"),
                new Pet(200,"Francois", PetKind.CHICKEN, "Tok tok een ei"),
                new Pet( 300,"GoodYear",PetKind.CAT,"Platte Kat"));
    }
}

package com.switchfully.springboot.springbootapp;

import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class PetRepository {
    public List<Pet> getAllPets() {
        // Pet(int id, String name, PetKind kind, String profileText)
        return List.of( new Pet(100,"Jos",PetKind.DOG,"Braaveen Hooond"),
                new Pet(200,"Francois", PetKind.CHICKEN, "Tok tok een ei"),
                new Pet( 300,"GoodYear",PetKind.CAT,"Platte Kat"));
    }
}

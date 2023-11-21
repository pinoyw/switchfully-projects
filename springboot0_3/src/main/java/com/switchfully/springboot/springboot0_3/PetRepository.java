package com.switchfully.springboot.springboot0_3;

import java.util.List;

public class  PetRepository {
    public List<Pet> getAllPets() {
        // Pet(int id, String name, PetKind kind, String profileText)
       return List.of( new Pet(100,"Jos",PetKind.DOG,"Braaveen Hooond"),
            new Pet(200,"Francois", PetKind.CHICKEN, "Tok tok een ei"));
    }
}

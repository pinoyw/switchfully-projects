package com.switchfully.springboot.springbootapp;


import com.switchfully.springboot.springbootapp.pet.PetDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "pets")
public class PetController {
    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping(value = "hello")
    public String helloPets() {
        return "Hello Pets";
    }
    @GetMapping(value = "allpets",produces = "application/json")
    public List<PetDTO> getAllPets() {
        return petService.getAllPets();
    }
}



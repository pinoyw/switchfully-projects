package com.switchfully.springboot.springboot0_3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "pets")
public class PetController {

    @GetMapping(value = "hello")
    public String helloPets() {
        return "Hello Pets";
    }

    @GetMapping(value = "allpets",produces = "application/json")
    public List<PetDTO> getAllPets() {
        PetService petService = new PetService();
        return petService.getAllPets();
//        Will be fixed in codelab04
    }
}



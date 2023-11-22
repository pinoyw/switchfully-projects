package com.switchfully.springboot.springbootapp;


import com.switchfully.springboot.springbootapp.pet.PetDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "pets")
public class PetController {
    private PetService petService;
    Logger logger = LoggerFactory.getLogger(PetController.class);
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

    @RequestMapping("log")
    public String helloExample() {
        logger.trace("I'll update you on every heartbeat 💓");
        logger.debug("I'm taking a (sub)step 🚶");
        logger.info("Business as usual, I processed an action correctly");
        logger.warn("Warning ⚠ I do not trust this situation?!");
        logger.error("Help 🆘 Something is broken!");
        return "<h1>`System.out.println();` is forbidden!</h1><p>Logging for the win!</p>";
    }
}



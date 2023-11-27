package com.switchfully.funiversity.api;

import com.switchfully.funiversity.domain.Professor;
import com.switchfully.funiversity.domain.ProfessorRepository;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "professor")
public class ProfessorController {
    private ProfessorRepository profRepo;
    private ProfessorMapper profMap;

    public ProfessorController() {
        this.profRepo = new ProfessorRepository();
        this.profMap = new ProfessorMapper();
    }

    @PostMapping( consumes= "application/json", produces = "application/json")
    @ResponseStatus(HttpStatus.CREATED)
    public ProfessorDto createProfessor(@RequestBody UpdateProfessor updateProfessor){
        Professor professor = profRepo.update(profMap.mapToProfessor(updateProfessor));
        profRepo.update(professor);
        return profMap.mapToProfessorDto(professor);
    }



}

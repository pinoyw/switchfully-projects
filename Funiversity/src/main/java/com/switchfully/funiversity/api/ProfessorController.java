package com.switchfully.funiversity.api;

import com.switchfully.funiversity.domain.ProfessorRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "professor")
public class ProfessorController {
    private ProfessorRepository profRepo;
    private ProfessorMapper profMap;


}

package com.switchfully.funiversity.api;

import com.switchfully.funiversity.domain.Professor;
import org.springframework.stereotype.Component;

@Component
public class ProfessorMapper {

    public Professor mapToProfessor(UpdateProfessor updateProfessor) {
        return new Professor(updateProfessor.getFirstName(), updateProfessor.getLastName());
    }

    public ProfessorDto mapToProfessorDto(Professor professor) {
        return new ProfessorDto(professor.getId(), professor.getFirstName(), professor.getLastName());
    }
}

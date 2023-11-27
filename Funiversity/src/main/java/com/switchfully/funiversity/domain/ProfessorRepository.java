package com.switchfully.funiversity.domain;

import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;

@Repository
public class ProfessorRepository {
    private final HashMap<String, Professor> professorsById;

    public ProfessorRepository() {
        this.professorsById = new HashMap<>();
    }

    public Professor update(Professor professor) {
        professorsById.put(professor.getId(), professor);
        return professor;
    }
    public Collection<Professor> getAll() {

        return professorsById.values();
    }

}

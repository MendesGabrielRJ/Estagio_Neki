package br.neki.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neki.estagio.model.Skill;
import br.neki.estagio.repository.SkillRepository;

@Service
public class SkillService {
    @Autowired
    private SkillRepository skillRepository;
    
    public List<Skill > obeterTodos() {
        return skillRepository.findAll();
    }


    
}

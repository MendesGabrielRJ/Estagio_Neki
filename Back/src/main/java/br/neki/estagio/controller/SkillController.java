package br.neki.estagio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.neki.estagio.model.Skill;
import br.neki.estagio.service.SkillService;

@CrossOrigin("*")
@RestController
@RequestMapping("/skill")
public class SkillController {

    @Autowired
    public SkillService skillService;
    
    @GetMapping("/todos")
    public ResponseEntity<List<Skill>> obterTodos (){
        List<Skill> skills = skillService.obeterTodos();
        return ResponseEntity.ok(skills);
    }
}

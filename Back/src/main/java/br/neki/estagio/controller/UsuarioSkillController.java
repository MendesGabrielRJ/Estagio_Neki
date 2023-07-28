package br.neki.estagio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.neki.estagio.model.UsuarioSkill;
import br.neki.estagio.service.UsuarioSkillService;


@CrossOrigin("*")
@RestController
@RequestMapping("/usuarioSkill")
public class UsuarioSkillController {

    @Autowired
    public UsuarioSkillService usuarioSkillService;
    
    @GetMapping("/todos")
    public ResponseEntity<List<UsuarioSkill>> obterTodos (){
        List<UsuarioSkill> usuarioSkills = usuarioSkillService.obeterTodos();
        return ResponseEntity.ok(usuarioSkills);
    }
}
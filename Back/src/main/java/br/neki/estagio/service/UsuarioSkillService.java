package br.neki.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neki.estagio.model.UsuarioSkill;
import br.neki.estagio.repository.UsuarioSkillRepository;

@Service
public class UsuarioSkillService {
    @Autowired
    private UsuarioSkillRepository usuarioSkillRepository;
    
    public List<UsuarioSkill> obeterTodos() {
        return usuarioSkillRepository.findAll();
    }
    
}

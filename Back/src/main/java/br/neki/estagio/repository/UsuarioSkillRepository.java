package br.neki.estagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.neki.estagio.model.UsuarioSkill;

@Repository
public interface UsuarioSkillRepository extends JpaRepository<UsuarioSkill, Long>{
    
}
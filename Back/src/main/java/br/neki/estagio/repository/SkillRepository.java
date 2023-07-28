package br.neki.estagio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.neki.estagio.model.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Long>{

    
}

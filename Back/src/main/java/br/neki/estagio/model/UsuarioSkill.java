package br.neki.estagio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "usuarioSkill")
public class UsuarioSkill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuarioSkill")
    private Long idUsuarioSkill;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuarioId;

    @ManyToOne
    @JoinColumn(name = "skill_id")
    private Skill SkillId;

    public Long getIdUsuarioSkill() {
        return idUsuarioSkill;
    }

    public void setIdUsuarioSkill(Long idUsuarioSkill) {
        this.idUsuarioSkill = idUsuarioSkill;
    }

    public Usuario getUsuarioId() {
        return usuarioId;
    }

    public void setUsuarioId(Usuario usuarioId) {
        this.usuarioId = usuarioId;
    }

    public Skill getSkillId() {
        return SkillId;
    }

    public void setSkillId(Skill skillId) {
        SkillId = skillId;
    }



}
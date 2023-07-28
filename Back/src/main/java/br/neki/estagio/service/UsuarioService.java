package br.neki.estagio.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.neki.estagio.model.Usuario;
import br.neki.estagio.repository.UsuarioRepository;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;
    
    public List<Usuario> obeterTodos() {
        return usuarioRepository.findAll();
    }
    
}

package br.neki.estagio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.neki.estagio.model.Usuario;
import br.neki.estagio.service.UsuarioService;


@CrossOrigin("*")
@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    public UsuarioService usuarioService;
    
    @GetMapping("/todos")
    public ResponseEntity<List<Usuario>> obterTodos (){
        List<Usuario> usuarios = usuarioService.obeterTodos();
        return ResponseEntity.ok(usuarios);
    }
}
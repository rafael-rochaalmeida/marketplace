package br.com.marketplace.controller;

import br.com.marketplace.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuarios")
public class ControllerUser {

    @Autowired
    UsuarioRepository usuarioRepository;






}

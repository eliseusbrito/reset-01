package br.com.cwi.aula04.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RequestMapping("dadosusuarios")
@RestController

public class UsuarioVariosDadosRest {

    public List<Usuario> dadosUsuarios = new ArrayList<>;

    @GetMapping
    public Usuario cadastrousuario(@RequestBody Usuario cadastro) {


    }


}

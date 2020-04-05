package br.com.cwi.aula04.rest;

import org.springframework.web.bind.annotation.*;

@RequestMapping("usuario")
@RestController

public class UsuarioUnicoRest {

    private String nome;

    @GetMapping
    public String usuario(){
            return nome;
        }

    @GetMapping("/{foo}")
    public String usuario(@PathVariable("foo") String nomeDoUsuario){
            nome = nomeDoUsuario;
            return "Nome do Usuário: "+ nomeDoUsuario;
        }

    @PutMapping("/{novoNome}")
    public String atualiza(@PathVariable("novoNome") String novoNomeDoUsuario){
        nome = novoNomeDoUsuario;
        return "Nome do Usuário revisado: "+ novoNomeDoUsuario;
    }

    @DeleteMapping()
    public void apaga(){
        nome = null;
    }


}

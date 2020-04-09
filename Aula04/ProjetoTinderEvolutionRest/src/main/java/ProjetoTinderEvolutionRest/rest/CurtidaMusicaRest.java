package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.console.MeuScannerCustomizado;
import ProjetoTinderEvolutionRest.console.MusicaMenu;
import ProjetoTinderEvolutionRest.console.UsuarioMenu;
import ProjetoTinderEvolutionRest.dominio.CurtidaMusica;
import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.gerenciador.CurtidaMusicaGerenciador;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/likes/musica")

public class CurtidaMusicaRest {

    private static int contador = 1;

    private List<CurtidaMusica> avaliacaoMusicas = new ArrayList<>();
//    CurtidaMusica curtidaMusica = new CurtidaMusica(usuario, musica, avalMusica);

    private CurtidaMusicaGerenciador gerenciador = new CurtidaMusicaGerenciador();


    @PostMapping
    public CurtidaMusica cadastrar(@RequestBody CurtidaMusica curtidaMusica) {
        System.out.println("rodou post musica");
        return gerenciador.salvar(curtidaMusica);
    }

    @GetMapping
    public List<CurtidaMusica> listar(){
        System.out.println("rodou GetMapping");
        List<CurtidaMusica> avaliacaoMusicas = gerenciador.listar();
        for (CurtidaMusica curtidaMusica : avaliacaoMusicas) {
            System.out.println(curtidaMusica);       }
        return avaliacaoMusicas;    }

}

//POST /likes/musica/{id-musica}/avaliador/{id-avaliador} (like música)

//    @PostMapping("/musica/{id-musica}/avaliador/{id-avaliador}")
//    public Usuario curtirMusica(@PathVariable("id-musica") int id, @PathVariable("id-avaliador") int idAvaliador) {
//        return gerenciadorUsuario.curtirMusica(id, idAvaliador);

//    public CurtidaMusica curtirMusica() {
//        UsuarioMenu usuarioMenu = new UsuarioMenu();
//        usuarioMenu.listar();
//        int usuario = MeuScannerCustomizado.nextInt("Digite o Usuário que esta curtindo: \n  > ");
//
//        MusicaMenu musicaMenu = new MusicaMenu();
//        musicaMenu.listar();
//        int musica = MeuScannerCustomizado.nextInt("Digite a Música que quer Curtir \n  > ");
//
//        boolean avalMusica = true;
//        CurtidaMusica curtidaMusica = new CurtidaMusica(usuario, musica, avalMusica);
//        return gerenciador.salvar(curtidaMusica);
//    }

//    public List<Musica> getMusicasCurtidas() {
//        return musicasCurtidas;
//    }


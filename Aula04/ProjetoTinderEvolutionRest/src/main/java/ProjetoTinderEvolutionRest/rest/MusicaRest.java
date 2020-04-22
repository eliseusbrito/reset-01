package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Musica;
import ProjetoTinderEvolutionRest.gerenciador.MusicaGerenciador;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/musica")

public class MusicaRest {
    private static int contador = 1;

 //   private List<Musica> listaMusicas = new ArrayList<>();

    private MusicaGerenciador gerenciador = new MusicaGerenciador();

//GET: CODIGO ORIGINAL REST
//    @GetMapping
//    public List<Musica> listarTodosMusicas() {
//        System.out.println("listou todos as musicas");
//        return listaMusicas;
//    }
//  CODIGO ALTERADO PARA USAR REGRAS do Gerenciador
    @GetMapping
    public List<Musica> listar(){
        System.out.println("\nListagem de Música...");
        List<Musica> musicas = gerenciador.listar();
        for (Musica musica : musicas) {
            System.out.println(musica);       }
        return musicas;    }

////GET ID: CODIGO ORIGINAL REST
//    @GetMapping("{id}")
//    public Musica buscarPorId(@PathVariable("id") int id) {
//        for (Musica musica : listaMusicas) {
//            if (musica.getId() == id) {
//                System.out.println("buscou musica específico: [" + id + "]");
//                return musica;
//            }
//        }
//        System.out.println("Musica informado não existe: [" + id + "]");
//        return null;
//    }
//  CODIGO ALTERADO PARA USAR REGRAS do Gerenciador
    @GetMapping("{id}")
    public Musica buscarPorId(@PathVariable("id") int id) {
        Musica musica = gerenciador.pesquisar(id);
        if (musica.getId() == id) {
                System.out.println("buscou musica específico: [" + id + "]");
                return musica;
            }
        System.out.println("Musica informado não existe: [" + id + "]");
        return null;
    }

//POST: CODIGO ORIGINAL REST
//    @PostMapping
//    public Musica cadastrar(@RequestBody Musica musica) {
//        musica.setId(contador);
//        listaMusicas.add(musica);
//        System.out.println("Adicionou musica: "+ contador);
//        contador++;
////        return gerenciador.salvar(musica);
//        return musica;
//    }
//  CODIGO ALTERADO PARA USAR REGRAS do Gerenciador
    @PostMapping
    public Musica cadastrar(@RequestBody Musica musica) {
        System.out.println("RequestBody: "+musica);
        return gerenciador.salvar(musica);
    }

////PUT: CODIGO ORIGINAL REST
//    @PutMapping("{id}")
//    public Musica editar(@PathVariable("id") int id, @RequestBody Musica body) {
//        for (Musica musica : listaMusicas) {
//            if (musica.getId() == id) {
//                musica.setNome(body.getNome());
//                musica.setArtista(body.getArtista());
//                musica.setAutor(body.getAutor());
//                musica.setDataDeLancamento(body.getDataDeLancamento());
//                musica.setEstiloMusical(body.getEstiloMusical());
//                System.out.println("atualizado a musica informada: [" + id + "] - " + musica);
//                return musica;
//            }
//        }
//        System.out.println("Não havia musica para atualizar: [" + id + "]");
//        return null;
//    }
//  CODIGO ALTERADO PARA USAR REGRAS do Gerenciador
    @PutMapping("{id}")
    public Musica editar(@PathVariable("id") int id, @RequestBody Musica body) {
                return gerenciador.editar(id, body);
    }

////DELETE: CODIGO ORIGINAL REST
//    @DeleteMapping("{id}")
//    public void excluir(@PathVariable("id") int id) {
//        Musica musica = procurar(id);
//        if(musica==null){System.out.println("Não havia musica para deletar");}
//        else {
//        if (musica.getId() == id) {
//                listaMusicas.remove(musica);
//                System.out.println("deletou a musica informado: [" + id + "]");
//            }
//        }}
//    public Musica procurar(int id){
//        for (Musica musica : listaMusicas) {
//            if(musica.getId()==id) {
//                return musica;
//            }}
//        return null;
//    }

    //  CODIGO ALTERADO PARA USAR REGRAS do Gerenciador
    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        Musica musica = gerenciador.pesquisar(id);
        System.out.println(musica);
        if(musica==null){throw new RuntimeException("Não havia musica para deletar");
        }else{
            gerenciador.deletar(musica.getId());
            System.out.println("Deletou a musica informada: [" + id + "]");
        }
    }
}
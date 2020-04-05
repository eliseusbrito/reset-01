package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Esporte;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/esporte")
public class EsporteRest {
    private static int contador = 1;

    private List<Esporte> listaEsportes = new ArrayList<>();

    @GetMapping
    public List<Esporte> listarTodosEsportes() {
        System.out.println("listou todos os esportes");
        return listaEsportes;
    }

    @GetMapping("{id}")
    public Esporte buscarPorId(@PathVariable("id") int id) {
        for (Esporte esporte : listaEsportes) {
            if (esporte.getId() == id) {
                System.out.println("buscou esporte específico: [" + id + "]");
                return esporte;
            }
        }
        System.out.println("Esporte informado não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Esporte cadastrar(@RequestBody Esporte esporte) {
        esporte.setId(contador);
        listaEsportes.add(esporte);
        System.out.println("Adicionou esporte: "+ contador);
        contador++;
        return esporte;
    }

    @PutMapping("{id}")
    public Esporte editar(@PathVariable("id") int id, @RequestBody Esporte body) {
        for (Esporte esporte : listaEsportes) {
            if (esporte.getId() == id) {
                esporte.setNome(body.getNome());
                System.out.println("atualizado o esporte informada: [" + id + "] - " + esporte);
                return esporte;
            }
        }
        System.out.println("Não havia esporte para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Esporte esporte : listaEsportes) {
            if (esporte.getId() == id) {
                listaEsportes.remove(esporte.getId()-1);
                System.out.println("deletou o esporte informado: [" + id + "]");
            }
        }
        System.out.println("Não havia esporte para deletar");
    }

}

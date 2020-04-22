package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Curiosidade;
import org.springframework.web.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/curiosidade")

public class CuriosidadeRest {
    private static int contador = 1;

    private List<Curiosidade> listaCuriosidades = new ArrayList<>();

    @GetMapping
    public List<Curiosidade> listarTodasCuriosidades() {
        System.out.println("listou todos as curiosidades");
        return listaCuriosidades;
    }

    @GetMapping("{id}")
    public Curiosidade buscarPorId(@PathVariable("id") int id) {
        for (Curiosidade curiosidade : listaCuriosidades) {
            if (curiosidade.getId() == id) {
                System.out.println("buscou curiosidade específico: [" + id + "]");
                return curiosidade;
            }
        }
        System.out.println("Curiosidade informado não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Curiosidade cadastrar(@RequestBody Curiosidade curiosidade) {
        curiosidade.setId(contador);
        listaCuriosidades.add(curiosidade);
        System.out.println("Adicionou curiosidade: "+ contador);
        contador++;
        return curiosidade;
    }

    @PutMapping("{id}")
    public Curiosidade editar(@PathVariable("id") int id, @RequestBody Curiosidade body) {
        for (Curiosidade curiosidade : listaCuriosidades) {
            if (curiosidade.getId() == id) {
                curiosidade.setDescricao(body.getDescricao());
                curiosidade.setCategoriaCuriosidade(body.getCategoriaCuriosidade());
                System.out.println("atualizado a curiosidade informada: [" + id + "] - " + curiosidade);
                return curiosidade;
            }
        }
        System.out.println("Não havia curiosidade para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Curiosidade curiosidade : listaCuriosidades) {
            if (curiosidade.getId() == id) {
                listaCuriosidades.remove(curiosidade.getId()-1);
                System.out.println("deletou a curiosidade informado: [" + id + "]");
            }
        }
        System.out.println("Não havia curiosidade para deletar");
    }


}

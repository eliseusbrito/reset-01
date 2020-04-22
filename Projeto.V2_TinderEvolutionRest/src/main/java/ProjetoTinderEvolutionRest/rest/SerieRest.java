package ProjetoTinderEvolutionRest.rest;

import ProjetoTinderEvolutionRest.dominio.Serie;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/serie")
public class SerieRest {
    private static int contador = 1;

    private List<Serie> listaSeries = new ArrayList<>();

    @GetMapping
    public List<Serie> listarTodosSeries() {
        System.out.println("listou todos as series");
        System.out.println(listaSeries);
        return listaSeries;
    }

    @GetMapping("{id}")
    public Serie buscarPorId(@PathVariable("id") int id) {
        for (Serie serie : listaSeries) {
            if (serie.getId() == id) {
                System.out.println("buscou serie específica: [" + id + "]");
                return serie;
            }
        }
        System.out.println("Serie informada não existe: [" + id + "]");
        return null;
    }

    @PostMapping
    public Serie cadastrar(@RequestBody Serie serie) {
        serie.setId(contador);
        listaSeries.add(serie);
        System.out.println("Adicionou serie: "+ contador);
        contador++;
        return serie;
    }

    @PutMapping("{id}")
    public Serie editar(@PathVariable("id") int id, @RequestBody Serie body) {
        for (Serie serie : listaSeries) {
            if (serie.getId() == id) {
                serie.setNome(body.getNome());
                serie.setDiretor(body.getDiretor());
                serie.setDataDeLancamento(body.getDataDeLancamento());
                serie.setNumeroDeTemporadas(body.getNumeroDeTemporadas());
                serie.setNumeroDeEpisodios(body.getNumeroDeEpisodios());
                serie.setCategoriaSerie(body.getCategoriaSerie());
                serie.setSinopse(body.getSinopse());
                System.out.println("atualizado a serie informada: [" + id + "] - " + serie);
                return serie;
            }
        }
        System.out.println("Não havia serie para atualizar: [" + id + "]");
        return null;
    }

    @DeleteMapping("{id}")
    public void excluir(@PathVariable("id") int id) {
        for (Serie serie : listaSeries) {
            System.out.println(listaSeries);
            if (serie.getId() == id) {
                listaSeries.remove(serie.getId()-1);
                System.out.println("deletou a serie informada: [" + id + "]");
            }
        }
        System.out.println("Não havia serie para deletar");
    }

}

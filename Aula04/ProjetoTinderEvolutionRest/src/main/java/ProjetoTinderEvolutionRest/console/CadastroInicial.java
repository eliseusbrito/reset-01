package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.*;
import ProjetoTinderEvolutionRest.acervo.MatchAcervo;
import ProjetoTinderEvolutionRest.dominio.*;
import java.time.LocalDate;
import static ProjetoTinderEvolutionRest.dominio.CategoriaCuriosidade.COMPORTAMENTO;
import static ProjetoTinderEvolutionRest.dominio.CategoriaFilme.DRAMA;
import static ProjetoTinderEvolutionRest.dominio.EstiloMusical.ROCK;

public class CadastroInicial {

    public void todos(){
        musica();
        esporte();
        curiosidade();
        serie();
        filme();
        jogo();
        usuario();
        avaliacaoMusica();
        Usuarios();
    }

    public void musica(){
        MusicaAcervo acervo = new MusicaAcervo();
        Musica musica1 = new Musica("Balão Mágico","Turma","Simoni", LocalDate.of(2015, 10, 26), ROCK);
        acervo.salvar(musica1);
        Musica musica2 = new Musica("So Dance","Bee","Sulivan", LocalDate.of(2015, 10, 26), ROCK);
        acervo.salvar(musica2);
        Musica musica3 = new Musica("Dance","Eagles","Michael", LocalDate.of(2015, 10, 26), ROCK);
        acervo.salvar(musica3);
        Musica musica4 = new Musica("Samba","cancao","Simoni", LocalDate.of(2015, 10, 26), ROCK);
        acervo.salvar(musica4);

    }

    public void esporte(){
        EsporteAcervo acervo = new EsporteAcervo();
        Esporte esporte1 = new Esporte("Futebol");
        acervo.salvar(esporte1);
        Esporte esporte2 = new Esporte("Volêi");
        acervo.salvar(esporte2);}

    public void curiosidade(){
        CuriosidadeAcervo acervo = new CuriosidadeAcervo();
        Curiosidade curiosidade1 = new Curiosidade("Não como doce",COMPORTAMENTO);
        acervo.salvar(curiosidade1);
        Curiosidade curiosidade2 = new Curiosidade("Não Bebo",COMPORTAMENTO);}

    public void filme(){
        FilmeAcervo acervo = new FilmeAcervo();
        Filme filme1 = new Filme("Titanic", "a", LocalDate.of(2015, 10, 26), DRAMA, "a");
        acervo.salvar(filme1);
        Filme filme2 = new Filme("O vento levou", "joaozinho", LocalDate.of(2015, 10, 26), DRAMA, "a");
        acervo.salvar(filme2);}

    public void serie(){
        SerieAcervo acervo = new SerieAcervo();
        Serie serie1 = new Serie("La casa de Papel", "El Director", LocalDate.of(2000, 10, 26), 5,10,CategoriaSerie.COMEDIA, "a");
        acervo.salvar(serie1);
        Serie serie2 = new Serie("Orange", "Passino", LocalDate.of(2000, 10, 26), 5,10,CategoriaSerie.COMEDIA, "a");
        acervo.salvar(serie2);}

    public void usuario(){
        UsuarioAcervo acervo = new UsuarioAcervo();
        Usuario usuario1 = new Usuario("Eliseu", "eliseu@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.54,2.4568);
        acervo.salvar(usuario1);
        Usuario usuario2 = new Usuario("Lucas", "lucas@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55);
        acervo.salvar(usuario2);
        Usuario usuario3 = new Usuario("Davi", "davi@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55);
        acervo.salvar(usuario3);
        Usuario usuario4 = new Usuario("Regina", "regina@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55);
        acervo.salvar(usuario4);
    }

    public void jogo(){
        JogoAcervo acervo = new JogoAcervo();
        Jogo jogo1 = new Jogo("Fifa", "jogh", LocalDate.of(2015, 10, 26),CategoriaJogo.SUSPENSE,PlataformaJogo.XBOX);
        acervo.salvar(jogo1);
        Jogo jogo2 = new Jogo("Hero", "tune", LocalDate.of(2015, 10, 26),CategoriaJogo.SUSPENSE,PlataformaJogo.XBOX);
        acervo.salvar(jogo2);
    }
    public void avaliacaoMusica(){
        CurtidaMusicaAcervo acervo = new CurtidaMusicaAcervo();
        CurtidaMusica avaliacaoMusica1 = new CurtidaMusica(1, 1, true);
        acervo.salvar(avaliacaoMusica1);
        CurtidaMusica avaliacaoMusica2 = new CurtidaMusica(1, 2, true);
        acervo.salvar(avaliacaoMusica2);
        CurtidaMusica avaliacaoMusica3 = new CurtidaMusica(2, 3, true);
        acervo.salvar(avaliacaoMusica3);
        CurtidaMusica avaliacaoMusica4 = new CurtidaMusica(2, 4, true);
        acervo.salvar(avaliacaoMusica4);
        CurtidaMusica avaliacaoMusica5 = new CurtidaMusica(3, 1, true);
        acervo.salvar(avaliacaoMusica5);
        CurtidaMusica avaliacaoMusica6 = new CurtidaMusica(3, 2, true);
        acervo.salvar(avaliacaoMusica6);
        CurtidaMusica avaliacaoMusica7 = new CurtidaMusica(4, 3, true);
        acervo.salvar(avaliacaoMusica7);
        CurtidaMusica avaliacaoMusica8 = new CurtidaMusica(4, 4, true);
        acervo.salvar(avaliacaoMusica8);
    }
    public void Usuarios(){
        MatchAcervo acervo = new MatchAcervo();
        Match match1 = new Match(1,2,true);
        acervo.salvar(match1);
        Match match2 = new Match(1,3,true);
        acervo.salvar(match2);
        Match match3 = new Match(2,1,true);
        acervo.salvar(match3);
        Match match4 = new Match(2,4,true);
        acervo.salvar(match4);
        Match match5 = new Match(3,1,true);
        acervo.salvar(match5);
        Match match6 = new Match(3,4,true);
        acervo.salvar(match6);
        Match match7 = new Match(1,4,false);
        acervo.salvar(match7);
        Match match8 = new Match(2,3,true);
        acervo.salvar(match8);
    }


}
//Musica{Id=1, nome='fd', artista='d', autor='d', dataDeLancamento=1936-06-24, estiloMusical=FUNK}
//Usuario{id=1, nome='a', email='a', telefone=11, dataDeNascimento=1936-06-24, bio='d', localizacao='1.556, 45.226'}
//Filme{id=1, nome='a', diretor='a', dataDeLancamento=1972-01-26, categoriaFilme=DRAMA, sinopse='a'}
//Serie{id=1, nome='a', diretor='a', dataDeLancamento=2014-11-20, numeroDeTemporadas=5, numeroDeEpisodios=10, categoriaSerie=COMEDIA, sinopse='a'}
//Jogo{id=1, nome='a', publisher='a', dataDeLancamento=1976-02-18, categoriaJogo=SUSPENSE, plataformaJogo=XBOX}
//Esporte{id=1, nome='a'}
//Curiosidade{id=1, descricao='a', categoriaCuriosidade=COMPORTAMENTO}

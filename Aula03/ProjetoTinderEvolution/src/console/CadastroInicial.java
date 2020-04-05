package console;

import Acervo.*;
import dominio.*;

import java.time.LocalDate;

import static dominio.CategoriaCuriosidade.COMPORTAMENTO;
import static dominio.CategoriaFilme.DRAMA;
import static dominio.EstiloMusical.ROCK;

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
        Usuario usuario1 = new Usuario("Eliseu", "eliseu@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a","2,55 2,55");
        acervo.salvar(usuario1);
        Usuario usuario2 = new Usuario("Lucas", "lucas@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a","2,55 2,55");
        acervo.salvar(usuario2);
    }

    public void jogo(){
        JogoAcervo acervo = new JogoAcervo();
        Jogo jogo1 = new Jogo("Fifa", "jogh", LocalDate.of(2015, 10, 26),CategoriaJogo.SUSPENSE,PlataformaJogo.XBOX);
        acervo.salvar(jogo1);
        Jogo jogo2 = new Jogo("Hero", "tune", LocalDate.of(2015, 10, 26),CategoriaJogo.SUSPENSE,PlataformaJogo.XBOX);
        acervo.salvar(jogo2);
    }
    public void avaliacaoMusica(){
        AvaliacaoMusicaAcervo acervo = new AvaliacaoMusicaAcervo();
        AvaliacaoMusica avaliacaoMusica1 = new AvaliacaoMusica(1, 1, true);
        acervo.salvar(avaliacaoMusica1);
        AvaliacaoMusica avaliacaoMusica2 = new AvaliacaoMusica(1, 2, false);
        acervo.salvar(avaliacaoMusica2);
        AvaliacaoMusica avaliacaoMusica3 = new AvaliacaoMusica(1, 3, true);
        acervo.salvar(avaliacaoMusica3);
        AvaliacaoMusica avaliacaoMusica4 = new AvaliacaoMusica(1, 4, false);
        acervo.salvar(avaliacaoMusica4);
        AvaliacaoMusica avaliacaoMusica5 = new AvaliacaoMusica(2, 1, true);
        acervo.salvar(avaliacaoMusica5);
        AvaliacaoMusica avaliacaoMusica6 = new AvaliacaoMusica(2, 2, false);
        acervo.salvar(avaliacaoMusica6);
        AvaliacaoMusica avaliacaoMusica7 = new AvaliacaoMusica(2, 3, true);
        acervo.salvar(avaliacaoMusica7);
        AvaliacaoMusica avaliacaoMusica8 = new AvaliacaoMusica(2, 4, false);
        acervo.salvar(avaliacaoMusica8);
    }



}
//Musica{Id=1, nome='fd', artista='d', autor='d', dataDeLancamento=1936-06-24, estiloMusical=FUNK}
//Usuario{id=1, nome='a', email='a', telefone=11, dataDeNascimento=1936-06-24, bio='d', localizacao='1.556, 45.226'}
//Filme{id=1, nome='a', diretor='a', dataDeLancamento=1972-01-26, categoriaFilme=DRAMA, sinopse='a'}
//Serie{id=1, nome='a', diretor='a', dataDeLancamento=2014-11-20, numeroDeTemporadas=5, numeroDeEpisodios=10, categoriaSerie=COMEDIA, sinopse='a'}
//Jogo{id=1, nome='a', publisher='a', dataDeLancamento=1976-02-18, categoriaJogo=SUSPENSE, plataformaJogo=XBOX}
//Esporte{id=1, nome='a'}
//Curiosidade{id=1, descricao='a', categoriaCuriosidade=COMPORTAMENTO}

package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.acervo.*;
import ProjetoTinderEvolutionRest.dominio.*;
import java.time.LocalDate;

import static ProjetoTinderEvolutionRest.dominio.CategoriaCuriosidade.*;
import static ProjetoTinderEvolutionRest.dominio.CategoriaFilme.COMEDIA;
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
        curtirMusica();
        curtirFilme();
        curtirSerie();
        curtirJogo();
        curtirEsporte();
        curtirCuriosidade();
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

    public void filme(){
        FilmeAcervo acervo = new FilmeAcervo();
        Filme filme1 = new Filme("Titanic", "a", LocalDate.of(2015, 10, 26), DRAMA, "a");
        acervo.salvar(filme1);
        Filme filme2 = new Filme("O vento levou", "joaozinho", LocalDate.of(2015, 10, 26), DRAMA, "a");
        acervo.salvar(filme2);
        Filme filme3 = new Filme("Uma Linda Mulher", "Garry Marshall", LocalDate.of(1990, 07, 27), COMEDIA, "Magnata perdido (Richard Gere) pede ajuda uma prostituta (Julia Roberts) que \"trabalha\" no Hollywood Boulevard e acaba contratando-a por uma semana. Neste período ela se transforma em uma elegante jovem para poder acompanhá-lo em seus compromissos sociais, mas os dois começam a se envolver e a relação patrão/empregado se modifica para um relacionamento entre homem e mulher");
        acervo.salvar(filme3);
    }

    public void serie(){
        SerieAcervo acervo = new SerieAcervo();
        Serie serie1 = new Serie("La casa de Papel", "El Director", LocalDate.of(2000, 10, 26), 5,10,CategoriaSerie.COMEDIA, "a");
        acervo.salvar(serie1);
        Serie serie2 = new Serie("Orange", "Passino", LocalDate.of(2000, 10, 26), 5,10,CategoriaSerie.COMEDIA, "a");
        acervo.salvar(serie2);
        Serie serie3 = new Serie("Sex Education", "Laurie Nunn", LocalDate.of(2019, 10, 26), 2,16,CategoriaSerie.COMEDIA, "O inseguro Otis manja tudo quando o negócio é aconselhamento sexual, graças à sua mãe sexóloga. E aí a rebelde Maeve propõe criar uma clínica de terapia sexual na escola.");
        acervo.salvar(serie3);
    }

    public void jogo(){
        JogoAcervo acervo = new JogoAcervo();
        Jogo jogo1 = new Jogo("Fifa", "jogh", LocalDate.of(2015, 10, 26),CategoriaJogo.ACAO,PlataformaJogo.XBOX);
        acervo.salvar(jogo1);
        Jogo jogo2 = new Jogo("Hero", "tune", LocalDate.of(2015, 10, 26),CategoriaJogo.SUSPENSE,PlataformaJogo.XBOX);
        acervo.salvar(jogo2);
        Jogo jogo3 = new Jogo("Minecraft", "Mojang", LocalDate.of(2015, 10, 26),CategoriaJogo.ACAO,PlataformaJogo.XBOX);
        acervo.salvar(jogo3);
    }

    public void esporte(){
        EsporteAcervo acervo = new EsporteAcervo();
        Esporte esporte1 = new Esporte("Futebol");
        acervo.salvar(esporte1);
        Esporte esporte2 = new Esporte("Volêi");
        acervo.salvar(esporte2);
        Esporte esporte3 = new Esporte("Tênis");
        acervo.salvar(esporte3);
        Esporte esporte4 = new Esporte("Basquete");
        acervo.salvar(esporte4);
        Esporte esporte5 = new Esporte("Natação");
        acervo.salvar(esporte5);
    }

    public void curiosidade(){
        CuriosidadeAcervo acervo = new CuriosidadeAcervo();
        Curiosidade curiosidade1 = new Curiosidade("Não como doce",ALIMENTACAO);
        acervo.salvar(curiosidade1);
        Curiosidade curiosidade2 = new Curiosidade("Não Bebo",COMPORTAMENTO);
        acervo.salvar(curiosidade2);
        Curiosidade curiosidade3 = new Curiosidade("Boa",APARENCIA);
        acervo.salvar(curiosidade3);
    }


    public void usuario(){
        UsuarioAcervo acervo = new UsuarioAcervo();
        Usuario usuario1 = new Usuario("Eliseu", "eliseu@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.54,2.4568,"T53.jpg");
        acervo.salvar(usuario1);
        Usuario usuario2 = new Usuario("Lucas", "lucas@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55,"https://imagens.canaltech.com.br/236607.471195-Lua.jpg");
        acervo.salvar(usuario2);
        Usuario usuario3 = new Usuario("Davi", "davi@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55,"C:/Users/User/Pictures/Saved Pictures/T53.jpg");
        acervo.salvar(usuario3);
        Usuario usuario4 = new Usuario("Regina", "regina@gmail.com","35457585",  LocalDate.of(2015, 10, 26),"a",2.55, 2.55,"https://www.mensagenscomamor.com/mensagem/511955");
        acervo.salvar(usuario4);
    }

    public void curtirMusica(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirMusica(1,1);
        usuarioAcervo.curtirMusica(2,1);
        usuarioAcervo.curtirMusica(3,1);
        usuarioAcervo.curtirMusica(4,1);
        usuarioAcervo.curtirMusica(1,2);
        usuarioAcervo.curtirMusica(3,2);
        usuarioAcervo.curtirMusica(4,2);
        usuarioAcervo.curtirMusica(2,3);
        usuarioAcervo.curtirMusica(3,3);
        usuarioAcervo.curtirMusica(1,4);
    }

    public void curtirFilme(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirFilme(1,1);
        usuarioAcervo.curtirFilme(3,1);
        usuarioAcervo.curtirFilme(2,2);
        usuarioAcervo.curtirFilme(3,2);
        usuarioAcervo.curtirFilme(1,3);
        usuarioAcervo.curtirFilme(2,3);
    }

    public void curtirSerie(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirSerie(1,1);
        usuarioAcervo.curtirSerie(3,1);
        usuarioAcervo.curtirSerie(2,2);
        usuarioAcervo.curtirSerie(3,2);
        usuarioAcervo.curtirSerie(1,3);
        usuarioAcervo.curtirSerie(2,3);
    }

    public void curtirJogo(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirJogo(1,1);
        usuarioAcervo.curtirJogo(3,1);
        usuarioAcervo.curtirJogo(2,2);
        usuarioAcervo.curtirJogo(3,2);
        usuarioAcervo.curtirJogo(1,3);
        usuarioAcervo.curtirJogo(2,3);
    }

    public void curtirEsporte(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirEsporte(1,1);
        usuarioAcervo.curtirEsporte(3,1);
        usuarioAcervo.curtirEsporte(2,2);
        usuarioAcervo.curtirEsporte(3,2);
        usuarioAcervo.curtirEsporte(1,3);
        usuarioAcervo.curtirEsporte(2,3);
    }

    public void curtirCuriosidade(){
        UsuarioAcervo usuarioAcervo = new UsuarioAcervo();
        usuarioAcervo.curtirCuriosidade(1,1);
        usuarioAcervo.curtirCuriosidade(3,1);
        usuarioAcervo.curtirCuriosidade(2,2);
        usuarioAcervo.curtirCuriosidade(3,2);
        usuarioAcervo.curtirCuriosidade(1,3);
        usuarioAcervo.curtirCuriosidade(2,3);
    }

    public void usuarioLiked() {
        Usuario usuarioLikingUsuario0 = UsuarioAcervo.usuarios.get(0);
        Usuario usuarioLiked1 =  UsuarioAcervo.usuarios.get(1);
        usuarioLikingUsuario0.salvarUsuarioLiked(usuarioLiked1);
        Usuario usuarioLikingUsuario1 = UsuarioAcervo.usuarios.get(1);
        Usuario usuarioLiked0 =  UsuarioAcervo.usuarios.get(0);
        usuarioLikingUsuario1.salvarUsuarioLiked(usuarioLiked0);
        Usuario usuarioLikingUsuario2 = UsuarioAcervo.usuarios.get(2);
        Usuario usuarioLiked3 =  UsuarioAcervo.usuarios.get(3);
        usuarioLikingUsuario2.salvarUsuarioLiked(usuarioLiked3);
    }

}


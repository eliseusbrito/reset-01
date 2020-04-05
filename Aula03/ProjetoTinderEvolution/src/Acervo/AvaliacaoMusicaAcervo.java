package Acervo;

import dominio.AvaliacaoMusica;
import dominio.Esporte;
import dominio.Musica;

import java.util.ArrayList;
import java.util.List;

public class AvaliacaoMusicaAcervo {
    private static int contador = 1;
    private static final List<AvaliacaoMusica> avaliacaoMusicas = new ArrayList<>();

    public AvaliacaoMusica salvar(AvaliacaoMusica avaliacaoMusica) {
        avaliacaoMusica.setId(contador++);
        avaliacaoMusicas.add(avaliacaoMusica);
        System.out.println(avaliacaoMusica);
        return avaliacaoMusica;
    }

    public List<AvaliacaoMusica> listar() {
        return avaliacaoMusicas;
    }



    public void listaPorUsuario(int idMusica){
    for (int i = 0; i < avaliacaoMusicas.size(); i++) {

//        if(avaliacaoMusicas.get(i).getId=idMusica)
 //           System.out.println(avaliacaoMusicas.get(i).getNome);}
            System.out.println(avaliacaoMusicas.get(i));}
}}

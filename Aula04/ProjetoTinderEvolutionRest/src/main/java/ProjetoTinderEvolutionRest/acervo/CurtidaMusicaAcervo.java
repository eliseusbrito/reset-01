package ProjetoTinderEvolutionRest.acervo;

import ProjetoTinderEvolutionRest.dominio.CurtidaMusica;

import java.util.ArrayList;
import java.util.List;

public class CurtidaMusicaAcervo {
    private static int contador = 1;
    private static final List<CurtidaMusica> avaliacaoMusicas = new ArrayList<>();

    public CurtidaMusica salvar(CurtidaMusica avaliacaoMusica) {
        avaliacaoMusica.setId(contador++);
        avaliacaoMusicas.add(avaliacaoMusica);
        return avaliacaoMusica;
    }

    public List<CurtidaMusica> listar() {
        return avaliacaoMusicas;
    }



    public void listaPorUsuario(int idUsuario){
       for (int i = 0; i < avaliacaoMusicas.size(); i++) {
//          System.out.println("Rodada Lista de musica: i="+i);
//           System.out.println("idUsuario: "+idUsuario);
//           System.out.println(avaliacaoMusicas.get(i).getIdUsuario());
        if(avaliacaoMusicas.get(i).getIdUsuario()==idUsuario) {
              int novoidUsuario = avaliacaoMusicas.get(i).getIdMusica();
//              System.out.println("novoIdUsuario: "+novoidUsuario);
            for (int f = 0; f < MusicaAcervo.musicas.size(); f++) {
//                System.out.println("Rodada Musicas: f="+f);
                if (MusicaAcervo.musicas.get(f).getId() == novoidUsuario)
                    System.out.println("Título: "+MusicaAcervo.musicas.get(f).getNome()+", Id="+MusicaAcervo.musicas.get(f).getId());
             }
           }
       }
    }
}


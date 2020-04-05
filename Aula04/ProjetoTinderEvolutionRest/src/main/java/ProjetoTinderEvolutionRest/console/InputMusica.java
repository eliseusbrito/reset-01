package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.EstiloMusical;
import ProjetoTinderEvolutionRest.dominio.Musica;

import java.time.LocalDate;

public class InputMusica {
    public Musica entradaPrincipal() {
        String nome = MeuScannerCustomizado.nextLine("Digite o nome da Música> ");
        String artista = MeuScannerCustomizado.nextLine("Digite o Artista> ");
        String autor = MeuScannerCustomizado.nextLine("Digite o Autor> ");
        int dia = MeuScannerCustomizado.nextInt("Digite o dia de lançamento> ");
        int mes = MeuScannerCustomizado.nextInt("Digite o mês de lançamento> ");
        int ano = MeuScannerCustomizado.nextInt("Digite o ano de lançamento> ");
        char estilo = MeuScannerCustomizado.nextChar("Escolha o estilo musical> \n [ F ] FUNK \n [ P ] PAGODE \n [ R ] ROCK \n [ I ] INDIE \n [ S ] SERTANEJO \n [ M ] METAL \n >");
        EstiloMusical estiloMusical;
        switch (estilo) {
            case 'F':
                estiloMusical = EstiloMusical.FUNK;
                break;
            case 'P':
                estiloMusical = EstiloMusical.PAGODE;
                break;
            case 'R':
                estiloMusical = EstiloMusical.ROCK;
                break;
            case 'I':
                estiloMusical = EstiloMusical.INDIE;
                break;
            case 'S':
                estiloMusical = EstiloMusical.SERTANEJO;
                break;
            case 'M':
                estiloMusical = EstiloMusical.METAL;
                break;
            default:
                estiloMusical = EstiloMusical.NAOINFORMADO;
                break;
        }
        Musica musica = new Musica(nome,artista, autor,LocalDate.of(ano, mes, dia),estiloMusical);
        return musica;
    }


}

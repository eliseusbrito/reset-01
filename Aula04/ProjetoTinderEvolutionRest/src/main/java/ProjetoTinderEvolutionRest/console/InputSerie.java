package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.CategoriaSerie;
import ProjetoTinderEvolutionRest.dominio.Serie;

import java.time.LocalDate;

public class InputSerie {
    public Serie entradaDados(){
        String nome = MeuScannerCustomizado.nextLine("Digite o nome da Série> ");
        String diretor = MeuScannerCustomizado.nextLine("Digite o Diretor> ");
        int dia = MeuScannerCustomizado.nextInt("Digite o dia de lançamento> ");
        int mes = MeuScannerCustomizado.nextInt("Digite o mês de lançamento> ");
        int ano = MeuScannerCustomizado.nextInt("Digite o ano de lançamento> ");
        int temporadas = MeuScannerCustomizado.nextInt("Digite o número de Temporadas> ");
        int episodios = MeuScannerCustomizado.nextInt("Digite o número de Episódios> ");
        char estilo =MeuScannerCustomizado.nextChar("Escolha o estilo da série> \n [ D ] DRAMA\n [ C ] COMEDIA\n [ S ] SUSPENSE\n [ T ] TERROR\n [ A ] AÇÃO\n [ I ] SITCOM\n >");
        CategoriaSerie categoriaSerie;
        switch (estilo) {
            case 'D':
                categoriaSerie = CategoriaSerie.DRAMA;
                break;
            case 'C':
                categoriaSerie = CategoriaSerie.COMEDIA;
                break;
            case 'S':
                categoriaSerie = CategoriaSerie.SUSPENSE;
                break;
            case 'T':
                categoriaSerie = CategoriaSerie.TERROR;
                break;
            case 'A':
                categoriaSerie = CategoriaSerie.ACAO;
                break;
            case 'M':
                categoriaSerie = CategoriaSerie.SITCOM;
                break;
            default:
                categoriaSerie = CategoriaSerie.NAOINFORMADO;
                break;
        }
        String sinopse = MeuScannerCustomizado.nextLine("Digite a sinopse do Filme> ");

        Serie serie = new Serie(nome,diretor, LocalDate.of(ano, mes, dia),temporadas, episodios,categoriaSerie,sinopse);
        return serie;

    }
}

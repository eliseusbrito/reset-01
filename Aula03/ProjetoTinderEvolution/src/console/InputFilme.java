package console;

import dominio.CategoriaFilme;
import dominio.Filme;
import java.time.LocalDate;

public class InputFilme {
    public Filme entradaDados(){
        String nome = MeuScannerCustomizado.nextLine("Digite o nome do Filme> ");
        String artista = MeuScannerCustomizado.nextLine("Digite o Diretor do Filme> ");
        int dia = MeuScannerCustomizado.nextInt("Digite o dia de lançamento> ");
        int mes = MeuScannerCustomizado.nextInt("Digite o mês de lançamento> ");
        int ano = MeuScannerCustomizado.nextInt("Digite o ano de lançamento> ");
        char categoria = MeuScannerCustomizado.nextChar("Escolha a categoria do filme> \n [ D ] DRAMA \n [ C ] COMEDIA \n [ S ] SUSPENSE \n [ T ] TERROR \n [ A ] AÇÃO \n [ M ] MUSICAL \n >");
        CategoriaFilme categoriaFilme;
        switch (categoria) {
            case 'D':
                categoriaFilme = CategoriaFilme.DRAMA;
                break;
            case 'C':
                categoriaFilme = CategoriaFilme.COMEDIA;
                break;
            case 'S':
                categoriaFilme = CategoriaFilme.SUSPENSE;
                break;
            case 'T':
                categoriaFilme = CategoriaFilme.TERROR;
                break;
            case 'A':
                categoriaFilme = CategoriaFilme.ACAO;
                break;
            case 'M':
                categoriaFilme = CategoriaFilme.MUSICAL;
                break;
            default:
                categoriaFilme = CategoriaFilme.NAOINFORMADO;
                break;
        }
        String sinopse = MeuScannerCustomizado.nextLine("Digite a sinopse do Filme> ");

        Filme filme = new Filme(nome, artista, LocalDate.of(ano, mes, dia), categoriaFilme, sinopse);
        return filme;
    }
}

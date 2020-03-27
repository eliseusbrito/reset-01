package console;

import dominio.CategoriaJogo;
import dominio.Jogo;
import dominio.PlataformaJogo;
import java.time.LocalDate;

public class InputJogo {
    public Jogo entradaDados(){
        String nome = MeuScannerCustomizado.nextLine("Digite o nome da Jogo> ");
        char decisao = MeuScannerCustomizado.nextChar("Você deseja informar o Publisher\n [S] Sim     [N] Não  >");
        String publischer=null;
        if (decisao == 'S') {
            publischer = MeuScannerCustomizado.nextLine("Digite o Publisher> ");}
        int dia = MeuScannerCustomizado.nextInt("Digite o dia de lançamento> ");
        int mes = MeuScannerCustomizado.nextInt("Digite o mês de lançamento> ");
        int ano = MeuScannerCustomizado.nextInt("Digite o ano de lançamento> ");
        char categoria = MeuScannerCustomizado.nextChar("Escolha a categoria do jogo>\n [ D ] DRAMA\n [ C ] COMEDIA\n [ S] SUSPENSE\n [ T ] TERROR\n [ A ] AÇÃO\n [ M ] MUSICAL\n >");
        CategoriaJogo categoriaJogo;
        switch (categoria) {
            case 'D':
                categoriaJogo = CategoriaJogo.DRAMA;
                break;
            case 'C':
                categoriaJogo = CategoriaJogo.COMEDIA;
                break;
            case 'S':
                categoriaJogo = CategoriaJogo.SUSPENSE;
                break;
            case 'T':
                categoriaJogo = CategoriaJogo.TERROR;
                break;
            case 'A':
                categoriaJogo = CategoriaJogo.ACAO;
                break;
            case 'M':
                categoriaJogo = CategoriaJogo.MUSICAL;
                break;
            default:
                categoriaJogo = CategoriaJogo.NAOINFORMADO;
                break;
        }
    char plataforma = MeuScannerCustomizado.nextChar("Escolha a plataforma do jogo>\n [ X ] XBOX\n [ P ] PS4\n [ C ] PC\n [ S ] SNES\n >");
    PlataformaJogo plataformaJogo;
    switch (plataforma) {
        case 'X':
            plataformaJogo = PlataformaJogo.XBOX;
            break;
        case 'P':
            plataformaJogo = PlataformaJogo.PS4;
            break;
        case 'C':
            plataformaJogo = PlataformaJogo.PC;
            break;
        case 'S':
            plataformaJogo = PlataformaJogo.SNES;
            break;
        default:
            plataformaJogo = PlataformaJogo.NAOINFORMADA;
            break;
    }
    System.out.println(" ");

    Jogo jogo = new Jogo(nome, publischer, LocalDate.of(ano, mes, dia), categoriaJogo, plataformaJogo);
    return jogo;

    }
}

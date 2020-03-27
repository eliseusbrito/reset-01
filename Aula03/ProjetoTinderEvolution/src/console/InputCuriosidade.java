package console;

import dominio.CategoriaCuriosidade;
import dominio.Curiosidade;

public class InputCuriosidade {

    public Curiosidade entradaDados() {
        String descricao = MeuScannerCustomizado.nextLine("Descreva a Curiosidade: ");
        char estilo = MeuScannerCustomizado.nextChar("Defina qual a Catetoria da Curiosidade> \n [ C ] COMPORTAMENTO \n [ E ] EVENTO \n [ A ] APARÊNCIA \n [ L ] ALIMENTAÇÃO \n > ");
        CategoriaCuriosidade categoriaCuriosidade;
        switch (estilo) {
            case 'C':
                categoriaCuriosidade = CategoriaCuriosidade.COMPORTAMENTO;
                break;
            case 'E':
                categoriaCuriosidade = CategoriaCuriosidade.EVENTO;
                break;
            case 'A':
                categoriaCuriosidade = CategoriaCuriosidade.APARENCIA;
                break;
            case 'L':
                categoriaCuriosidade = CategoriaCuriosidade.ALIMENTACAO;
                break;
            default:
                categoriaCuriosidade = CategoriaCuriosidade.NAOINFORMADA;
                break;
        }

        Curiosidade curiosidade = new Curiosidade(descricao, categoriaCuriosidade);
        return curiosidade;
    }
}

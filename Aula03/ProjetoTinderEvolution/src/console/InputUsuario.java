package console;

import dominio.Usuario;
import java.time.LocalDate;

public class InputUsuario {
    public Usuario entradaUsuario(){
        String nome = MeuScannerCustomizado.nextLine("Digite o nome do Usuário> ");
        String email = MeuScannerCustomizado.nextLine("Digite seu email> ");
        String telefone = MeuScannerCustomizado.nextLine("Digite o telefone> ");
        int dia = MeuScannerCustomizado.nextInt("Digite o dia de Nascimento> ");
        int mes = MeuScannerCustomizado.nextInt("Digite o mês de Nascimento> ");
        int ano = MeuScannerCustomizado.nextInt("Digite o ano de Nascimento> ");
        String bio = MeuScannerCustomizado.nextLine("Digite sua Bio> ");
        double latitude = MeuScannerCustomizado.nextDouble("Digite sua latitude: ");
        double longitude = MeuScannerCustomizado.nextDouble("Digite sua longitude: ");
        String local = latitude+", "+longitude;

        Usuario usuario = new Usuario(nome,email,telefone, LocalDate.of(ano, mes, dia),bio,local);
        return usuario;
    }
}

//Graus, minutos e segundos (DMS, na sigla em inglês): 41°24'12.2"N 2°10'26.5"L
//Graus e minutos decimais (DMM, na sigla em inglês): 41 24.2028, 2 10.4418
//Graus decimais (DD, na sigla em inglês): 41.40338, 2.17403 --> Digita no teclado PT com virgula
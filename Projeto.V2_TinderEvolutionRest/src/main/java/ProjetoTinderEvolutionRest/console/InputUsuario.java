package ProjetoTinderEvolutionRest.console;

import ProjetoTinderEvolutionRest.dominio.Usuario;

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
        String foto = MeuScannerCustomizado.nextLine("Digite a url de sua foto: ");

        Usuario usuario = new Usuario(nome,email,telefone, LocalDate.of(ano, mes, dia),bio,latitude,longitude,foto);
        return usuario;
    }
}


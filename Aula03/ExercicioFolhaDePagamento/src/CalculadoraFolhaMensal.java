import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculadoraFolhaMensal {

    public static void main(String[] args) {
        System.out.println("----------- Aplicação calculo folha mensal       -----------\n\n");
        int opcao = 0;
        List<Funcionario> funcionarioList = new ArrayList<>();
        while (opcao != 9) {
            imprimeMenu();
            opcao = lerInteiro();
            if (opcao == 1) {
                // Cadastra Engenheiro
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do Engenheiro");
                String nome = sc.next();
                System.out.println("Digite o CPF do Engenheiro");
                String cpf = sc.next();
                System.out.println("Digite o Salário do Engenheiro");
                Double salario = sc.nextDouble();
                Engenheiro eng = new Engenheiro(nome,cpf,salario);
                funcionarioList.add(eng);
                System.out.println("Criado cadastro do engenheiro : "+eng.getNome());
            } else if (opcao == 2) {
                // Cadastra Programador
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do Programador");
                String nome = sc.next();
                System.out.println("Digite o CPF do Programador");
                String cpf = sc.next();
                System.out.println("Digite o Salário do Programador");
                Double salario = sc.nextDouble();
                System.out.println("Digite o número de certificações do Programador");
                int cert = sc.nextInt();
                Programador prog = new Programador(nome,cpf,salario,cert);
                funcionarioList.add(prog);
                System.out.println("Criado cadastro do programador : "+prog.getNome());
            } else if (opcao == 3) {
                // Cadastra Gerente
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite o nome do Gerente");
                String nome = sc.next();
                System.out.println("Digite o CPF do Gerente");
                String cpf = sc.next();
                System.out.println("Digite o Salário do Gerente");
                Double salario = sc.nextDouble();
                Gerente gerente = new Gerente(nome,cpf,salario,12000);
                funcionarioList.add(gerente);
                System.out.println("Criado cadastro do gerente : "+gerente.getNome());
            } else {
                break;
                //System.out.println("----------- Opção invalida               -----------");
            }
        }
        // Calculo da folha mensal
        System.out.println("iFolha");
        for (Funcionario f: funcionarioList) {
            //double totalDespesas = f.getRemuneracaoMensal();
            System.out.println(f.getRemuneracaoMensal());
        }


    }

    private static int lerInteiro() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void imprimeMenu() {
        System.out.println("----------- 1 - Cadastro Engenheiro             -----------");
        System.out.println("----------- 2 - Cadastro Programador             -----------");
        System.out.println("----------- 3 - Cadastro Gerente                 -----------");
        System.out.println("----------- 9 - Calcular e imprimir folha mensal -----------");
    }
}


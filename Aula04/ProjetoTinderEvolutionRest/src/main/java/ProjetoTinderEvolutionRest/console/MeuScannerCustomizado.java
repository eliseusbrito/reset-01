package ProjetoTinderEvolutionRest.console;

import java.util.Scanner;

public  class MeuScannerCustomizado {

    static Scanner scanner = new Scanner(System.in);

    public static int nextInt(String s){
        System.out.print(s);
        int valor = scanner.nextInt();
        scanner.nextLine();
        return valor;
    }

    public static String nextLine(String s){
        System.out.print(s);
       // scanner.nextLine();
        String valor = scanner.nextLine();
        return valor;
    }

    public static char nextChar(String s){
        System.out.print(s);
        char valor = scanner.next().charAt(0);
        scanner.nextLine();
        return valor;
    }

    public static double nextDouble(String s){
        System.out.print(s);
        double valor = scanner.nextDouble();
        scanner.nextLine();
        return valor;
    }




}


//Scanner scanner = new Scanner(System.in)
//System.out.print("Valor: ");
//int valor = scanner.nextInt();

//inv valor = MeuScannerCustomizado.nextInt("Valor: ");
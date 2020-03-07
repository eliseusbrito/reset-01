public class App {
    public static void main(String[] args) {
        Calculadora calculadoraDeIdades = new Calculadora();
        int somaDasIdades = calculadoraDeIdades.somar(50, 25);
        System.out.println(somaDasIdades);

        int diferenca = calculadoraDeIdades.subtrair(50,25);
        System.out.println(diferenca);

        int multiplica = calculadoraDeIdades.multiplicar(50,25);
        System.out.println(multiplica);

        double divide = calculadoraDeIdades.dividir(50,25);
        System.out.println(divide);

        Comparador comp = new Comparador();
        System.out.println(comp.menorQue(10,50));
        System.out.println(comp.menorQue(50,10));

    }
}
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        //Requisito 01: Pedir a temperatura em Fahrenheit
        System.out.print("Entre com a temperatura em Fahrenheit: ");
        double Fahrenheit = sc.nextDouble();

        sc.close();

        //Requisito 02: Transformar de Fahrenheit para Celsius e imprimir
        double Celsius = 5 * ((Fahrenheit-32) / 9);
        System.out.print(Fahrenheit + " graus fahrenheit, equivalem a " + Celsius + " graus Celsius." );

    }
}

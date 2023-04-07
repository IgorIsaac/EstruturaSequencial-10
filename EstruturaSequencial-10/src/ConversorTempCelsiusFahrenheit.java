import java.util.Scanner;

public class ConversorTempCelsiusFahrenheit {
    public static void main(String[] args) {
        // Criação de um objeto Scanner para leitura de entrada do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicitar ao usuário que insira a temperatura em graus Celsius
        System.out.print("Digite a temperatura em graus Celsius: ");
        double temperaturaCelsius = scanner.nextDouble(); // Lê a temperatura em graus Celsius digitada pelo usuário

        // Calcular a temperatura em graus Fahrenheit
        double temperaturaFahrenheit = (temperaturaCelsius * 9/5) + 32; // Fórmula de conversão de Celsius para Fahrenheit: F = (C * 9/5) + 32

        // Exibir a temperatura em graus Fahrenheit
        System.out.println("A temperatura em graus Fahrenheit é: " + temperaturaFahrenheit);

        // Fechar o objeto Scanner
        scanner.close();
    }
}

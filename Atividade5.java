import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double valor1;
        double valor2;
        
        System.out.println("Informe o primeiro valor:");
        valor1 = scanner.nextDouble();
        
        System.out.println("Informe o segundo valor:");
        valor2 = scanner.nextDouble();
        
        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;
        
        System.out.println("A soma dos valores e: " + soma);
        System.out.println("A subtracao dos valores e: " + subtracao);
        System.out.println("A multiplicacao dos valores e: " + multiplicacao);
        System.out.println("A divisao dos valores e: " + divisao);
        
        scanner.close();
    }
}

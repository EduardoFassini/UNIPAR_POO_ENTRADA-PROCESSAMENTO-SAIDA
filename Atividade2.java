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
        
        double resultado = valor1 - valor2;
        
        System.out.println("O resultado e: " + resultado);
        
        scanner.close();
    }
}

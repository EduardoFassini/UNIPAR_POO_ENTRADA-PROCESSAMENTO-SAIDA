import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double nota1;
        double nota2;
        double nota3;
        double nota4;
        
        System.out.println("Informe a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        nota2 = scanner.nextDouble();
        
        System.out.println("Informe a terceira nota:");
        nota3 = scanner.nextDouble();
        
        System.out.println("Informe a quarta nota:");
        nota4 = scanner.nextDouble();
        
        double media = (nota1 + nota2 + nota3 + nota4) / 4;
        
        System.out.println("A media e: " + media);
        
        scanner.close();
    }
}

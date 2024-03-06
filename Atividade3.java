import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        double nota1;
        double nota2;
        
        System.out.println("Informe a primeira nota:");
        nota1 = scanner.nextDouble();
        
        System.out.println("Informe a segunda nota:");
        nota2 = scanner.nextDouble();
        
        double media = (nota1 + nota2) / 2;
        
        System.out.println("A media e: " + media);
        
        if(media>=6){
            System.out.println("Aprovado.");
        }else{
            System.out.println("Reprovado.");
        }
        
        scanner.close();
    }
}

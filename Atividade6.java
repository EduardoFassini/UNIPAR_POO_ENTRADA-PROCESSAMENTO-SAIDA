import java.util.Scanner;

class HelloWorld {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Informe o nome do produto:");
        String nomeProduto = scanner.nextLine();
        
        System.out.println("Informe o preco do produto:");
        double preco = scanner.nextDouble();
        
        System.out.println("Informe o percentual de desconto do produto:");
        double desconto = scanner.nextDouble();
         
        double valorFinal = preco * (100-desconto) / 100;  
        
        System.out.println();
        System.out.println("O nome do produto e: " + nomeProduto);
        System.out.println("O novo preco do produto e: R$" + valorFinal);
         
        scanner.close();
    }
}

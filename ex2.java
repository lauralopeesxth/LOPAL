import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        
        // Solicita ao usuário que informe os números para a conta da programação
        System.out.println("Informe dez números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i]; // Adiciona o número à soma total no final da programação
        }
        
        // Exibe a soma de todos os valores
        System.out.println("A soma de todos os valores é " + soma);

    }
}
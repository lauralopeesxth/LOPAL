import java.util.Scanner;

public class ex1 {
 public static void main(String[] args) {
    Scanner leia = new Scanner(System.in);
   
int idade = 17;

 System.out.println("Qual sua idade: ");
  idade = leia.nextInt();

 if ( idade >= 18) { 
    System.out.println("voce ja pode votar!");
    }
    
    else {
    System.out.println("voce ainda nao pode votar.");
        
    }
    }
}
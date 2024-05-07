import java.util.Scanner; 

public class Main {
  public static void main(String[] args) {
	Scanner leia = new Scanner(System.in); 
    
  	float nota1 = 0;
	float nota2 = 0;
	float nota3 = 0;
	 System.out.print("qual a nota da primeira prova?");
	 nota1 = leia.nextFloat();
	 System.out.print("qual a nota da segunda prova?");
	 nota2 = leia.nextFloat();
	 System.out.print("qual a nota da terceira prova?");
	 nota3 = leia.nextFloat();
	 float somaprovas = nota1 + nota2 + nota3;
	 float media = somaprovas / 3;
	 if( media >=7 && media <=10){
	     System.out.println("aprovado");
	 }
	 else{
	     System.out.println("reprovado");
	 }
  }
}
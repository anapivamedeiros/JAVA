/*
Calcule a soma de dois numeros

*/
import java.util.Scanner;
public class Soma
{
	public static void main(String[] args) {
	    //Declarar variavel;
	    double a, b, soma;
	    Scanner ler = new Scanner(System.in);
	    System.out.println("Digite o primeiro numero: ");
	    a = ler.nextDouble();
	    System.out.println("Digite o segundo numero: ");
	    b = ler.nextDouble();
	    
	    //Processamento
	    soma = a + b;
	    
	    //Saida
	    System.out.println("O resultado sera: " + soma );
	    
	
	}
}
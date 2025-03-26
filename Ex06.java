/*
Ex06- Programar um número inteiro qualquer e mostrar se ele é par ou impar.

*/
import java.util.Scanner;
public class Ex06
{
	public static void main(String[] args) {
 // Criar um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        double numero1 = scanner.nextDouble();
        
    //Verificar se o numero e impar ou par  
    if (numero1 % 2 == 0) {
    System.out.println("O numero e par");
    
    } else {
        System.out.println("O numero e impar");
    }
    //Saida
    scanner.close();
    }
    
	}
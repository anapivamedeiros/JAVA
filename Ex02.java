/******************************************************************************
Ex02- Algoritmo que receba a idade
do usuário e verifique se ele tem 18 anos ou mais

*******************************************************************************/
import java.util.Scanner;
public class Ex02
{
	public static void main(String[] args) {
 // Criar um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

// Solicitar a idade
        System.out.print("Digite a idade: ");
        int idade = scanner.nextInt();
 //Verificar maior de idade ou nao
    if (idade >= 18) {
    System.out.println("Maior de idade");
    
    } else {
        System.out.println("Menor de idade");
    }
    //Saida
    scanner.close();
    }
    
	}
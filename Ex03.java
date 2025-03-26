/*
Ex03- receba três números inteiros e mostre o maior deles

*/
import java.util.Scanner;
public class Ex03
{
	public static void main(String[] args) {
	// Criar um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

// Solicitar tres numeros
        System.out.print("Digite o primeiro numero: ");
        double numero1 = scanner.nextDouble();
        
        System.out.print("Digite o segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        System.out.print("Digite o terceiro numero: ");
        double numero3 = scanner.nextDouble();
        
//Verificar numero maior
if (numero1 >= numero2 && numero1 >= numero3) {
System.out.println("O primeiro numero e maior");

} else if (numero2 >= numero1 && numero2 >= numero3) {
System.out.println("O segundo numero e maior");

} else {
System.out.println("O Terceiro numero e maior");
} 
//Saida
scanner.close();

	}
}
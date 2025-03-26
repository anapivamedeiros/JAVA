/******************************************************************************
Ex04- receba o salário e o tempo de serviço de 
um funcionário, calcule e mostre o valor do
bônus recebido por ele.
*******************************************************************************/
import java.util.Scanner;
public class Ex04
{
	public static void main(String[] args) {
	    // Criar um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

//Entrada de dados
System.out.println("Digite o salario: ");
double salario = scanner.nextDouble();

System.out.println("Digite o tempo de trabalho: ");
double tempo = scanner.nextDouble();

//calculo de bonus
if (tempo >= 5) {
    salario = salario*1.20;
    System.out.println("O salario com aumento de 20% sera: " + salario);

} else { 
    salario = salario*1.10;
    System.out.println("O salario com aumento de 10% sera: " + salario);

//Saida
scanner.close();
    
}

	
	}
}
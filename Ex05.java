/*
Ex05- Implemente um código para aprovar
empréstimo bancário.

*/
import java.util.Scanner;
public class Ex05
{
	public static void main(String[] args) {
 // Criar um objeto Scanner para ler a entrada do usuário
Scanner scanner = new Scanner(System.in);

        System.out.print("valor do empréstimo: ");
        double emprestimo = scanner.nextDouble();
        
         System.out.print("numero de parcelas: ");
        double parcelas = scanner.nextDouble();
        
         System.out.print("salario do solicitante: ");
        double salario = scanner.nextDouble();
        
    //calcular o valor da parcela
    double valorparcela = (emprestimo/ parcelas);
        
    //calcular a parcela    
    if (valorparcela <= (0.30 * salario)) {
    System.out.println("Emprestimo aprovado");
    System.out.print("valor da parcela: R$ " + valorparcela);
    
    
    } else {
        System.out.println("Emprestimo nao aprovado");
    }
    //Saida
    scanner.close();
    }
    
	}
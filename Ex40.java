/*
Ex40-  Exibir quantos litros ele conseguiu colocar no
tanque.
*/
import java.util.Scanner;
public class Ex40
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite quantos reais deseja abastecer seu tanque: R$");
double reais = scanner.nextDouble();

double gasolina = 6.31;

double litros;
litros = reais / gasolina;
System.out.println("Foram abastecidos: " +litros+ " litros" );

  }
}    

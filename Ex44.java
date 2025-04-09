/*
Ex44- Faça umalgoritmo para ler o valor total da conta e 
imprimir quanto cada um deve pagar, mas faça com que
Carlos e André não paguem centavos.
*/
import java.util.Scanner;
public class Ex44
{
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Digite o valor total gasto no bar: ");
double contaBar = scanner.nextDouble();

int totalCarlosAndre = (int)(contaBar / 3);
double resto = contaBar - (totalCarlosAndre * 2);

System.out.println("Carlos e André deverao pagar: "+totalCarlosAndre);
System.out.println("Felipe devera pagar: "+resto);


scanner.close();
  }
}    

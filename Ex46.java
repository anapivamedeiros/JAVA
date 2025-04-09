/*
Ex46- Calculadora de Áreas 
*/
import java.util.Scanner;
public class Ex46 {
    
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("\n1. Calcular Área do Retângulo ");
System.out.print("\n2. Calcular Área do Triângulo ");
System.out.print("\n3. Calcular Área do Círculo ");
System.out.print("\n0. Sair ");
System.out.print("\nEscolha uma opção: ");
int opcao = scanner.nextInt();

//area triangulo
switch (opcao) {
case 1:
System.out.print("Informe a altura do triangulo: ");
double altTriangulo = scanner.nextInt();
System.out.print("Informe a base do triangulo: ");
double baseTriangulo = scanner.nextInt();

double areaTriangulo;
areaTriangulo = (baseTriangulo*altTriangulo) / 2;
System.out.print("a area do triangulo é: "+ areaTriangulo);

break;

//area retangulo
case 2: 
System.out.print("Informe a altura do retangulo: ");
double altRetangulo = scanner.nextInt();
System.out.print("Informe a base do triangulo: ");
double baseRetangulo = scanner.nextInt();

double areaRetangulo;
areaRetangulo = (baseRetangulo*altRetangulo); 
System.out.print("a area do retangulo é: "+ areaRetangulo);

break;

//area circulo
case 3: 
System.out.print("Informe o raio do circulo: ");
double raio = scanner.nextInt();
double areaCirculo;
areaCirculo = (3.14*raio*raio);
System.out.print("a area do triangulo é: "+ areaCirculo);

break;

case 0:
 System.out.print("Sair: ");   
 break;

default:
System.out.print("Opção inválida! Tente novamente.");
}
}
}

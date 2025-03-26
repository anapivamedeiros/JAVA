/*
Ex 01- Calcular a média final da disciplina de programação
*/

import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {
        // Criar um objeto Scanner para ler a entrada do usuário
        Scanner scanner = new Scanner(System.in);
       
        // Solicitar o nome do aluno
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
       
        // Solicitar as três notas do aluno
        System.out.print("Digite a primeira nota (0 a 10): ");
        double nota1 = scanner.nextDouble();
       
        System.out.print("Digite a segunda nota (0 a 10): ");
        double nota2 = scanner.nextDouble();
       
        // Calcular a soma e a média das notas
        double soma = nota1 + nota2;
        double media = soma / 2;
       
        // Exibir a soma e a média
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
       
        // Verificar se o aluno foi aprovado ou não
        if (media >= 5) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado!");
        }
       
        // Fechar o scanner
        scanner.close();
    }
}
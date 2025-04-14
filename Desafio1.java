/*
Desafio1- Sistema de votação com contagem por candidato
Simule uma eleição com 3 candidatos. Os votos são inseridos até que o usuário digite 0. 
O programa deve validar se o voto é válido (1, 2, 3) 
e exibir ao final a quantidade de votos por candidato e o vencedor. Empates devem ser considerados.
*/
import java.util.Scanner;
public class Desafio1 {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int voto;
    int[] votos = new int[4];

    System.out.print("Digite seu voto (1, 2 ou 3). Digite 0 para encerrar:");

    while (true) {
    voto = sc.nextInt();
    if (voto == 0) break;
    if (voto >= 1 && voto <= 3) {
    votos[voto]++;
    } else {
    System.out.print("Voto inválido!");
    }
}

    System.out.println("\nResultado da votação:");
    for (int i = 1; i <= 3; i++) {
    System.out.print(" Candidato " + i + ": " + votos[i] + " votos");
    }

    if (votos[1] > votos[2] && votos[1] > votos[3]) {
    System.out.println("\nVencedor:  Candidato 1 ");
    } else if (votos[2] > votos[1] && votos[2] > votos[3]) {
    System.out.println("\nVencedor:  Candidato 2 ");
    } else if (votos[3] > votos[1] && votos[3] > votos[2]) {
    System.out.println("\nVencedor:  Candidato 3 ");
    } else {
    System.out.println("Empate!");
    }
  }
}
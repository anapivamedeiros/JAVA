/*
Ex15
Soma de numeros 1 a 15
 
*/

import java.util.Scanner;

public class Ex15 {
    public static void main(String[] args) {
    int soma = 0;
       
    for (int i = 1; i <= 15; i++) {
    soma += i;
    }
       
    System.out.println("A soma dos números de 1 a 15 é: " + soma);
    }
}
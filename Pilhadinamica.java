package Pilha;

import java.util.Scanner;
import java.util.Stack;

public class Pilhadinamica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Integer> pilhaPar = new Stack<>();
        Stack<Integer> pilhaImpar = new Stack<>();
        
       
        while (true) {
            System.out.print("Digite um número (-127 a 128, 0 para terminar): ");
            int numero = scanner.nextInt();
            
            if (numero == 0) break;
            
            if (numero % 2 == 0) {
                pilhaPar.push(numero); 
            } else {
                pilhaImpar.push(numero); 
            }
        }
        
        
        boolean isImparTurn = true; 
        while (!pilhaImpar.isEmpty() && !pilhaPar.isEmpty()) {
            if (isImparTurn && !pilhaImpar.isEmpty()) {
                System.out.println("Retirando da Pilha Ímpar: " + pilhaImpar.pop());
            } else if (!isImparTurn && !pilhaPar.isEmpty()) {
                System.out.println("Retirando da Pilha Par: " + pilhaPar.pop());
            }
            isImparTurn = !isImparTurn; 
        }
        
        
        if (!pilhaImpar.isEmpty()) {
            System.out.println("Pilha Ímpar ainda possui " + pilhaImpar.size() + " elementos: " + pilhaImpar);
        } else if (!pilhaPar.isEmpty()) {
            System.out.println("Pilha Par ainda possui " + pilhaPar.size() + " elementos: " + pilhaPar);
        } else {
            System.out.println("Ambas as pilhas estão vazias.");
        }
        
        scanner.close();
    }
}

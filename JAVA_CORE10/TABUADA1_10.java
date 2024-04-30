package lista_10;

import java.util.Scanner;

public class TABUADA1_10 {

	
	
	
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	    
	        System.out.print("Digite um número para ver sua tabuada: ");
	        int numero = scanner.nextInt();
	        
	   
	        System.out.println("Tabuada de multiplicação para " + numero + ":");
	        for (int i = 1; i <= 10; i++) {
	            System.out.println(numero + " x " + i + " = " + (numero * i));
	        }
	        
	        scanner.close();
	    }
	}
	
	
	
	
	
	
	
	


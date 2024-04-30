package lista_10;

public class VALOR_FATORIAL11 {


	  public static void main(String[] args) {
	        for (int i = 1; i <= 10; i++) {
	            if (i % 2 != 0) {
	                int fatorial = calcularFatorial(i);
	                System.out.println("O fatorial de " + i + " é: " + fatorial);
	            }
	        }
	    }

	    public static int calcularFatorial(int n) {
	        if (n == 0 || n == 1) {
	            return 1;
	        } else {
	            int resultado = 1;
	            for (int i = 2; i <= n; i++) {
	                resultado *= i;
	            }
	            return resultado;
	        }
	    }
	}
	
	
	
	
	


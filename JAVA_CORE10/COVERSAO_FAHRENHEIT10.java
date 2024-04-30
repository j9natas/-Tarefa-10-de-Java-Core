package lista_10;



public class COVERSAO_FAHRENHEIT10 {

	
	
	public static void main(String[] args) {
       
        int celsius = 10;
       
        int limite = 100;

        System.out.println("Celsius \t Fahrenheit");
        
       
        while (celsius <= limite) {
            
            double fahrenheit = (9.0 * celsius + 160.0) / 5.0;
          
            System.out.println(celsius + "\t\t" + fahrenheit);
         
            celsius += 10;
        }
    }
}
	
	
	
	
	
	
	
	
	
	
	
	


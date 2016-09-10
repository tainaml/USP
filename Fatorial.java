import java.util.Scanner;

public class Fatorial {

public static void main(String[] args) {
	
	int aux=1;

	Scanner entrada = new Scanner(System.in);
	System.out.println("Digite um numero");
	int n = entrada.nextInt();
	

	for (int i=1; i<=n; i++) {
	
	aux = i * aux; 
	
	}
	
	System.out.println(aux);

}

}
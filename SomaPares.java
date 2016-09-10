import java.util.Scanner;

	public class Numeros {
		int num;
		int pares=0;
    Numeros (int num) {
		this.num = num;
		}



	void  acaoNumero() {


	for (int i=0 ; i < num ; i++) {
 
	Scanner input = new Scanner(System.in);
	System.out.println("digite um numero: ");

	int numeros = input.nextInt();
	if (numeros % 2 == 0) {
		pares = pares + numeros;
		}
}
    System.out.println("soma dos numeros pares: " + pares);
}
}




//main


	public class Main {
 		public static void main(String[] args) { 


 			Numeros n1 = new Numeros(4);

 			n1.acaoNumero(); 
 		} 
 	} 
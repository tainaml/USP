
public class Numeros {
	
		private int numero;
		int impar = -1;
		int i = 0;
	
	Numeros (int numero) {
		
		this.numero = numero;
		
	}
	
	
	public void NumerosImpares() {

		while (i < numero) {
			impar +=2;
			i++;
		System.out.println(impar);
			
			}
					
			
			
	}	
}
	




//main



public class Ímpares {

	public static void main(String[] args) {
		
		Numeros n1 = new Numeros(16);
		n1.NumerosImpares();
		
	}

}

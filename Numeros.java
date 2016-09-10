public class Numeros {
	
	
	private int x;
	private int y;
	
	Numeros(int x, int y) {
		
		this.x = x;
		this.y = y;
		
	}
	
	public void  CalculoPotencia() {
		
		System.out.println( Math.pow (x,y));
		
		
	}
	

}








public class Principal {

	public static void main(String[] args) {
		
		
		Numeros n1 = new Numeros(-3,2);
		
		n1.CalculoPotencia();

	}

}


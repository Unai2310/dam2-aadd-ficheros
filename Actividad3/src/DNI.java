public class DNI {
	private int num;
	private char letra;
	
	DNI (int entero) {
		this.num=entero;
		this.letra=this.calcularLetra();
	}
	char calcularLetra () {
		int resto=(int)this.num % 23;
		
		char[] letras = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
		return letras[resto];
	}
	void modificarDNI () {
		
	}
	@Override
	public String toString() {
		return "DNI [num=" + num + ", letra=" + letra + "]";
	}
	
}

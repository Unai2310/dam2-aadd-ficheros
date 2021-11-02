public class pruebaLibro {

	public static void main(String[] args) {
		Libro milibro=new Libro("El Quijote");
		milibro.prestar();
		milibro.devolver();
		milibro.prestar();
		Libro otrolibro=new Libro("Patria");
		
		if (otrolibro.prestar()) {
			System.out.println("Te presto Patria");
		} else {
			System.out.println("No te lo puedo prestar");	
		}
		otrolibro.devolver();
		otrolibro.prestar();
		otrolibro.devolver();
		otrolibro.prestar();
		System.out.println(milibro);
		System.out.println(otrolibro);
	}

}

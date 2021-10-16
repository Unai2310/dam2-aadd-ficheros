package DirectoriosJava;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int decision = sc.nextInt();
		switch(decision) {
		case 1:
			Directorios.main(args);
		case 2:
			DirectoriosJson.main(args);
		case 3:
			DirectoriosXml.main(args);
		default:
			System.out.println("Numero no valido");
	}
	}

}

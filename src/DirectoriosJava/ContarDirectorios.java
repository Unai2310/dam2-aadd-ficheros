package DirectoriosJava;

import java.io.File;
import java.io.IOException;

public class ContarDirectorios {
	public static void main(String[] args) {
		File carpeta = new File("E:\\TMP\\DAM2\\\\AccesoDatos\\Ficheros\\00-TMP");
		File fichero = null;
		File[] lista = carpeta.listFiles();
		for (int i=0;i<lista.length;i++) {
			fichero = new File (lista[i]+"\\info-fichero.txt");
			try {
				fichero.createNewFile();
			} catch (IOException e) {
				System.err.println("MAL");
			}
		}
	}

}

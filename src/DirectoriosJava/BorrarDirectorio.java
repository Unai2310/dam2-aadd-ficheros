package DirectoriosJava;

import java.io.File;

public class BorrarDirectorio {
	public static void borraFichero(File file) { 
		if (file.exists()) {
			if (file.isFile()) {
				file.delete();
			}else {
				File f[]=file.listFiles();
				for (int i = 0; i < f.length; i++) {
					borraFichero(f[i]);
				}
				file.delete();
			}
		}
	}
	public static void main(String[] args) {
		File file=new File("E:\\TMP\\DAM2\\AccesoDatos\\Ficheros\\00-TMP");
		borraFichero(file);
	}
	
}

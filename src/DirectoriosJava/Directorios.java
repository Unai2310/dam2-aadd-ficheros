package DirectoriosJava;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class Directorios {
	public static void main(String[] args) {
		Properties config = new Properties();
		InputStream Entrada = null;
		Path rutaArchivo;
		try {
			Entrada = new FileInputStream("E:\\Documentos\\GitHub\\Acceso a Datos\\dam2-aadd-ficheros\\src\\Config.properties");
			config.load(Entrada);
			rutaArchivo = Paths.get(config.getProperty("carpeta1"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta2"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta3"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta4"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta5"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta6"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta7"));
			Files.createDirectories(rutaArchivo);
			rutaArchivo = Paths.get(config.getProperty("carpeta8"));
			Files.createDirectories(rutaArchivo);
		} catch (Exception e) {
			System.err.println("MAL");
		}
	}

}

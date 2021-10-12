package DirectoriosJava;

import java.io.File;
import java.io.FileReader;
import java.nio.file.Path;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class Prueba {
    public static void main(String[] args) {
    {
        Path ruta;

    try {

    JsonParser parser = new JsonParser();
    Object object =  parser.parse(new FileReader("Configuracion.json"));
    JsonObject config = (JsonObject) object;
    File fichero1= new File(config.get("carpeta1").toString());
    fichero.createNewFile();
    File fichero2= new File(config.get("carpeta2").toString());
    fichero.createNewFile();
    File fichero3= new File(config.get("carpeta3").toString());
    fichero.createNewFile();
    File fichero4= new File(config.get("carpeta4").toString());
    fichero.createNewFile();
    File fichero5= new File(config.get("carpeta5").toString());
    fichero.createNewFile();
    File fichero6= new File(config.get("carpeta6").toString());
    fichero.createNewFile();
    File fichero7= new File(config.get("carpeta7").toString());
    fichero.createNewFile();
    File ficher8= new File(config.get("carpeta8").toString());
    fichero.createNewFile();
    }catch(Exception e) {
        System.err.println("Malo");
    }


}
}
}
package DirectoriosJava;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class DirectoriosJson {
    public static void main(String[] args) {

        File archivo = new File ("E:\\Documentos\\Github\\Acceso a datos\\dam2-aadd-ficheros\\src\\Config.json");

        String prueba="";

        try {
            prueba = new String (Files.readAllBytes(archivo.toPath()), StandardCharsets.UTF_8);
            System.out.println(prueba);
        } catch (Exception e) {

        }

        JsonObject archivojson = JsonParser.parseString(prueba).getAsJsonObject();

        String algo = archivojson.get("ruta1").getAsString();
        File archivo2 = new File(algo);
        archivo2.mkdirs();

        String algo1 = archivojson.get("ruta2").getAsString();
        archivo2 = new File(algo1);
        archivo2.mkdirs();

        String algo2 = archivojson.get("ruta3").getAsString();
        archivo2 = new File(algo2);
        archivo2.mkdirs();

        String algo3 = archivojson.get("ruta4").getAsString();
        archivo2 = new File(algo3);
        archivo2.mkdirs();

        String algo4 = archivojson.get("ruta5").getAsString();
        archivo2 = new File(algo4);
        archivo2.mkdirs();

        String algo5 = archivojson.get("ruta6").getAsString();
        archivo2 = new File(algo5);
        archivo2.mkdirs();

        String algo6 = archivojson.get("ruta7").getAsString();
        archivo2 = new File(algo6);
        archivo2.mkdirs();

        String algo7 = archivojson.get("ruta8").getAsString();
        archivo2 = new File(algo7);
        archivo2.mkdirs();

    }
}


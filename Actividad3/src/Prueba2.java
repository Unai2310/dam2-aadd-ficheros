import java.util.Scanner;

public class Prueba2
{
    static String tpalabros[] = {"caca","culo","pedo","pis"};
    public static void main ( String argv[]){
        String palabra;
        Scanner sc= new Scanner(System.in);
        System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
        palabra=sc.nextLine();
        leerLineaOK(tpalabros,palabra);
    }

    public static String leerLineaOK (String[] tpalabros, String palabra) {
    	String mensaje = "Error no se permite lenguaje obsceno.";
    	String mensaje2 = "Ok";
    	int cuenta = 0;
    	for (int i =0;i<tpalabros.length;i++) {
    		if (palabra.indexOf(tpalabros[i])!=-1) {
    			System.out.println(mensaje);
    			break;
    		} else {
    	    	cuenta++;
    		}
    	}
    	if (cuenta ==4) {
    		System.out.println(mensaje2);
    	}
    	return null;
    }
}
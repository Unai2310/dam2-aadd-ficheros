import java.util.Scanner;
public class Palabras {
     static String tpalabros[] = {"caca","culo","pedo","pis"};
    public static void main(String[] args) throws BurradasNOException  {
        Scanner scan = new Scanner(System.in);
        String palabras;
          do {
             System.out.println("Introduce tus mensajes, o pulsa . Para terminar:");
             palabras=leerLineaOK(scan);
          }while (palabras.charAt(0)!='.');
          	System.out.println("Adios");
          }

      public static String leerLineaOK (Scanner scan) throws BurradasNOException {
    	  int aiuda = 0;
          String palabras;
          palabras=scan.nextLine();
          try {
        	  for (int i=0;i<palabras.length();i++) {
        		  for (int j=0;j<tpalabros.length;j++) {
        			  if (palabras.contains(tpalabros[j])) {
        				  aiuda = 1;
        				  throw new BurradasNOException();    				  
        			  } else {
        				  aiuda = 0;
        			  }
        		  }
        	  }
          }catch(BurradasNOException error) {
        	  System.err.println(error.getMessage());
          }
          if (aiuda == 0 && palabras.charAt(0)!='.') {
        	  System.out.println("Ok");
          }
           return palabras;
      }
}

public static void main (  String [] argv ){ 
        
        EstacionClimatica estaci�n  = new EstacionClimatica("Burgos",2017); 
       

        System.out.println(" Introducir 5 medidas :"); 
        

        for (int i=0; i< 5; i++){ 
             TempHumDia  medicion = leerMedida (); 
             estaci�n.addDia( medicion); 
        } 
        
       estaci�n.listarDias(); 
        
       System.out.println("Introduca 2 medidas a Borrar:"); 
       TempHumDia  medida1 = leerMedida(); 
       TempHumDia  medida2 = leerMedida(); 
       
       estaci�n.delDia(medida1); 
       estaci�n.delDia(medida2); 

       
       estaci�n.listarDias();      
             
    }            
        
 }

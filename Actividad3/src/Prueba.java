public static void main (  String [] argv ){ 
        
        EstacionClimatica estación  = new EstacionClimatica("Burgos",2017); 
       

        System.out.println(" Introducir 5 medidas :"); 
        

        for (int i=0; i< 5; i++){ 
             TempHumDia  medicion = leerMedida (); 
             estación.addDia( medicion); 
        } 
        
       estación.listarDias(); 
        
       System.out.println("Introduca 2 medidas a Borrar:"); 
       TempHumDia  medida1 = leerMedida(); 
       TempHumDia  medida2 = leerMedida(); 
       
       estación.delDia(medida1); 
       estación.delDia(medida2); 

       
       estación.listarDias();      
             
    }            
        
 }

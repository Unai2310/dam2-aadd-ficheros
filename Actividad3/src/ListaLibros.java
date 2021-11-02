public class ListaLibros {
	    Libro primero;
	    /**
	     * Constructor for objects of class ListaNodos
	     */
	    public ListaLibros()
	    {
	        primero = null;
	    }
	    // Completar los metodos
	    // Incluye un nuevo libro en la lista
	    public void pon( Libro valor){
	    	Libro Nuevo = valor;
	        Nuevo.siguiente=primero;
	        primero=Nuevo;
	    }
	    
	    public boolean estaVacia(){
	       return ( primero == null );     
	    }
	    
	    // Devuelve un libro que es eliminado de la lista o null si no exite
	    public Libro quitar ( int id ) {
	        Libro aux=primero.siguiente;
	        Libro aux2=primero;
	        if(aux2.id==id) {
	        	primero=aux2.siguiente;
	        	return aux2;
	        }
	        while(aux!=null) {
	        	if(aux.id==id) {
	        		aux2.siguiente=aux.siguiente;
	        		return aux;
	        	}
	        	aux=aux.siguiente;
	        	aux2=aux2.siguiente;
	        }
	    	return null;
	    }
	   
	    // Devuelve el id del libro o -1 si no esta
	    public int buscarId ( String titulo ){
	        if(primero==null) {
	        	return -1;
	        }
	        Libro auxi=primero;
	        while(auxi!=null) {
	        	if(auxi.titulo.equals(titulo)) {
	        		return auxi.id;
	        	}
	        	auxi=auxi.siguiente;
	        }
	    return -1;
	   }
	    // Muestra los libros almacenados
	    public void verCatalogo (){
	    	Libro aux=primero;
	    	while(aux!=null) {
	    		System.out.println(aux);
	    		aux=aux.siguiente;
	    	}
	    }
	         
	    

	}


import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ModeloArrayList extends ModeloAbs
{
    private ArrayList <Producto> lista;
    
    public ModeloArrayList()
    {
    	lista=new ArrayList <Producto>();
    }

    // Implementar los metodos abstractos de ModeloAbs
    public boolean insertarProducto ( Producto p){
    	if (buscarProducto(p.codigo)==null && p.precio>0 && p.stock>0) {
    		return lista.add(p);
    	}
    return false;
    }
 
    public boolean borrarProducto ( int codigo ){
    	Scanner sc = new Scanner(System.in);
    	char decision;
    	for (Producto producto : lista) {
    		if (producto.codigo == codigo) {
    			System.out.println(producto);
    			System.out.println("Lo borras?");
				do {
					decision=sc.nextLine().charAt(0);
					decision=Character.toLowerCase(decision);
				} while (decision!='s' && decision!='n');
				if (decision=='s') {
	    			lista.remove(producto);
	    			System.out.println("Producto Borrado");
	    			return true;
				} else {
					System.out.println("El producto no ha sido eliminado");
				}
    		}
    	}
    	return false;
    }
    
    public Producto buscarProducto ( int codigo) {
    	for (Producto producto : lista) {
    		if (producto.codigo == codigo) {
    			return producto;
    		}
    	}
    	return null;
    }
    
    public void listarProductosTodos (){
       for (Producto producto : lista) {
    	   System.out.println("-"+producto);
       }
    }
    
    public void listarProductosStockMin(){
    	for (Producto producto : lista) {
    		if (producto.stock<producto.stock_min) {
    			System.out.println("-"+producto);
    		}
    	}
    }
    
    public boolean modificarProducto (Producto nuevo){
    	Scanner sc2= new Scanner(System.in);
    	System.out.println(nuevo);
    	System.out.println("Que atributo quieres cambiar: 1)Stock   2)Precio");
    	int atributo=sc2.nextInt();
    	switch (atributo) {
		case 1: {
			try {
				System.out.println("Introduce cantidad");
	    		int stock=sc2.nextInt();
	    		nuevo.stock+=stock;
	    		return true;
	    	} catch (InputMismatchException e){
	    		System.err.println("Tipo de dato incorrecto "+e.getMessage());
	    	} catch (Exception x) {
	    		System.err.println("Error inesperado "+x.getMessage());
	    	}
	    	return false;
		}
		case 2: {
			try {
				System.out.println("Introduce cantidad");
	    		float dinero=sc2.nextFloat();
	    		nuevo.precio=dinero;
	    		return true;
	    	} catch (InputMismatchException e){
	    		System.err.println("Tipo de dato incorrecto "+e.getMessage());
	    	} catch (Exception x) {
	    		System.err.println("Error inesperado "+x.getMessage());
	    	}
	    	return false;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + atributo);
		}
    }
}    

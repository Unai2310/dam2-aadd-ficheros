import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class ModeloHashMap extends ModeloAbs
{
    private HashMap <Integer,Producto> lista;

    public ModeloHashMap()
    {
       lista=new HashMap  <Integer,Producto>();
    }

	@Override
	public boolean insertarProducto(Producto p) {
		if (buscarProducto(p.codigo)==null && p.precio>0 && p.stock>0) {
    		lista.put(p.codigo, p);
    		return true;
    	}
    return false;
    }

	@Override
	boolean borrarProducto(int codigo) {
		Scanner sc= new Scanner(System.in);
		Producto p=buscarProducto(codigo);
		if (p==null) {
			return false;
		} else {
			System.out.println(p);
			System.out.println("Quieres borrar este producto? S/N");
			char pregunta=sc.nextLine().charAt(0);
			if (pregunta=='n') {
				return false;
			} else {
				lista.remove(codigo);
				return true;
			}
		}
	}

	@Override
	public Producto buscarProducto(int codigo) {
		if  (lista.containsKey(codigo)== false ) {
			return null;
		} else {
			return lista.get(codigo);
		}			
	}

	@Override
	void listarProductosTodos() {
		for (Map.Entry<Integer , Producto> paso : lista.entrySet()) {
			System.out.println(paso.getKey()+"->"+paso.getValue());
		}
	}

	@Override
	void listarProductosStockMin() {
		for (Map.Entry<Integer , Producto> paso : lista.entrySet()) {
			if (paso.getValue().stock_min>paso.getValue().stock) {
				System.out.println(paso.getKey()+"->"+paso.getValue());
			}
		}
	}

	@Override
	boolean modificarProducto(Producto nuevo) {
		Scanner sc2= new Scanner(System.in);
		Producto p=buscarProducto(nuevo.codigo);
		if (p==null) {
			return false;
		}
		System.out.println(p);
		System.out.println("Que precio le quieres poner");
		float respuesta = sc2.nextFloat();
		p.precio=respuesta;
		return true;
	}

    
    
}
import java.util.ArrayList;

public class ProductosTienda {
	private int codigo;
	private double precio;
	private double iva;
	private double precioIva;
	private String producto;
	private String descripcion;
	private String fecha;
	
	
	public ProductosTienda(int codigo, double precio, String producto, String descripcion, String fecha) {
		super();
		this.codigo = codigo;
		this.precio = precio;
		this.producto = producto;
		this.descripcion = descripcion;
		this.fecha = fecha;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public double getPrecioIva() {
		return precioIva;
	}



	public void setPrecioIva(double precioIva) {
		this.precioIva = precioIva;
	}



	public String getProducto() {
		return producto;
	}



	public void setProducto(String producto) {
		this.producto = producto;
	}



	public String getDescripcion() {
		return descripcion;
	}



	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	@Override
	public String toString() {
		return "Productos [CÓDIGO: " + codigo + " -- PRECIO: " + precio +  "$" + " -- PRODUCTO: "
				+ producto + " -- DESCRIPCIÓN " + descripcion + " -- Fecha Carga " + fecha + "]";
	}
	
	//Método para calcular el precio venta
	
	public static void PrecioIva(ArrayList<ProductosTienda> p ) {
		double precio;
		double iva;
		double precioIva;
		for(int i = 0; i < p.size(); i++) {
			precio = p.get(i).getPrecio();
			iva = precio*0.09;
			precioIva = precio +iva;
			p.get(i).setPrecioIva(precioIva);
			}
	}

	
	public static void mostrar(ArrayList<ProductosTienda> p ) {
		for(int i = 0; i < p.size(); i++) {
			System.out.println(p.get(i));
		}
	}
	

	public static void main(String[] args) {
		ArrayList<ProductosTienda> productos = new ArrayList<ProductosTienda>();
		
		System.out.println("\n---------DATOS DE LOS PRODUCTOS------------\n");
		ProductosTienda produ1 = new ProductosTienda(356878, 15, "Camisa", "Unisex de toda talla, color gris, 70% algondón","12-01-18");
		ProductosTienda produ2 = new ProductosTienda(458951, 12, "Blusa", "Blusa corta, 30% algondón, color púrpura ","22-02-19");
		ProductosTienda produ3 = new ProductosTienda(849765, 30, "Pantalón", "Unisex de toda talla, color negro","12-02-19");
		ProductosTienda produ4 = new ProductosTienda(878911, 18, "Falda", "Toda talla, color rosado","2-03-20");
		ProductosTienda produ5 = new ProductosTienda(126497, 10, "Short", "Short para mujer de toda talla, color rosado","9-11-19");
		
		
		productos.add(produ1);
		productos.add(produ2);
		productos.add(produ3);
		productos.add(produ4);
		productos.add(produ5);
		mostrar(productos);
		
		PrecioIva(productos);
		System.out.println("\n---------PRECIO VENTA (incluido IVA)----------\n");
		System.out.println("Camisa: " + produ1.getPrecioIva() + "$");
		System.out.println("Blusa: " + produ1.getPrecioIva() + "$");
		System.out.println("Pantalón: " + produ3.getPrecioIva() + "$");
		System.out.println("Falda: " + produ4.getPrecioIva() + "$");
		System.out.println("Short: " + produ5.getPrecioIva() + "$");
	}

}

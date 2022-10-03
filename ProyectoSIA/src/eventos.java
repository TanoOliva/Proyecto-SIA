
public class eventos {
	private String nombre_evento;
	private String ubicacion_evento;
	private String tipo_evento;
	private int precio_G;
	private int precio_V;
	private int precio_P;
	private int stock_V;
	private int stock_G;
	private int stock_P;
	private String fecha;
	private compradores name =new compradores();
	
	public String getNombre_evento() {
		return nombre_evento;
	}
	public void setNombre_evento(String nombre_evento) {
		this.nombre_evento = nombre_evento;
	}
	public String getUbicacion_evento() {
		return ubicacion_evento;
	}
	public void setUbicacion_evento(String ubicacion_evento) {
		this.ubicacion_evento = ubicacion_evento;
	}
	public String getTipo_evento() {
		return tipo_evento;
	}
	public void setTipo_evento(String tipo_evento) {
		this.tipo_evento = tipo_evento;
	}
	public void setPrecio_g(int nombre_evento) {
		this.precio_G = nombre_evento;
	}
	public int getPrecio_g() {
		return precio_G;
	}
	public void setPrecio_V(int nombre_evento) {
		this.precio_V = nombre_evento;
	}
	public int getPrecio_V() {
		return precio_V;
	}
	public void setPrecio_P(int nombre_evento) {
		this.precio_P = nombre_evento;
	}
	public int getPrecio_P() {
		return precio_P;
	}
	
	public int getStock_V() {
		return stock_V;
	}
	public void setStock_V(int stock) {
		this.stock_V = stock;
	}
	public int getStock_G() {
		return stock_G;
	}
	public void setStock_G(int stock) {
		this.stock_G = stock;
	}
	public int getStock_P() {
		return stock_P;
	}
	public void setStock_P(int stock) {
		this.stock_P = stock;
	}

	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	
	
	public compradores manipular() {
		return name;
	}
}

import java.util.ArrayList;
public class compradores {

	private int cantidad_Vendida;
	private ArrayList<String> Nombres= new ArrayList<String>();
	
	
	public void set_vendidas(int ventas) {
		this.cantidad_Vendida+=ventas;
	}
	
	public int get_vendidas() {
		return cantidad_Vendida;
	}
	
	public void set_Nombres(String nom) {
		this.Nombres.add(nom);
		
	}

	public void get_Nombre() {
		System.out.println("Compradores: ");
		System.out.println(this.Nombres);	
	}
	
}

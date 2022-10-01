
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class CSV {
	
	private BufferedReader lector;
	private String linea;
	private String partes[]=null;
	
	
	public void leerArchivo(String nombreArchivo,HashMap<String,eventos> listaEventos) {
		
		try {
			lector= new BufferedReader(new FileReader(nombreArchivo));
			
			while((linea=lector.readLine())!=null) {
				partes=linea.split(";");
				imprimirLinea(listaEventos);
			}
			lector.close();
			linea=null;
			partes=null;
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, e);
		}
	}
	public void imprimirLinea(HashMap<String,eventos> listaEventos){
		eventos obj1 = new eventos();
		obj1.setNombre_evento(partes[0]);
		obj1.setUbicacion_evento(partes[1]);
		obj1.setFecha(partes[2]);
		obj1.setTipo_evento(partes[3]);
		obj1.setPrecio_g(Integer.parseInt(partes[4]));
		obj1.setStock_G(Integer.parseInt(partes[5]));
		obj1.setPrecio_P(Integer.parseInt(partes[6]));
		obj1.setStock_P(Integer.parseInt(partes[7]));
		obj1.setPrecio_V(Integer.parseInt(partes[8]));
		obj1.setStock_V(Integer.parseInt(partes[9]));
		listaEventos.put(obj1.getNombre_evento(), obj1);
	}

}

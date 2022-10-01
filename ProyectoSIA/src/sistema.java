import java.util.Scanner;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;

// holi 
public class sistema {
	static Scanner scan = new Scanner(System.in);
	static int opcion = -1;
	static int e = -1;

	public static void main(String[] args) {
		HashMap<String,eventos> listaEventos = new HashMap<String,eventos>();
		ArrayList <eventos> filtroEventos = new ArrayList<eventos>();
		
		
		CSV archivo=new CSV();
		archivo.leerArchivo("C:\\Users\\lukio\\Desktop\\Eventos2.csv",listaEventos);
		archivo.leerArchivo("C:\\Users\\lukio\\Desktop\\Eventos2.csv",filtroEventos);
		
		usuario obj1 = new usuario();
		String ingresado;
		int int_ingresado;
		System.out.println(" 1- Ingresar sesión\n 2- Eventos\n 3- Comprar entrada\n 0- Salir\n");
		System.out.println("Ingrese opción:");
		opcion = Integer.parseInt(scan.nextLine());
		
		while (true) {
			
			if (opcion == 1) {
				
				System.out.println("Ingrese los datos socilitados:");
	        	System.out.println("Nombre y apellido (todo en minuscula):");
	        	ingresado = scan.nextLine();
	        	obj1.setNombre_usuario(ingresado);
	        	System.out.println("Edad:");
	        	int_ingresado = Integer.parseInt(scan.nextLine());
	        	obj1.setEdad(int_ingresado);
	        	System.out.println("Número de celular:");
	        	int_ingresado = Integer.parseInt(scan.nextLine());
	        	obj1.setTelefono(int_ingresado);
	        	System.out.println("Correo electronico:");
	        	ingresado = scan.nextLine();
	        	obj1.setCorreo_usuario(ingresado);
	        	System.out.println("Cuidad donde recide:");
	        	ingresado = scan.nextLine();
	        	obj1.setUbicacion_usuario(ingresado);
	        	saludar(obj1.getNombre_usuario());
				
			}
			if (opcion == 2) {
				System.out.println(" 1- Lista de eventos\n 2- Buscar eventos\n 3- Filtrar eventos por tipo\n 4- Mostrar Compradores y cantidad total de entradas vendidas del evento\n 0- Volver al menu principal\n");
				e = Integer.parseInt(scan.nextLine());
				
				if(e == 1) {
					System.out.println("lista de eventos");
					mostrarEventos(listaEventos);
				}
				if(e == 2) {
					System.out.println("Buscar eventos por nombre");
					buscarEventos(listaEventos);
				}
				if(e == 3) {
					
					//filtrarEventos(listaEventos);
				}
				if (e==4) {
					String buscado;
					String clave;
				    Iterator<String> eventos = listaEventos.keySet().iterator();
				    System.out.println("Ingrese el nombre del evento a Mostrar:");
				    buscado= scan.nextLine();
				    while(eventos.hasNext()){
				        clave = eventos.next();
				        if (buscado.equals(listaEventos.get(clave).getNombre_evento().toLowerCase())) {
				        	listaEventos.get(clave).manipular().get_Nombre();
				        	System.out.println("Cantidad de entradas vendidas: "+listaEventos.get(clave).manipular().get_vendidas());
				        }
				        
				    }  
					
				}
				if (e == 0) {
					System.out.println("Salir al menu principal");
				}
			}
			if (opcion == 3) {
				compras(listaEventos,obj1);
			}
			if (opcion == 0) {
				break;
			}
			
			System.out.println(" 1- Ingresar sesión\n 2- Eventos\n 3- Comprar entrada\n 0- Salir\n");
			System.out.println("Ingrese opción:");
			opcion = Integer.parseInt(scan.nextLine());
			
			
			if (opcion > 4 || opcion < 0) {
				System.out.println("ERROR:\ningrese una de las siguientes opciones");
				System.out.println(" 1- Ingresar sesión\n 2- Eventos\n 3- Comprar entrada\n 0- Salir\n");
				opcion = Integer.parseInt(scan.nextLine());
			}
			
		}
	
		
		
		
		
		
		
		
	}
	public static void mostrarEventos(HashMap<String,eventos> listaEventos) {
		String clave;
		
	    Iterator<String> eventos = listaEventos.keySet().iterator();
	    System.out.println("Hay los siguientes productos:");
	    while(eventos.hasNext()){
	        clave = eventos.next();
	        System.out.println(listaEventos.get(clave).getNombre_evento() +" - "+listaEventos.get(clave).getUbicacion_evento());
	    }  
	}
	public static void buscarEventos(HashMap<String,eventos> listaEventos) {
		String buscado;
		String clave;
	    Iterator<String> eventos = listaEventos.keySet().iterator();
	    System.out.println("Ingrese el nombre del evento a buscar:");
	    buscado= scan.nextLine();
	    while(eventos.hasNext()){
	        clave = eventos.next();
	        if (buscado.equals(listaEventos.get(clave).getNombre_evento().toLowerCase())) {
	        	System.out.println(listaEventos.get(clave).getNombre_evento() +" - "+listaEventos.get(clave).getUbicacion_evento()+" - "+listaEventos.get(clave).getTipo_evento()+" - "+listaEventos.get(clave).getFecha());
	        }
	        
	    }  
	}  
	    
	static void saludar(String nombre){
	    System.out.println("Hola "+ nombre+" te has registrado con éxito :) \n");
	    System.out.println("MENU PRINCIPAL:\n");
	}

	/*
	static void mostrarTipos(ArrayList<eventos> filtroEventos) {
		HashMap<String,String> tipos = new HashMap<String,String>();
		
		for (int i = 0; i <filtroEventos.size();i++) {
			tipos.get(filtroeventos.get(i), null)
		}
		
	}
	*/
	public static void filtrarEventos(HashMap<String,eventos> listaEventos) {
		String tipo;
		String clave;
	    Iterator<String> eventos = listaEventos.keySet().iterator();
	    //---------- Mostrar Todos los tipos de entradas------------
	    

	    
	    
	    
	    
	    
	    //
	    System.out.println("Ingrese el tipo del evento a buscar:\nmusica\ndeportes\ncharla");
	    
	    
	    
	    tipo= scan.nextLine();
	    while(eventos.hasNext()){
	        clave = eventos.next();
	        if (tipo.equals(listaEventos.get(clave).getTipo_evento().toLowerCase())) {
	        	System.out.println(listaEventos.get(clave).getNombre_evento() +" - "+listaEventos.get(clave).getUbicacion_evento()+" - "+listaEventos.get(clave).getTipo_evento()+" - "+listaEventos.get(clave).getFecha());
	        }
	    }
	    
	    
	}
	public static void compras(HashMap<String,eventos> listaEventos, usuario obj1) {
		String clave;
		String evento;
		String entrada;
		String a;
		int total=0;
		int cantidad;
	    Iterator<String> eventos = listaEventos.keySet().iterator();
	    if(obj1.getNombre_usuario() == null) {
	    	System.out.println("Se requiere iniciar sesion ");
	    	return;
	    }
	    System.out.println("Ingrese el nombre del evento :");
	    evento=scan.nextLine();
	    System.out.println("¿Que tipo de entrada desea comprar?: \ngeneral\npremium\nvip");
	    entrada=scan.nextLine();
	    System.out.println("Cantidad que desea comprar:");
	    cantidad=Integer.parseInt(scan.nextLine());
	    
	    while(eventos.hasNext()){
	        clave = eventos.next();
	        if (evento.equals(listaEventos.get(clave).getNombre_evento().toLowerCase())) {
	        	listaEventos.get(clave).manipular().set_vendidas(cantidad);
	        	listaEventos.get(clave).manipular().set_Nombres(obj1.getNombre_usuario());
	        	if (entrada.equals("general")) {
	        		listaEventos.get(clave).setStock_G(listaEventos.get(clave).getStock_G()-cantidad);
	        		total=listaEventos.get(clave).getPrecio_g()*cantidad;
	        	}
	        	if (entrada.equals("premium")) {
	        		listaEventos.get(clave).setStock_P(listaEventos.get(clave).getStock_P()-cantidad);
	        		total=listaEventos.get(clave).getPrecio_P()*cantidad;
	        	}
	        	if (entrada.equals("vip")) {
	        		listaEventos.get(clave).setStock_V(listaEventos.get(clave).getStock_V()-cantidad);
	        		total=listaEventos.get(clave).getPrecio_V()*cantidad;
	        	}
	        	
	        }
	        
	    }
	    
	    System.out.println("Su total es de $"+total+" Desea concretar la compra:\n y/n");
	    a=scan.nextLine(); 
	    if (a.equals("n")) {
	    	System.out.println("No se realizo su compra");
	    	return;
	    }
	    System.out.println("Su compra se realizo con exito\nSus entradas han sido enviadas al siguiente correo:"+obj1.getCorreo_usuario()+"\nNos contactaremos al numero "+obj1.getTelefono()+" para confirmar su compra");
	}
}

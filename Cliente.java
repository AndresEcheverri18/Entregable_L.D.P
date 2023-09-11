package Proyecto_1;

public class Cliente  extends Perfiles_De_Usuario{

	private static long telefono_Contacto;
	private static String direccion_Contacto;
	public Cliente(String nombre, String correo, long telefono_Contacto, String direccion_Contacto) {
		super(nombre, correo);
		this.telefono_Contacto = telefono_Contacto;
		this.direccion_Contacto = direccion_Contacto;
	}
	
	public void consultar_Productos() {
		System.out.println("Hay x cantidad de productos");
	}
	public void mostrar_Contenido_Cl() {
		System.out.println("----------------------------------------------------------\n" 
				+ "Su telefono de contacto es:"+telefono_Contacto+"\n"
				+ "Su direccion de contacto es:"+direccion_Contacto);
		
	}
}

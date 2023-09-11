package Proyecto_1;
import java.util.Scanner;
public class Cajero extends Perfiles_De_Usuario{
	
	Scanner reader = new Scanner(System.in);
	private static String clave_Cajero;

	public Cajero(String nombre, String correo) {
		super(nombre, correo);
		
	}
	
	public void crear_Clave() {
    	System.out.print("----------------------------------------------------------\n"
    			         +"Usted se encuentra en el cajero\n"
    			+"Ingrese su clave de cajero:");
    	this.clave_Cajero = reader.next();
    	System.out.println("----------------------------------------------------------");
    	
    }
	
	public void registrar_Venta() {
		System.out.println("Se ha registrado una venta");
	}
	public void mostrar_Contenido_C() {
		System.out.println("Su clave es:"+clave_Cajero);
	}

}

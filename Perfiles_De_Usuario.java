package Proyecto_1;
import java.util.Scanner;
public class Perfiles_De_Usuario {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);	
		System.out.print("Ingrese su nombre:");
		String nombre = reader.nextLine();
		System.out.print("Ingrese su correo:");
		String correo = reader.next();
		
		
		Admon A1 = new Admon(nombre,correo);
		A1.Asignar_Codigo_A_Perfil();
		A1.crear_Clave();
		A1.mostrar_Contenido_A();
		System.out.println(A1);
		Cajero C1 = new Cajero(nombre,correo);
		C1.crear_Clave();
		C1.registrar_Venta();
		C1.mostrar_Contenido_C();
		System.out.print("----------------------------------------------------------\n"
		+"Usted se encuentra ahora en el cliente\n"
				+"Ingrese su numero de contacto:");
		long numero = reader.nextLong();
		System.out.print("Ingrese su direccion:");
		String direccion = reader.next();
		Cliente Cl1 = new Cliente(nombre,correo,numero,direccion);
        Cl1.consultar_Productos();
		Cl1.mostrar_Contenido_Cl();
		
		
	}
	
	
 String nombre;
	private String correo;
	private int perfil;

	public Perfiles_De_Usuario(String nombre, String correo) {
	
		this.nombre = nombre;
		this.correo = correo;
	}	
	
	
	
	
	
	
	

	
}

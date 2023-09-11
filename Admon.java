package Proyecto_1;
import java.util.Scanner;
public class Admon extends Perfiles_De_Usuario{
	
	Scanner reader = new Scanner(System.in);
	private static String clave_Admon;	
	private static int perfil_Admon = 1;
	private static int perfil_Cajero = 2;
	private static int perfil_Cliente = 3;

		private String nombre;
		private String correo;
		private int perfil;     
	       
	public Admon(String nombre, String correo) {
		super(nombre, correo);
		
		this.nombre= nombre;
		this.correo = correo;
	}
	
	
    public void crear_Clave() {
    	System.out.print("----------------------------------------------------------\n"
    			         +"Ingrese su clave de Administrador:");
    	this.clave_Admon = reader.next();
    	System.out.println("----------------------------------------------------------");
    	
    }
	
	public void mostrar_Contenido_A() {
		System.out.println("Su clave de administrador es:"+ clave_Admon);
	}

			
public void Asignar_Codigo_A_Perfil() {
		
		System.out.println("----------------------------------------------------------\n"
				           + "¡El encargado de asignar usuarios es el Administrador!\n"
				           + "----------------------------------------------------------");
		
		System.out.println("Ingrese el usuario que desea asignar: \n"
				+ "1) Administrador \n"
				+ "2) Cajero \n"
				+ "3) Cliente \n"
				+ "----------------------------------------------------------");
		int usuario  = reader.nextInt();
		
		if(usuario == 1) {
			System.out.println("----------------------------------------------------------\n"
				    +"Asignó el usuario Administrador");
			this.perfil= perfil_Admon;
		}else if(usuario == 2) {
			System.out.println("----------------------------------------------------------\n"
					+ "Asignó el usuario Cajero");
			this.perfil = perfil_Cajero;
		}else if(usuario == 3) {
			System.out.println("----------------------------------------------------------\n"
					+ "Asignó el usuario Cliente");
			this.perfil = perfil_Cliente;
		}
		
	}
	
	
	
	
	public String toString() {
		return "----------------------------------------------------------\n"
			 + "Su nombre es:" + nombre +"\n"
			 + "Su correo es:" + correo + "\n"
			 + "El perfil que asignó es el perfil:"+perfil ;
	}
	
}

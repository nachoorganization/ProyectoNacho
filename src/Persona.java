/**
 * 
 * @author Nacho, Adrián, Miguelangel, Gerardo
 *
 */
public class Persona {

	/**
	 * Atributos de la clase persona
	 */
	private String nombre;
	private String apellidos;
	private String dni;
	
	/**
	 * Constructor de la clase
	 * @param nombre Nombre de la persona
	 * @param apellidos Apellidos de la perona
	 * @param dni DNI de la persona
	 */
	public Persona(String nombre, String apellidos, String dni) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
	}

	/**
	 * Devuelve el nombre de la persona
	 * @return El nombre de la persona
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Establece el nombre de la persona
	 * @param nombre El nombre de la persona
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Devuelve los apellidos de la persona
	 * @return Los apellidos de la persona
	 */
	public String getApellidos() {
		return apellidos;
	}

	/**
	 * Establece los apellidos de la persona
	 * @param apellidos Los apellidos de la persona
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	/**
	 * Devuelve el DNI de la persona
	 * @return El DNI de la persona
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Establece el DNI de la persona
	 * @param dni El DNI de la persona
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	
	
	
}

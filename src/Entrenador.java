
public class Entrenador extends SeleccionFutbol
{

	private String idFederacion;

    public Entrenador() {
    	super();
	}
        
    public Entrenador(int id, String nombre, String apellidos, int edad, String idFederacion) {
		super(id, nombre, apellidos, edad);
		this.idFederacion = idFederacion;
	}

	// getter y setter

	public void dirigirPartido() {
		System.out.println("dirigirPartido (Clase Hija)");
	}

	public void dirigirEntrenamiento() {
		System.out.println("dirigirEntrenamiento (Clase Hija)");
	}

	public String getIdFederacion() {
		return idFederacion;
	}

	public void setIdFederacion(String idFederacion) {
		this.idFederacion = idFederacion;
	}
	
	
}

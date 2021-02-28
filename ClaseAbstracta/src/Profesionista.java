
public abstract class Profesionista {
	String nombre;
	String app;
	String cedula;
	String universidad;
	
	public Profesionista() {}

	public Profesionista(String nombre, String app, String cedula, String universidad) {
		this.nombre = nombre;
		this.app = app;
		this.cedula = cedula;
		this.universidad = universidad;
	}
	//Metodo no abstracto
	public void cobrar(String tipo, double cantidad) {
		System.out.println("Me pagó "+cantidad+" en "+tipo);
	}
	
	//metodo abstracto
	
	public abstract void trabajar();

	@Override
	public String toString() {
		return "Profesionista [nombre=" + nombre + ", app=" + app + ", cedula=" + cedula + ", universidad="
				+ universidad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApp() {
		return app;
	}

	public void setApp(String app) {
		this.app = app;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getUniversidad() {
		return universidad;
	}

	public void setUniversidad(String universidad) {
		this.universidad = universidad;
	}
	
	
	
}


public class IngSistemas extends Profesionista {
	String lenguaje;
	String framework;
	
	public void IngSistemas() {
		
	}
	
	
	
	public IngSistemas(String nombre, String app, String cedula, String universidad, String lenguaje,
			String framework) {
		super(nombre, app, cedula, universidad);
		this.lenguaje = lenguaje;
		this.framework = framework;
	}



	
	public String getLenguaje() {
		return lenguaje;
	}



	public void setLenguaje(String lenguaje) {
		this.lenguaje = lenguaje;
	}



	public String getFramework() {
		return framework;
	}



	public void setFramework(String framework) {
		this.framework = framework;
	}



	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Viendo videos en youtbe");
	}
	
	public void programando() {
		System.out.println("Hola Mundo");
	}
}

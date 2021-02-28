
public class Caballo extends Animal{
	String raza;
	int velocidad;
	
	public Caballo() {
		
	}
	
	
	public Caballo(String nombre, String tipo, String categoriaAlimento, int patas, String raza, int velocidad) {
		super(nombre, tipo, categoriaAlimento, patas);
		this.raza = raza;
		this.velocidad = velocidad;
	}




	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("Los caballos relinchan");
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public int getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public String toString() {
		return "Caballo [raza=" + raza + ", velocidad=" + velocidad + "]";
	}
	
	
	
	
}

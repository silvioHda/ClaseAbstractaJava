
public class Perro extends Animal{
	String raza;
	String numeroDueno;
	
	public Perro() {
		
	}
	
	
	public Perro(String nombre, String tipo, String categoriaAlimento, int patas, String raza, String numeroDueno) {
		super(nombre, tipo, categoriaAlimento, patas);
		this.raza = raza;
		this.numeroDueno = numeroDueno;
	}



	@Override
	public void sonido() {
		// TODO Auto-generated method stub
		System.out.println("los perros ladran");
	}


	public String getRaza() {
		return raza;
	}


	public void setRaza(String raza) {
		this.raza = raza;
	}


	public String getNumeroDueno() {
		return numeroDueno;
	}


	public void setNumeroDueno(String numeroDueno) {
		this.numeroDueno = numeroDueno;
	}


	@Override
	public String toString() {
		return "Perro [raza=" + raza + ", numeroDueno=" + numeroDueno + "]";
	}
	
	
	
}

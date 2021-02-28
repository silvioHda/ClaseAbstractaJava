
public abstract class Animal {
	String nombre;
	String tipo;
	String categoriaAlimento;
	int patas;
	
	public Animal() {
		
	}
	
	public Animal(String nombre, String tipo, String categoriaAlimento, int patas) {
		this.nombre = nombre;
		this.tipo = tipo;
		this.categoriaAlimento = categoriaAlimento;
		this.patas = patas;
	}
	
	public abstract void sonido();
	
	public void comer() {
		System.out.println("Esta comiendo");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getCategoriaAlimento() {
		return categoriaAlimento;
	}

	public void setCategoriaAlimento(String categoriaAlimento) {
		this.categoriaAlimento = categoriaAlimento;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}

	@Override
	public String toString() {
		return "Animal [nombre=" + nombre + ", tipo=" + tipo + ", categoriaAlimento=" + categoriaAlimento + ", patas="
				+ patas + "]";
	}
	
	
	
	
}

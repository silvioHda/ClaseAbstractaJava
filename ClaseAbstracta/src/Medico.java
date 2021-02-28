
public class Medico extends Profesionista{
	String colorBata;
	String tipoM;
	
	public Medico() {
		
	}
	
	
	
	public Medico(String nombre, String app, String cedula, String universidad, String colorBata, String tipoM) {
		super(nombre, app, cedula, universidad);
		this.colorBata = colorBata;
		this.tipoM = tipoM;
	}


	@Override
	public void trabajar() {
		// TODO Auto-generated method stub
		System.out.println("Dando paracetamol");
	}
	
	public void consultando() {
		System.out.println("Haciendo consulta");
	}



	public String getColorBata() {
		return colorBata;
	}



	public void setColorBata(String colorBata) {
		this.colorBata = colorBata;
	}



	public String getTipoM() {
		return tipoM;
	}



	public void setTipoM(String tipoM) {
		this.tipoM = tipoM;
	}



	@Override
	public String toString() {
		return "Medico [colorBata=" + colorBata + ", tipoM=" + tipoM + "]";
	}
	
	
	
	
}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Medico med = new Medico("Gregory","House","med1","Buap","Negro","Urgenciologo");
		System.out.println(med);
		med.cobrar("Efectivo", 3000);
		med.trabajar();
		med.consultando();
		
		IngSistemas ing = new IngSistemas("Mark","Zurkenberg","sis01","Harvard","PHP","Laravel");
		System.out.println(ing);
		ing.cobrar("Nomina", 15000);
		ing.trabajar();
		ing.programando();*/
		
		Perro p = new Perro("tyson","mamifero","carnivoro",4,"Labrador","2881157128");
		Caballo c = new Caballo("Polvora","mamifero","herbivoro",4,"alazan",40);
		p.comer();
		p.sonido();
		c.comer();
		c.sonido();
	}

}

package zooAnimales;
import gestion.Zona;

public class Animal {
	private static int totalAnimales;
	private String nombre;
	private int edad;
	private String habitat;
	private String genero;
	private Zona zonas;
	
	public Animal() {
		Animal.totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero, Zona zonas) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		this.zonas = zonas;
		Animal.totalAnimales++;
	}
	
	public Animal(String nombre, int edad, String habitat, String genero) {
		this.nombre = nombre;
		this.edad = edad;
		this.habitat = habitat;
		this.genero = genero;
		Animal.totalAnimales++;
	}
	
	public String movimiento() {
		return "desplazarse";
	}
	
	public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos()+'\n'+
				"Aves: "+ Ave.cantidadAves()+ '\n' +
				"Retiles: "+ Reptil.cantidadReptiles()+ '\n' +
				"Peces: "+ Pez.cantidadPeces()+ '\n' +
				"Anfibios: "+ Anfibio.cantidadAnfibios();
	}
	
	@Override
	public String toString() {
		 if (this.zonas == null) {
             return "Mi nombre es " + this.nombre +
                     ", tengo una edad de " + this.edad +
                     ", habito en " + this.habitat +
                     " y mi genero es " + this.genero;
        }
        else{
             return "Mi nombre es " + this.nombre +
                     ", tengo una edad de " + this.edad +
                     ", habito en " + this.habitat +
                     " y mi genero es " + this.genero +
                     ", la zona en la que me ubico es " + this.zonas +
                     ", en el " + this.zonas.getZoo();
        }
	}

	public static int getTotalAnimales() {
		return totalAnimales;
	}

	public static void setTotalAnimales(int totalAnimales) {
		Animal.totalAnimales = totalAnimales;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getHabitat() {
		return habitat;
	}

	public void setHabitat(String habitat) {
		this.habitat = habitat;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Zona getZonas() {
		return zonas;
	}

	public void setZonas(Zona zonas) {
		this.zonas = zonas;
	}
	
	
	

}

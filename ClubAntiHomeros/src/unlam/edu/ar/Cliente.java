package unlam.edu.ar;

public class Cliente implements Comparable<Cliente>{
	private String nombre;
	private Integer edad;
	
	public Cliente(String nombre,Integer edad){
		this.nombre=nombre;
		this.edad=edad;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	@Override
	public int compareTo(Cliente otro) {
		// TODO Auto-generated method stub
		return this.nombre.compareTo(otro.getNombre());
	}
}

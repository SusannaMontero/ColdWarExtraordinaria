package Feedback;

public class Jugador {
	//ATRIBUTOS
	protected String nombre;
	protected String tipo;
	
	
	//CONSTRUCTOR
	Jugador(String a, String b){
		this.nombre = a;
		this.tipo = b;
		
	}
	
	//GETTERS
	public String GetNombre(){
		return this.nombre;
	}
	public String GetTipo(){
		return this.tipo;
	}
	
	
	//SETTERS
	public void SetNombre(String nombreDado) {
		this.nombre = nombre;
	}
	public void SetTipo(String tipoDado) {
		this.tipo = tipo;
	}
	
}

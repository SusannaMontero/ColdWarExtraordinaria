package Feedback;

public class Jugador {
	//ATRIBUTOS
	protected String nombre;
	protected String tipo;
	protected int vida;
	protected int misiles;
	protected int defensa;
	protected int ataqueRecibido;
	protected int misilesOriginales;
	
	//CONSTRUCTOR
	Jugador(String a, String b){
		this.nombre = a;
		this.tipo = b;
		this.vida = 200;
		this.misiles = 50;
		this.defensa = 0;
		this.ataqueRecibido = 0;
		
		//Modificamos los datos segun los tipos de planeta seleccionados
		if(b == "Planeta uno") {
			this.SetVida(100);
			this.SetMisiles(10);
			this.misilesOriginales = this.misiles;
		}
		if(b == "Planeta dos") {
			this.SetVida(200);
			this.SetMisiles(20);
			this.misilesOriginales = this.misiles;
		}
		if(b == "Planeta tres") {
			this.SetVida(300);
			this.SetMisiles(30);
			this.misilesOriginales = this.misiles;
		}
		if(b == "Planeta cuatro") {
			this.SetVida(400);
			this.SetMisiles(40);
			this.misilesOriginales = this.misiles;
		}		
	}
	
	//GETTERS
	public String GetNombre(){
		return this.nombre;
	}
	public String GetTipo(){
		return this.tipo;
	}
	public int GetVida(){
		return this.vida;
	}
	public int GetMisiles(){
		return this.misiles;
	}
	public int GetDefensa(){
		return this.defensa;
	}
	public int GetAtaqueRecibido() {
		return this.ataqueRecibido;
	}
	public int GetMisilesOriginales() {
		return this.misilesOriginales;
	}
	
	//SETTERS
	public void SetNombre(String nombreDado) {
		this.nombre = nombre;
	}
	public void SetTipo(String tipoDado) {
		this.tipo = tipo;
	}
	public void SetVida(int vidaDado) {
		this.vida = vidaDado;
	}
	public void SetMisiles(int misilesDado) {
		this.misiles = misilesDado;
	}
	public void SetDefensa(int defensaDado) {
		this.defensa = defensaDado;
	}
	public void SetAtaqueRecibido(int ataqueRecibido) {
		this.ataqueRecibido = ataqueRecibido;
	}
}

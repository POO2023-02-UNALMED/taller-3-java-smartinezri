package taller3.televisores;

public class TV {
		
	Marca marca;
	int canal = 1;
	int precio = 500;
	boolean estado;
	int volumen = 1;
	Control control;
	static int numTV;
		
	public TV(Marca mar, boolean est){
			marca = mar;
			estado = est;
	}
	
	public void setMarca(Marca marca){
		this.marca = marca;
	}
	
	public Marca getMarca(){
		return marca;
	}
	
	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	public int getPrecio() {
		return precio;
	}
	
	public void setVolumen(int volumen) {
		this.volumen = volumen;
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control control) {
		this.control = control;
	}
	
	public void turnOn() {
		estado = true;
	}
	
	public void turnOff() {
		estado = false;
	}
	
	public boolean getEstado() {
		return estado;
	}
	
	public void canalUp() {
		if (canal >= 1 && canal <= 120 && estado == true) {
			canal++;
		}
	}
	
	public void canalDown() {
		if (canal >= 1 && canal <= 120 && estado == true) {
			canal--;
		}
	}
	
	public void volumenlUp() {
		if (volumen >= 0 && volumen <= 7 && estado == true) {
			volumen++;
		}
	}
	
	public void volumenDown() {
		if (volumen >= 0 && volumen <= 7 && estado == true) {
			volumen--;
		}
	}
	
	
	
}

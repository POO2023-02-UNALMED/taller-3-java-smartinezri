package taller3.televisores;

public class TV {
		
	private Marca marca;
	int canal = 1;
	private int precio = 500;
	boolean estado;
	int volumen = 1;
	public Control control;
	public static int numTV = 0;
		
	public TV(Marca mar, boolean est){
		marca = mar;
		estado = est;
		numTV++;
	}
	
	public void setMarca(Marca mar){
		marca = mar;
	}
	
	public Marca getMarca(){
		return marca;
	}	
	
	public void setCanal(int can) {
		if(estado == true && can >= 1 && can <= 120) {
			canal = can;
		}
	}
	
	public int getCanal() {
		return canal;
	}
	
	public void setPrecio(int pre) {
		precio = pre;
	}
	
	public int getPrecio() {
		return precio;
	}

	public void setVolumen(int vol) {
		if(estado == true && vol >= 0 && vol <= 7) {
			volumen = vol;
		}
	}
	
	public int getVolumen() {
		return volumen;
	}
	
	public void setControl(Control con) {
		control = con;
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

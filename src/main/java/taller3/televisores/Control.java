package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.estado = true;
	}
	
	public void turnOff() {
		tv.estado = false;
	}
	
	public void canalUp() {
		if (tv.canal >= 1 && tv.canal <= 120 && tv.estado == true) {
			tv.canal++;
		}
	}
	
	public void canalDown() {
		if (tv.canal >= 1 && tv.canal <= 120 && tv.estado == true) {
			tv.canal--;
		}
	}
	
	public void volumenlUp() {
		if (tv.volumen >= 0 && tv.volumen <= 7 && tv.estado == true) {
			tv.volumen++;
		}
	}
	
	public void volumenDown() {
		if (tv.volumen >= 0 && tv.volumen <= 7 && tv.estado == true) {
			tv.volumen--;
		}
	}
	
	public void setCanal(int canal) {
		if (tv.estado == true && canal >= 1 && canal <= 120 ) {
		tv.canal = canal;
		}
	}
	
	public void setVolumen(int volumen) {
		if (tv.estado == true && volumen >= 0 && volumen <= 7) {
			tv.volumen = volumen;
		}
	}
	
	public void enlazar(TV tele) {
		tv = tele;
		tele.setControl(this);
	}
	
	public void setTv(TV tele) {
		tv = tele;
	}
	
	public TV getTv() {
		return tv;
	}
	
}
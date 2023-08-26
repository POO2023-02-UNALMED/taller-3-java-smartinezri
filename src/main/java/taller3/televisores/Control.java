package taller3.televisores;

public class Control {
	private TV tv;
	
	public void turnOn() {
		tv.turnOn();
	}
	
	public void turnOff() {
		tv.turnOff();
	}
	
	public void canalUp() {
		tv.canalUp();
	}
	
	public void canalDown() {
		tv.canalDown();
	}
	
	public void volumenlUp() {
		tv.volumenlUp();
	}
	
	public void volumenDown() {
		tv.volumenDown();
	}
	
	public void setCanal(int canal) {
		tv.setCanal(canal);
	}
	
	public void setVolumen(int volumen) {
		tv.setVolumen(volumen);
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
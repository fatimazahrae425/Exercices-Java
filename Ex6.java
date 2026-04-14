package tp3;

class Voiture {
	
	private String marque;
	private double vitesse;
	
	public Voiture(String marque) {
		this.marque = marque;
		this.vitesse = 0;
	}
	
	public void accelerer(double v) {
		vitesse += v;
		if (vitesse > 240) {
			vitesse = 240;
		}
	}
	
	public void freiner(double v) {
		vitesse -= v;
		if (vitesse < 0) {
			vitesse = 0;
		}
	}
	
	public String toString() {
		return "Voiture { Marque: " + marque + " | Vitesse: " + vitesse + " }";
	}
}

public class Ex6 {
    public static void main(String[] args) {

        Voiture v = new Voiture("BMW");

        v.accelerer(100);
        v.accelerer(200);
        v.freiner(50);

        System.out.println(v);
    }
}

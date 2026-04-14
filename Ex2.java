package tp3;

class Rectangle {
	
	private double largeur;
	private double hauteur;
	
	public Rectangle(double largeur, double hauteur) {
		this.largeur = largeur;
		this.hauteur = hauteur;
	}
	
	public double surface() {
		return largeur * hauteur;
	}
	
	public double perimetre() {
		return 2 * (largeur + hauteur);
	}
	
	public String toString() {
		return "Rectangle { largeur: " + largeur + " | hauteur: " + hauteur + " }";
	}
}

public class Ex2 {
    public static void main(String[] args) {

        Rectangle r = new Rectangle(5, 3);

        System.out.println(r);
        System.out.println("Surface = " + r.surface());
        System.out.println("Perimetre = " + r.perimetre());
    }
}

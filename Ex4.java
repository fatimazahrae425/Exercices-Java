package tp3;

class NombreComplexe {
	
	private double reel;
	private double imaginaire;
	
	public NombreComplexe(double reel, double imaginaire) {
		this.reel = reel;
		this.imaginaire = imaginaire;
	}
	
	public NombreComplexe addition(NombreComplexe n) {
		return new NombreComplexe(
			this.reel + n.reel,
			this.imaginaire + n.imaginaire
		);
	}
	
	public NombreComplexe multiplication(NombreComplexe n) {
		return new NombreComplexe(
			this.reel * n.reel - this.imaginaire * n.imaginaire,
			this.reel * n.imaginaire + this.imaginaire * n.reel
		);
	}
	
	public String toString() {
		return reel + " + " + imaginaire + "i";
	}
}

public class Ex4 {
    public static void main(String[] args) {

        NombreComplexe n1 = new NombreComplexe(2, 3);
        NombreComplexe n2 = new NombreComplexe(1, 4);

        System.out.println("Somme = " + n1.addition(n2));
        System.out.println("Produit = " + n1.multiplication(n2));
    }
}
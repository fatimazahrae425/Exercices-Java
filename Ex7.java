package tp3;

class Produit {
	
	private int id;
	private String nom;
	private String description;
	private double prix;
	private int quantite;
	
	public Produit(int id, String nom, String description, double prix, int quantite) {
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.quantite = quantite;
	}
	
	public void ajouterProd(int qte) {
		quantite += qte;
	}
	
	public void modifierProd(double prix) {
		this.prix = prix;
	}
	
	public void supprimerProd() {
		quantite = 0;
	}
	
	public String toString() {
		return "Produit { ID: " + id + " | Nom: " + nom + " | Prix: " + prix + " | Qte: " + quantite + " }";
	}
}

public class Ex7 {
    public static void main(String[] args) {

        Produit p = new Produit(1, "parfum", "Dior", 1500, 10);

        p.ajouterProd(5);
        p.modifierProd(7500);
        p.supprimerProd();

        System.out.println(p);
    }
}

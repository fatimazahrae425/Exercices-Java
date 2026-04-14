package tp3;

class CompteBancaire {
	
	private String numero;
	private double solde;
	
	public CompteBancaire(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
	}
	
	public void deposer(double montant) {
		solde += montant;
	}
	
	public void retirer(double montant) {
		if (montant <= solde) {
			solde -= montant;
		}
	}
	
	public void transferer(CompteBancaire c, double montant) {
		if (montant <= solde) {
			solde -= montant;
			c.solde += montant;
		}
	}
	
	public String toString() {
		return "Compte { Numero: " + numero + " | Solde: " + solde + " }";
	}
}

public class Ex5 {
    public static void main(String[] args) {

        CompteBancaire c1 = new CompteBancaire("C1", 1000);
        CompteBancaire c2 = new CompteBancaire("C2", 500);

        c1.deposer(200);
        c1.retirer(100);
        c1.transferer(c2, 300);

        System.out.println(c1);
        System.out.println(c2);
    }
}

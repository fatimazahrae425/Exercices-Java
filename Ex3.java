package tp3;

class Etudiant {
	
	private String cne;
	private double note;
	
	public Etudiant(String cne, double note) {
		this.cne = cne;
		this.note = note;
	}
	
	public boolean estAdmis() {
		return note >= 10;
	}
	
	public String toString() {
		return "Etudiant { CNE: " + cne + " | Note: " + note + " }";
	}
}

public class Ex3 {
    public static void main(String[] args) {

        Etudiant e1 = new Etudiant("A12345", 15.5);
        Etudiant e2 = new Etudiant("B67890", 7.0);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println("e1 est admis ? " + e1.estAdmis());
        System.out.println("e2 est admis ? " + e2.estAdmis());
    }
}
package ma.ens.evaluation1;

public class Ingenieur extends Employe {

	private int niveauExpertise;

	public Ingenieur(String matricule, String nom, double tarifJournalier, int niveauExpertise) {
		super(matricule, nom, tarifJournalier);
		this.niveauExpertise = niveauExpertise;
	}

	@Override
	public double calculerCout(int nbJours) {
		if (niveauExpertise < 3) {
			return this.tarifJournalier * nbJours;
		} else {
			return (this.tarifJournalier*nbJours) * (nbJours + 100);
		}
	}

	@Override
	public String toString() {
		return "Ingenieur  a un niveauExpertise = " + this.niveauExpertise ;
	}

	
	
}

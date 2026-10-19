package ma.ens.evaluation1;

public class Commercial extends Employe {

	private double tauxPrime;

	public Commercial(String matricule, String nom, double tarifJournalier, double tauxPrime) {
		super(matricule, nom, tarifJournalier);
		this.tauxPrime = tauxPrime;
	}

	@Override
	public double calculerCout(int nbJours) {
		double montantBase = this.tarifJournalier * nbJours;
		return montantBase + (montantBase * tauxPrime);
	}

	@Override
	public String toString() {
		return "Commercial a un tauxPrime = " + this.tauxPrime ;
	}

	
}

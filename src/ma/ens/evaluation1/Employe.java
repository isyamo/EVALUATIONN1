package ma.ens.evaluation1;

public abstract class Employe {

	protected String matricule;
	protected String nom;
	protected double tarifJournalier;
	private Employe superieur;

	
	public Employe(String matricule, String nom, double tarifJournalier) {
	
		this.matricule = matricule;
		this.nom = nom;
		this.tarifJournalier = tarifJournalier;
		this.superieur=null;
	}


	public Employe getsuperieur() {
		return superieur;
	}

	public void setsuperieur(Employe superieur) {
		if(superieur!=null && superieur.equals(this)) {
			
			System.out.println(" Un employé peut ne pas être le superieur de lui meme ");
		}
		
		this.superieur=superieur;
	}

	public String getMatricule() {
		return matricule;
	}

	public abstract double calculerCout(int nbJours);

	public void afficherDetails() {

		System.out.println("<<<<<<<<<  >>>>>>>");
		System.out.println(" La matricule est : " + matricule);
		System.out.println(" Le nom est :  " + nom);
		System.out.println(" Le tarif  Journalier est :  " + tarifJournalier);
	}

	@Override
	public String toString() {
		return "Employe matricule=" + matricule + ", nom=" + nom + ", tarifJournalier=" + tarifJournalier;
	}

}

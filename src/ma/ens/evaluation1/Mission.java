package ma.ens.evaluation1;

public class Mission {

	private int nbJours;
	private Employe employe;
	private Projet projet;

	public Mission(int nbJours, Employe employe, Projet projet) {
		
		this.nbJours = nbJours;
		this.employe = employe;
		this.projet = projet;
	}
	
	public double  calculerMontant() {
		
		return this.employe.calculerCout( nbJours)  ;
	}


	public void afficherRecapitulatif() {
		
		System.out.println(" <<<<<<<<< Recapitulatif >>>>>>>>>");
		System.out.println(" Les informations de l’employé : " +this.employe);
		System.out.println(" Les informations du projet : "+ this.projet);
		System.out.println(" La durée de la mission : " + this.nbJours + " jrs");
		System.out.println(" Le montant calculé :  " + this.calculerMontant() + "DH");
		System.out.println(" <<<<<<<<<  >>>>>>>>>");
		
		
	}
	
	
}

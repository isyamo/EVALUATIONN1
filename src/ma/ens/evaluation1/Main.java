package ma.ens.evaluation1;

public class Main {
	public static void main(String[] args) {

		// création de deux ingénieurs et deux commerciaux
		
		Ingenieur ingenieur1 = new Ingenieur("ed2320", "Sabir", 500, 4);
		Ingenieur ingenieur2 = new Ingenieur("dc2320", "dehbi", 350, 3);
		Commercial commercial1 = new Commercial("sa234", "hachimi", 300, 0.10);
		Commercial commercial2 = new Commercial("bf234", "kamilya", 400, 0.15);

		// stockage des employés dans le tableau
		
		Employe[] employe = new Employe[4];
		employe[0] = ingenieur1;
		employe[1] = ingenieur2;
		employe[2] = commercial1;
		employe[3] = commercial2;

		// création de deux projets
		
		Projet projet1 = new Projet("Pr123", "jv");
		Projet projet2 = new Projet("Pr234", "vs");

		// Relations hierarchique

		ingenieur2.setsuperieur(ingenieur1);
		commercial1.setsuperieur(ingenieur1);
		commercial2.setsuperieur(commercial1);

		// Affichage des employes avec leur sup s'il y a

		for (Employe e : employe) {
			e.afficherDetails();
			if (e.getsuperieur() != null) {
				System.out.println(" Le superieur est : " + e.getsuperieur().nom);
			} else {
				System.out.println(" Pas de superieur");
			}
		}

		// Creation de 4 missions
		
		Mission m1 = new Mission(3, ingenieur1, projet1);
		Mission m2 = new Mission(2, ingenieur2, projet2);
		Mission m3 = new Mission(4, commercial1, projet1);
		Mission m4 = new Mission(2, commercial2, projet2);

		// Stockage des missions dans le tableau
		
		Mission[] mission = new Mission[4];
		mission[0] = m1;
		mission[1] = m2;
		mission[2] = m3;
		mission[3] = m4;

		// affichage du récapitulatif de toutes les missions
		
		for (Mission m : mission) {
			m.afficherRecapitulatif();
		}
		
		// Calcule et affichage du montant total de toutes les missions
		double montantTotal =0.0;
		
		for (Mission m : mission) {
			
			montantTotal +=m.calculerMontant();
		}
		
		System.out.println("\n <<<<<<<< Total >>>>>>>>");
		System.out.println("\n Le montant total e toutes les missions : " +montantTotal);
	}

}

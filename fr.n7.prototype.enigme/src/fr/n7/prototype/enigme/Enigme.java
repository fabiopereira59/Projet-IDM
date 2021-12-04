package fr.n7.prototype.enigme;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Enigme {
	
	static String explorateur;
	static String lieucourant;
	static int sac;
	static Scanner scanner;
	static ArrayList<String> connaissances;
	static HashMap<String, Integer[]> objets;
	
	public static void main (String[] args) {
		
		// Creation du scanner pour pouvoir jouer en ligne de commande
		scanner = new Scanner(System.in);
		// Creation de l'explorateur
		explorateur = args[0];
		sac = 10;
		connaissances = new ArrayList<String>();
		objets = new HashMap<String, Integer[]>();
		
		// Creation des lieux
		ArrayList<String> lieux = new ArrayList<String>();
		String lieudebut = "Enigme";
		lieux.add(lieudebut);
		lieucourant = lieudebut;
		String lieufin1 = "Succes";
		lieux.add(lieufin1);
		String lieufin2 = "Echec";
		lieux.add(lieufin2);
		
		// Creation des objets de l'explorateur
		String tentative = "tentative";
		int quantite_tentative = 3;
		int taille_tentative = 1;
		Integer[] info_tentative = new Integer[2];
		info_tentative[0] = quantite_tentative;
		info_tentative[1] = taille_tentative;
		objets.put(tentative, info_tentative);
		sac -= quantite_tentative*taille_tentative;
		
		// Creation des personnes
		String personne1 = "Sphinx";
		String personne1_interaction = "Bienvenue jeune âme, bienvenue dans mon repère, que puis-je faire pour vous ?";
		String[] personne1_interaction_choix_tab = new String[2];
		personne1_interaction_choix_tab[0] = "Lui demander le chemin vers le succès";
		personne1_interaction_choix_tab[1] = "Lui demander le chemin vers l'échec";
		
		// Creation des conditions
		Boolean sphinxobligatoire = true;
		Boolean cheminsuccesobligatoire = true;
		Boolean cheminsuccesvisible = false;
		Boolean cheminechecvisible = false;
		Boolean sphinxvisible = true;
		
		// Association personnes et lieux
		HashMap<String, Boolean[]> personnes_lieudebut = new HashMap<String, Boolean[]>();
		HashMap<String, String> personnes_lieudebut_interactions = new HashMap<String, String>();
		HashMap<String, String[]> personnes_lieudebut_choix = new HashMap<String, String[]>();
		personnes_lieudebut_interactions.put(personne1, personne1_interaction);
		personnes_lieudebut_choix.put(personne1, personne1_interaction_choix_tab);
		Boolean[] personne1_conditions = new Boolean[2];
		personne1_conditions[0] = sphinxvisible; 
		personne1_conditions[1] = sphinxobligatoire;
		personnes_lieudebut.put(personne1, personne1_conditions);
		
		// On démarre le jeu
		demarrerlieudebut(personnes_lieudebut, personnes_lieudebut_interactions, personnes_lieudebut_choix);
		Boolean stop = false;
		while (!stop) {
			jouer(connaissances, objets, lieux, stop, personnes_lieudebut);
		}
		
	}
	
	public static void afficherOptions() {
		System.out.println("Afficher le lieu courant : 1");
		System.out.println("Afficher le nom de l'explorateur : 2");
		System.out.println("Afficher les informations sur les connaissances de l'explorateur : 3");
		System.out.println("Afficher les informations sur les objets de l'explorateur : 4");
		System.out.println("Afficher la capacité de stockage disponible de l'explorateur : 5");
		System.out.println("Abandonner la partie... : 6");
		System.out.println("Afficher les personnes visibles du lieu courant : 7");
	}
	
	public static void jouer(ArrayList<String> connaissances, HashMap<String, Integer[]> objets, ArrayList<String> lieux, Boolean stop, HashMap<String, Boolean[]> personnes_lieucourant) {
		System.out.println();
		System.out.println("Que voulez vous-faire ? - Indiquer le numéro correspond à l'action désirée");
		afficherOptions();
		int option = -1;
		Boolean choix = false;
		while (!choix) {
			try {
				option = scanner.nextInt();
				if (option > 7) {
					choix = false;
					System.out.println("Veuillez écrire un nombre qui est proposé !");
				} else {
					choix = true;
				}
			} catch (Exception e) {
				System.out.println("Veuillez écrire un nombre qui est proposé !");
				scanner.nextLine();
			}
		}
		if (option == 1) {
			System.out.println("-- Voici le lieu dans lequel vous vous trouvez --");
			System.out.println(lieucourant);
		} else if (option == 2) {
			System.out.println("-- Mince, j'ai oublié mon nom, c'était quoi déjà... --");
			System.out.println(explorateur);
		} else if (option == 3) {
			for (String x : connaissances) {
				System.out.println("-- Voici les connaissances que vous possédez --");
				System.out.println(x);
			}
		} else if (option == 4) {
			for (Map.Entry<String, Integer[]> x : objets.entrySet()) {
				System.out.println(x.getKey() + " : quantité = " + x.getValue()[0] + "; taille unitaire = " + x.getValue()[1]);
			}
		} else if (option == 5) {
			System.out.println("Il vous reste " + sac + " slots");
		} else if (option == 6) {
			System.out.println("Partie abandonnée...");
			stop = true;
		} else if (option == 7) {
			System.out.println("-- Voici les personnes visibles du lieu courant --");
			for (Map.Entry<String, Boolean[]> x : personnes_lieucourant.entrySet()) {
				// Indice 0 pour visible de maniere arbitraire
				if (x.getValue()[0] == true) {
					System.out.println(x.getKey());
				}
			}
		}
	}
	
	public static void demarrerlieudebut(HashMap<String, Boolean[]> personnes_lieudebut, HashMap<String, String> personnes_lieudebut_interactions, HashMap<String, String[]> personnes_lieudebut_choix) {
		for (Map.Entry<String, Boolean[]> x : personnes_lieudebut.entrySet()) {
			// Indice 1 pour obligatoire de maniere arbitraire
			if (x.getValue()[1] == true) {
				System.out.println(personnes_lieudebut_interactions.get(x.getKey()));
				interagirsphinx(personnes_lieudebut_choix.get(x.getKey()));
			}
		}
	}
	
	public static void interagirsphinx(String[] choix) {
		int compteur = 0;
		for (String x : choix) {
			System.out.println(x + " - " + compteur);
			compteur += 1;
		}
		Boolean selection = false;
		int option = -1;
		while (!selection) {
			try {
				option = scanner.nextInt();
				if (option > choix.length) {
					selection = false;
					System.out.println("Veuillez écrire un nombre qui est proposé !");
				} else {
					selection = true;
				}
			} catch (Exception e) {
				System.out.println("Veuillez écrire un nombre qui est proposé !");
				scanner.nextLine();
			}
		}
		if (option == 0) {
			connaissances.add("reussite");
			System.out.println("Vous avez acquis une nouvelle connaissance : reussite");
		} else {
			Integer[] donnees_objets = new Integer[2];
			donnees_objets[0] = objets.get("tentative")[0] - 1;
			donnees_objets[1] = objets.get("tentative")[1];
			objets.replace("tentative", donnees_objets);
			System.out.println("Voyons, soyez plus ambitieux...");
			System.out.println("Vous avez perdu " + 1 + " objet tentative");
		}
	}
}

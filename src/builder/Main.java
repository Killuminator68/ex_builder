package builder;




    	

    	public class Main {
    	    public static void main(String[] args) {
    	        // Création d'un constructeur de sandwich
    	        IConstructeurSandwich constructeur = new FabriqueSandwich();
    	        Directeur directeur = new Directeur(constructeur);

    	        // Premier sandwich
    	        directeur.fabriquerSandwich("Complet", "Dinde", "Suisse", "Laitue", "Mayonnaise");
    	        Sandwich sandwich1 = directeur.getSandwich();
    	        System.out.println("Sandwich 1 :");
    	        System.out.println("Pain: " + sandwich1.getPain());
    	        System.out.println("Viande: " + sandwich1.getViande());
    	        System.out.println("Fromage: " + sandwich1.getFromage());
    	        System.out.println("Légumes: " + sandwich1.getLegumes());
    	        System.out.println("Condiments: " + sandwich1.getCondiments());

    	        // Deuxième sandwich
    	        directeur.fabriquerSandwich("Blanc", "Jambon", "Américain", "Tomate", "Moutarde");
    	        Sandwich sandwich2 = directeur.getSandwich();
    	        System.out.println("\nSandwich 2 :");
    	        System.out.println("Pain: " + sandwich2.getPain());
    	        System.out.println("Viande: " + sandwich2.getViande());
    	        System.out.println("Fromage: " + sandwich2.getFromage());
    	        System.out.println("Légumes: " + sandwich2.getLegumes());
    	        System.out.println("Condiments: " + sandwich2.getCondiments());
    	    }
    	}

      
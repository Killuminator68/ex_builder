package builder;


	public interface IConstructeurSandwich {
	    void typeDePain(String pain);
	    void typeDeViande(String viande);
	    void typeDeFromage(String fromage);
	    void ajouterLegume(String legume);
	    void ajouterCondiment(String condiment);
	    Sandwich construire();
	}


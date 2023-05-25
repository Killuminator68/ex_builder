package builder;

public class Directeur {
    private IConstructeurSandwich constructeur;

    public Directeur(IConstructeurSandwich constructeur) {
        this.constructeur = constructeur;
    }

    public void fabriquerSandwich(String pain, String viande, String fromage, String legume, String condiment) {
        constructeur.typeDePain(pain);
        constructeur.typeDeViande(viande);
        constructeur.typeDeFromage(fromage);
        constructeur.ajouterLegume(legume);
        constructeur.ajouterCondiment(condiment);
    }

    public Sandwich getSandwich() {
        return constructeur.construire();
    }
}


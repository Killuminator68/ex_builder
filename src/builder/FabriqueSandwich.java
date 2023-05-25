package builder;

public class FabriqueSandwich implements IConstructeurSandwich {
    private Sandwich sandwich;

    public FabriqueSandwich() {
        this.sandwich = new Sandwich();
    }

    public void typeDePain(String pain) {
        sandwich.setPain(pain);
    }

    public void typeDeViande(String viande) {
        sandwich.setViande(viande);
    }

    public void typeDeFromage(String fromage) {
        sandwich.setFromage(fromage);
    }

    public void ajouterLegume(String legume) {
        sandwich.getLegumes().add(legume);
    }

    public void ajouterCondiment(String condiment) {
        sandwich.getCondiments().add(condiment);
    }

    public Sandwich construire() {
        return sandwich;
    }
}


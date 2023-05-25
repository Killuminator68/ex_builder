package builder;



import java.util.ArrayList;
import java.util.List;

public class Sandwich {
    private String pain;
    private String viande;
    private String fromage;
    private List<String> legumes = new ArrayList<>();
    private List<String> condiments = new ArrayList<>();

    // Les getters
    public String getPain() {
        return this.pain;
    }

    public String getViande() {
        return this.viande;
    }

    public String getFromage() {
        return this.fromage;
    }

    public List<String> getLegumes() {
        return this.legumes;
    }

    public List<String> getCondiments() {
        return this.condiments;
    }

    // Les setters
    public void setPain(String pain) {
        this.pain = pain;
    }

    public void setViande(String viande) {
        this.viande = viande;
    }

    public void setFromage(String fromage) {
        this.fromage = fromage;
    }

    public void setLegumes(List<String> legumes) {
        this.legumes = legumes;
    }

    public void setCondiments(List<String> condiments) {
        this.condiments = condiments;
    }
}

public class lotissement implements GestionPropriete {
    protected propriete[] tabProp;
    protected int nombre;

    public lotissement(int capacite) {
        this.tabProp = new propriete[capacite];
        this.nombre = 0;
    }

    public propriete getProprieteByIndex(int i) {
        if (i >= 0 && i < nombre) {
            return tabProp[i];
        }
        return null;
    }

    public int getnbPieces() {
        int nb = 0;
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i] instanceof ProprietePrivee) {
                nb += ((ProprietePrivee) tabProp[i]).getnbPieces();
            }
        }
        return nb;
    }

    
    public boolean ajouter(propriete p) {
        if (nombre < tabProp.length) {
            tabProp[nombre] = p;
            nombre++;
            return true;
        } else {
            System.out.println("Ajout échoué : Lotissement plein.");
            return false;
        }
    }

    public boolean supprimer(propriete p) {
        for (int i = 0; i < nombre; i++) {
            if (tabProp[i].equals(p)) {
                for (int j = i; j < nombre - 1; j++) {
                    tabProp[j] = tabProp[j + 1];
                }
                tabProp[nombre - 1] = null; 
                nombre--;
                return true;
            }
        }
        System.out.println("Suppression échouée : Propriété non trouvée.");
        return false;
    }

    public void afficherProprietes() {
        System.out.println("Détails des propriétés dans le lotissement :");
        for (int i = 0; i < nombre; i++) {
            System.out.println(tabProp[i].toString() + ", Impôts : " + tabProp[i].calculImpot() + " DT");
        }
    }
}
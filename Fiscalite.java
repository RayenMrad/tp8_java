public class Fiscalite {
    public static void main(String[] args) {

        personne p1 = new personne(11111111, "Ali", "Ben Salah");
        personne p2 = new personne(22222222, "Ahmed", "Gharbi");
        personne p3 = new personne(33333333, "Salma", "Zouari");

        lotissement lotissement = new lotissement(10);

       lotissement.ajouter(new ProprietePrivee(1,"Corniche",350,p1,4));
        lotissement.ajouter(new Villa(2,"Dar Chaabane",400,p2,6,true));
        lotissement.ajouter(new Appartement(3,"Hammamet",1200,p2,8,3));
        lotissement.ajouter(new ProprieteProfessionnelle(4, "Korba", 1000,p3,50, true));
        lotissement.ajouter(new ProprieteProfessionnelle(5,"Bir Bouragba", 2500, p1,400, false));

        System.out.println("Liste des propriétés dans le lotissement avec les impôts :");
        for (int i = 0; i < lotissement.nombre; i++) {
            propriete propriete = lotissement.tabProp[i];
            System.out.println(propriete.toString() + ", Impôts : " + propriete.calculImpot() + " DT");
        }

        int totalPieces = 0;
        for (int i = 0; i < lotissement.nombre; i++) {
            if (lotissement.tabProp[i] instanceof ProprietePrivee) {
                totalPieces += ((ProprietePrivee) lotissement.tabProp[i]).getnbPieces();
            }
        }
        System.out.println("Nombre global des pièces dans le lotissement : " + totalPieces);

        ProprietePrivee proprieteMoinsImpots = null;
        for (int i = 0; i < lotissement.nombre; i++) {
            if (lotissement.tabProp[i] instanceof ProprietePrivee) {
                ProprietePrivee proprietePrivee = (ProprietePrivee) lotissement.tabProp[i];
                if (proprieteMoinsImpots == null || proprietePrivee.calculImpot() < proprieteMoinsImpots.calculImpot()) {
                    proprieteMoinsImpots = proprietePrivee;
                }
            }
        }
        if (proprieteMoinsImpots != null) {
            System.out.println("Propriété privée avec le moins d’impôts :");
            System.out.println("Propriétaire : " + proprieteMoinsImpots.getResponsable());
            System.out.println("Montant des impôts : " + proprieteMoinsImpots.calculImpot() + " DT");
        }

        for (int i = 0; i < lotissement.nombre; i++) {
            if (lotissement.tabProp[i] instanceof Appartement &&
                lotissement.tabProp[i].getAdresse().equals("Hammamet")) {

                for (int j = i; j < lotissement.nombre - 1; j++) {
                    lotissement.tabProp[j] = lotissement.tabProp[j + 1];
                }
                lotissement.tabProp[lotissement.nombre - 1] = null;
                lotissement.nombre--;
                break;
            }
        }

        System.out.println("Liste des propriétés dans le lotissement après suppression de l'appartement de Hammamet :");
        for (int i = 0; i < lotissement.nombre; i++) {
            System.out.println(lotissement.tabProp[i].toString() + ", Impôts : " + lotissement.tabProp[i].calculImpot() + " DT");
        }
    }
}

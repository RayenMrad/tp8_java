public class Appartement extends ProprietePrivee {
    public int numEtage;

     public Appartement (int id,String adresse,double surface ,personne responsable, int nbPieces,int numEtage){
        super(id,adresse,surface ,responsable,nbPieces);
        this.numEtage=numEtage;
    }

     public String toString() {
        return  super.toString() +" numEtage :" + numEtage;
 
    }
}

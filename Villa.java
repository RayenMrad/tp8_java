public class Villa extends ProprietePrivee{
    public boolean avecPicine;

    public Villa (int id,String adresse,double surface ,personne responsable, int nbPieces,boolean avecPicine){
        super(id,adresse,surface ,responsable,nbPieces);
        this.avecPicine=avecPicine;
    }

    public String toString() {
        return  super.toString() +" avecPiscine : " + (avecPicine ? "oui" : "non");
 
    }
    public double calculImpot(){
        if(this.avecPicine){
            return super.calculImpot()+200;
        }
        return super.calculImpot();
    }


}
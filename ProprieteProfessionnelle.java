public  class ProprieteProfessionnelle extends propriete {
    public int nbEmployes;
    public boolean estEtatique;

     public ProprieteProfessionnelle (int id,String adresse,double surface ,personne responsable, int nbEmployes,boolean estEtatique){
        super(id,adresse,surface ,responsable);
        this.nbEmployes=nbEmployes;
        this.estEtatique=estEtatique;
    }

    public String toString(){
        return (super.toString()+" NbEmploye : "+this.nbEmployes+" estEtatique : "+this.estEtatique);
    }


    public double calculImpot(){
        if(this.estEtatique){
            return ((this.surface/100)*100+(this.nbEmployes*30));
        }
        return 0;
    }



  
}

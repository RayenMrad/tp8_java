public  class ProprietePrivee extends propriete {
    public int nbPieces;
    public ProprietePrivee (int id,String adresse,double surface ,personne responsable, int nbPieces){
        super(id,adresse,surface ,responsable);
        this.nbPieces=nbPieces;
    }

    public String toString(){
        return (super.toString()+" Nbpiece : "+this.nbPieces);
    }

    public double calculImpot(){
        return (this.surface/100)*50+(this.nbPieces)*10;
    }

    int getnbPieces(){
        return nbPieces;
    }
}

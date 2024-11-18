public abstract class  propriete {
    protected int id;
    protected personne responsable;
    protected String adresse;
    protected double surface;



    public propriete (int id,String adresse,double surface ,personne responsable){
        this.id =id;
        this.adresse=adresse;
        this.surface=surface;
        this.responsable=responsable;

    }

    public String toString(){
        return "id : "+this.id+" adresse : "+this.adresse+"surface : "+this.surface+" responsable : "+this.responsable;
    }

    public abstract double calculImpot();

    public int getId(){
        return id;
    }

    public personne getResponsable(){
        return responsable;
    }

    public String getAdresse(){
        return adresse;
    }

    public double getSurface(){
        return surface;
    }
}



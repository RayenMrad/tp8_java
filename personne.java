public class personne {
    protected int cin;
    protected String nom;
    protected String prenom;



    public personne(int c,String n,String p){
        this.cin=c;
        this.nom=n;
        this.prenom=p;
    }

    void setNom(String n){
        this.nom=n;
    }
    void setPrenom(String p){
        this.prenom=p;
    }
    void setCin(int c){
        this.cin=c;
    }

    int getCin(){
        return cin;
    }
    String getPrenom(){
        return prenom;
    }
    String getNom(){
        return nom;
    }

    public String toString(){
        return "Cin : "+this.cin+" Nom : "+this.nom+" Prenom : "+this.prenom;
    }


    
}



public class Chercheur {
    String nom,post;
    int numOrdinateur;
    public static int nombreDeChercheur;


    public Chercheur(String nom, String post, int numOrdinateur) {
        this.nom = nom;
        this.post = post;
        this.numOrdinateur = numOrdinateur;
        nombreDeChercheur++;
    }

    public Chercheur() {
        nombreDeChercheur++;
    }
    public void aff(){
        System.out.println("la nom est "
                +"post "+post
                +" num de ordianateur est  "+numOrdinateur
                );
    }
    public boolean comparer(Chercheur  ch){
        return ch.numOrdinateur==numOrdinateur&& ch.nom==nom&& ch.post==post;
    }
}

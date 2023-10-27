public class Adress {
    String gouvrmorat, ville;
    int codePostal;
    public void aff(){
        System.out.println("l'address est "
        +"gouvremorat "+gouvrmorat
        +" ville est "+ville
        +"code postal est :"+codePostal);
    }

    public Adress(String gouvrmorat, String ville, int codePostal) {
        this.gouvrmorat = gouvrmorat;
        this.ville = ville;
        this.codePostal = codePostal;
    }

    public Adress() {
    }
}

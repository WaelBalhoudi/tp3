public class Test {
    public static void main(String[] args) {
        Adress adress1=new Adress();
        adress1.codePostal=9122;
        adress1.gouvrmorat="sid bouzid";
        adress1.ville="Sabala";
        adress1.aff();
        adress1.codePostal=1250;
        System.out.println("la obiet modifé est ");
        adress1.aff();
        Adress adress2=new Adress("Gasrine ","sbitla ",1250);
        adress2.ville="Aloune";
        adress2.aff();
        Chercheur chercheur1=new Chercheur();
        chercheur1.nom="bourak";
        chercheur1.post="developpeur";
        chercheur1.numOrdinateur=3;
        chercheur1.aff();
        Chercheur chercheur2=new Chercheur("wael ","informatique",12);
        chercheur2 .aff();
        System.out.println("le nombre de chercheur est "+Chercheur.nombreDeChercheur);
        chercheur1.numOrdinateur=5;
        Chercheur chercheur3=new Chercheur();
        chercheur3.nom="hazar";
        chercheur3.post="informatique";
        chercheur3.numOrdinateur=6;
        Bureau bureau1=new Bureau();
        bureau1.code=123;
        bureau1.nom="bureau de developpeur ";
        bureau1.chercheurs[0]=chercheur1;
        bureau1.chercheurs[1]=chercheur2;
        bureau1.chercheurs[2]=chercheur3;
        Bureau bureau2=new Bureau();
        bureau2.code=456;
        bureau2.nom="bureau de résou ";
        bureau2.chercheurs[0]=chercheur1;
        bureau2.chercheurs[1]=chercheur2;
        bureau2.chercheurs[2]=chercheur3;

        Laboratoire laboratoire=new Laboratoire();
        laboratoire.adress=adress2;
        laboratoire.nom="laboratoire de "+laboratoire.adress.ville;
        laboratoire.spacilate="informatique";
        laboratoire.adress=adress1;
        laboratoire.nombreBureau=2;
        laboratoire.bureaus[0]=bureau2;
        laboratoire.bureaus[1]=bureau1;
       laboratoire.aff();
        System.out.println("la adress de laboltoire");
        laboratoire.adress.aff();
        for (int i = 0; i < 2; i++) {
            System.out.println("la donner de bureau "+(i+1)+"est ");
            laboratoire.bureaus[i].aff();
            for (int j = 0; j <3; j++) {
                laboratoire.bureaus[i].chercheurs[j].aff();
            }
        }
    };


}

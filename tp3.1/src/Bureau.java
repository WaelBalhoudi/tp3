public class Bureau {
    int code ;
    String nom;
    Chercheur[] chercheurs=new Chercheur[5];
    public void aff(){
        System.out.println(
                "le code de bureau est "+code
                +"le nom de bureau est  "+nom
        );
    }


}

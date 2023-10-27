import javax.swing.plaf.basic.BasicGraphicsUtils;

public class Laboratoire {
    String nom,spacilate;
    int nombreBureau;
    Adress adress;
    Bureau[] bureaus=new Bureau[50];
    public void  aff(){
        System.out.println(
                "le nom de laboratoire "+nom
                +"spacilaté est "+spacilate
                +"nombre de bureau est "+nombreBureau
        );
    }

}

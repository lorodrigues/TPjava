import java.util.ArrayList;
public class Traitement {
    public static void main(String[] args) {

        ArrayList<Produit> prod = new ArrayList<Produit>();

        Produit prod1 = new Produit(1, "gant", 45,8,75 );
        Produit prod1 = new Produit(2, "masque", 75,6, 54);

        prod.add(prod1);
        System.out.println("La valeur du produit est : " +prod1.calculerValeurStock());
        System.out.println("la quantite a t'elle ete atteinte " +prod1.Alerte());
        System.out.println(prod1.Donnees());

    }
}

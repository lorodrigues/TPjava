public class Produit {

    private int code;
    private String nom;
    private int quantite;
    private float prix;
    private int stockSecu;

    public Produit(int code, String name, int quantite, float prix, int stockSecu) {
        this.code = code;
        this.nom = nom;
        this.quantite = quantite;
        this.prix = prix;
        stockSecu = stockSecu;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public float getPrix() {
        return prix;
    }

    public void setPrix(float prix) {
        this.prix = prix;
    }

    public int getStockSecu() {
        return stockSecu;
    }

    public void setStockSecu(int stockSecu) {
        stockSecu = stockSecu;
    }
    public void MajApprovi(int stockSecu) {
        stockSecu += approvi;
    }
    public void MajVente(int stockSecu) {
        this.quantite += nbVente;
    }
    public double calculerValeurStock(){

        return this.quantite * this.prixU;
    }

    public boolean Alerte () {
        if (this.quantite <= this.stockSecu) 
            System.out.println("Attention quantite en stock a atteint le stock de secruite");
            return true;
        }
    public void Donnees(){
        System.out.println("Le Code produit : " +code);
        System.out.println("Le nom du  produit : " +nom);
        System.out.println("Le quantite du produit : " +quantite);
        System.out.println("Le prix a l unite du produit : " +prixU);
        System.out.println("Le stock de securite du produit : " +stockSecu);

    }
    
    }

}





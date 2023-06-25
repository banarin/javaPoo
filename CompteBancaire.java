public class CompteBancaire {
    //creation des atributs
    static int numComptes;
    static double sold;
     //creation du construicteur
    CompteBancaire(int numComptes, double sold) {
        this.numComptes = numComptes;
        this.sold = sold;
    }
    //creation de la methode depot
    public void depot(){
        System.out.println("j'ai fait un depot");
    }
        //creation de la methode retrait
    public void retrait() {
        System.out.println("j'ai fait un retrait");
    }
}

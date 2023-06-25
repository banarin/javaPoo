public class Chien {
    //creation des atributs
    String race;
    double poid;
    double taille;
    //creation du construicteur
    Chien(String race, double poid, double taille)
    {
        this.race = race;
        this.poid = poid;
        this.taille = taille;
    }
     //creation de la methode Aboyer
    public void Aboyer(){
        System.out.println("j'aboit");
    }
     //creation de la methode Info_Chien
    public void Info_chien()
    {
        System.out.println("je suis de race: " + race +"\navec un poid: " + poid + "\net une taille: " + taille);
    }
}
